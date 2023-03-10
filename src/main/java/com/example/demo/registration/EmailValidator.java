package com.example.demo.registration;

import org.springframework.stereotype.Service;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        //TODO: Regex to validate email
        boolean result = true;
        try{
            InternetAddress emailAddress = new InternetAddress(s);
            emailAddress.validate();
        }catch (AddressException ex){
            result = false;
        }
        return result;
    }
}
