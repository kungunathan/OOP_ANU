package org.example;
import java.lang.String;

public class Student extends Person{
    private String Program;
    //Setter
    protected String setProgram(String program){
        Program=program;
        return program;
    }
    public String getProgram(){
        return "The program you are enrolled in is "+Program;
    }
}
