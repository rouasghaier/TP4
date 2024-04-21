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
public class Teacher extends User {
    private Long hIndex;
    private List<Course> courses;

    public Teacher(String firstName, String lastName, String email, long id, Long hIndex, List<Course> courses) {
        super(firstName, lastName, email, id);
        this.hIndex = hIndex;
        this.courses = courses;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("hIndex : " + hIndex);
        System.out.println("Cours enseignés : ");
        for (Course course : courses) {
            System.out.println(" - " + course.getName());
        }
    }

    public void updateProfile(String firstName, String lastName, String email, Long hIndex, List<Course> courses) {
        super.updateProfile(firstName, lastName, email);
        this.hIndex = hIndex;
        this.courses = courses;
    }

    @Override
    public boolean authenticate() {
        return true;
    }

    public void displayCoursesContent() {
        for (Course course : courses) {
            course.displayCourseInfo();
        }
    }
}
