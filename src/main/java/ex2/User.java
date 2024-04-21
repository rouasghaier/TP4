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

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private Long cin;
    
    public void displayInfo() {
        System.out.println("les informations de l'utilisateur");
        System.out.println("Prénom: " + firstName);
        System.out.println("Nom: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("CIN: " + cin);
    }

    public void updateProfile(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public boolean authenticate() {
        return true ;
    }
}

