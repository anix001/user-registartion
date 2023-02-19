package com.example.demo.registration;

public interface RegistrationService {
    String register(RegistrationRequest request);
    String confirmToken(String token);


}
