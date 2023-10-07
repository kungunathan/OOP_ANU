package org.example;
import java.lang.String;

public abstract class Person {
    int PeronId;
    String Name;
    String Address;
    private double PostalAddress;
    private double StreetAddress;
    //Setter
    public double setPostalAddress(double postalAddress){
        PostalAddress = postalAddress;
        return postalAddress;
    }
    public double setStreetAddress(int streetAddress){
        StreetAddress= streetAddress;
        return streetAddress;
    }

    //Getter
    public String getAddress(){
        return ("Your postal address is " +PostalAddress+"and your street Address is "+StreetAddress);
    }
}
