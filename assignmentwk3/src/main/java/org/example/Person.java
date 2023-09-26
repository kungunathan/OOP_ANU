package org.example;

public class Person {
    //Variable initialization
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    //Methods to get and set id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //Methods to get and set names
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String mName){
        this.middleName = mName;
    }
    public String getLastName() {
        return firstName;
    }
    public void setLastName(String lName){
        this.lastName = lName;
    }
}
