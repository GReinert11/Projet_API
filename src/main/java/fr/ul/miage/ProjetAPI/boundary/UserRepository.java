package fr.ul.miage.ProjetAPI.boundary;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.ul.miage.ProjetAPI.entity.Users;

public interface UserRepository extends JpaRepository<Users,Integer> {
    
}
