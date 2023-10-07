package org.example;
import java.lang.String;

public abstract class Vehicle {
    private String RegistrationNumber;
    private int OwnerId;
    //Setter
    public String setRegistrationNumber(String registrationNumber){
        RegistrationNumber=registrationNumber;
        return registrationNumber;
    }
    public int setOwnerId(int ownerId){
        OwnerId= ownerId;
        return ownerId;
    }
    //Getter
    public String getRegistrationNumber(String registrationNumber){
        return registrationNumber;
    }
    public int getOwnerId(int ownerId){
        return ownerId;
    }
}
