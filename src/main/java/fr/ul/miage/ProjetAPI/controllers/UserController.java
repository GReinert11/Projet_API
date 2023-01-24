package fr.ul.miage.ProjetAPI.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import fr.ul.miage.ProjetAPI.boundary.*;
import fr.ul.miage.ProjetAPI.entity.User;

@RestController
 class UserController {

    private final UserRepository repo;

    UserController(UserRepository repo){
        this.repo = repo;
    }

    //Récupérer tous les users

    @GetMapping("/Users")
    List<User> getAllUsers(){
        return repo.findAll();
    }

}
