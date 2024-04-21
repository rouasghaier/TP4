/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author rouas
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Course extends Teacher  {
    private String name;
    private List<String> topics;
    private float credits;

    public void displayCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Topics: " + topics);
        System.out.println("Credits: " + credits);
    }
}