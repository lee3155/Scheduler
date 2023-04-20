import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soomin
 */
public class Professor extends Person{

    private ArrayList<Course> courses = new ArrayList<>();
    
    public Professor(String name, int age, String major, ArrayList<Course> courses){
        super(name, age, major);
        this.courses = courses;
    }
    
    public Professor(String name, int age, String major) {
        super(name, age, major);
    }
    
    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return super.getName();
    }

    public int getAge() {
        return super.getAge();
    }

    public String getMajor() {
        return super.getMajor();
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
    }
    
}
