package org.example;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        double sId = student1.PeronId;
            sId= 13;
        String n  = student1.Name;
            n="Macharia";
        double sAddress = student1.setStreetAddress(1234);
        double pAddress = student1.setPostalAddress(5678);
        String prgm = student1.setProgram("IT");
        System.out.println(n+", Id "+ sId+" "+student1.getProgram()+","+student1.getAddress());

    }
}