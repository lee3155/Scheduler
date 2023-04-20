/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author soomin
 */
public class Person {
    
    private String name;
    private int age;
    private String major;
    
    public Person(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}
