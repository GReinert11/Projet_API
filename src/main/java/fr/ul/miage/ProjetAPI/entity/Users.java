package fr.ul.miage.ProjetAPI.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor 
public class Users {
    
    private @Id @GeneratedValue Long id;
    private String username;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    Users(long id, String username) {
        this.id = id;
        this.username = username;
    }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + "]";
    }
    
    
}
