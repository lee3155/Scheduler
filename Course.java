
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soomin
 */
public class Course {
    private String name;
    private String description;
    private Professor professor;
    private ArrayList<Student> studentList;
    
    
    public Course(String name) {
        this.name = name;
    }
    
    public Course(String name, String description) {
        this.name = name;
        this.description = description;
        studentList = new ArrayList<Student>();
    }
    
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    
    public Professor getProfessor(){
        return professor;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    public void addStudent(Student s) {
        this.studentList.add(s);
    }
    public ArrayList<Student> getStudentList(){
        return studentList;
    }

}
