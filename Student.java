
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soomin
 */
public class Student extends Person{
    private String enrollmentDate;
    private ArrayList<Course> courseList;
    
    public Student(String name, int age, String major, String enrollmentDate){
        super(name, age, major);
        this.enrollmentDate = enrollmentDate;
        this.courseList = new ArrayList<Course>();
    }
    
    public String getName(){
        return super.getName();
    }
    public int getAge(){
        return super.getAge();
    }
    public String getMajor(){
        return super.getMajor();
    }
    public String getEnrollmentDate(){
        return enrollmentDate;
    }
    public ArrayList<Course> getCourseList(){
        return courseList;
    }
    
    public void addCourse(Course course){
        courseList.add(course);
    }
}
