/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.modelo;

/**
 *
 * @author Carlos
 */
public class employee {
    
    String firstName;
    String email;
    int key;

    public employee(String firstName, String email,int key) {
        this.firstName = firstName;
        this.email = email;
        this.key = key;
    }

    public employee() {
    }
    
    

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public int getKey() {
        return key;
    }
    
    
    
    
    
}
