package org.example;

public class Course {
    //Variable initialization
    private int courseId;
    private String courseName;
    private double courseCost;
    //Methods
    public int getCourseId() {
        return courseId;
    }
    public void setId(int cId) {
        this.courseId = cId;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String cName){
        this.courseName = cName;
    }
    public double getCourseCost() {
        return courseCost;
    }
    public void setCourseCost(double cId) {
        this.courseCost = cId;
    }
}
