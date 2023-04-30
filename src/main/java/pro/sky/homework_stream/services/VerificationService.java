package pro.sky.homework_stream.services;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import pro.sky.homework_stream.exceptions.WrongFirstNameException;
import pro.sky.homework_stream.exceptions.WrongLastNameException;

@Service
public class VerificationService {
    public String verificationFirstName(String firstName){
        if(StringUtils.isAlpha(firstName)){
            throw new WrongFirstNameException();
        }
        return StringUtils.capitalize(firstName.toLowerCase());
    }

    public String verificationLastName(String lastName){
        if(StringUtils.isAlpha(lastName)){
            throw new WrongLastNameException();
        }
        return StringUtils.capitalize(lastName.toLowerCase());
    }
}
