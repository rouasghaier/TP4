/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

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

public class Student extends User {
    private Double average;
    private Classe classe; 
    private Status status;

    public Student(String firstName, String lastName, String email, long id, Double average, Classe classe, Status status) {
        super(firstName, lastName, email, id);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Moyenne : " + average);
        System.out.println("Classe : " + classe);
        System.out.println("Statut : " + status);
    }
    
    public void updateProfile(String firstName, String lastName, String email, Double average, Classe classe, Status status) {
        super.updateProfile(firstName, lastName, email);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }
    
    @Override
    public boolean authenticate() {
        return true;
    }
}