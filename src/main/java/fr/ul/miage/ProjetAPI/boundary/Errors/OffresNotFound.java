package fr.ul.miage.ProjetAPI.boundary.Errors;


class OffresNotFound extends RuntimeException {

    OffresNotFound() {
        super("Offres not found");
    }
}