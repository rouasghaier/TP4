/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;


import java.util.List;

/**
 *
 * @author rouas
 */


public class StaffMember extends User {
    private String qualification;
    private Integer experience;
    private List<String> tasks;

    public StaffMember(String firstName, String lastName, String email, long id, String qualification, int experience, List<String> tasks) {
        super(firstName, lastName, email, id);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Qualification : " + qualification);
        System.out.println("Experience : " + experience);
        System.out.println("Taches : ");
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    @Override
    public void updateProfile(String firstName, String lastName, String email) {
        super.updateProfile(firstName, lastName, email);
    }

    @Override
    public boolean authenticate() {
        return true;
    }

    public void finishTask(String task) {
        tasks.remove(task);
    }
}
