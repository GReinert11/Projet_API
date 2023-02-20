package fr.ul.miage.ProjetAPI.boundary;

import java.util.List;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import fr.ul.miage.ProjetAPI.controllers.OffreStageController;
import fr.ul.miage.ProjetAPI.entity.Candidature;

import java.util.stream.StreamSupport;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Component
public class CandidatureAssembler implements RepresentationModelAssembler<Candidature, EntityModel<Candidature>> {

    @Override
    public EntityModel<Candidature> toModel(Candidature candidature) {
        return EntityModel.of(candidature,
                linkTo(methodOn(OffreStageController.class).getOffreById(candidature.getId())).withSelfRel(),
                linkTo(methodOn(OffreStageController.class).getAllOffres()).withRel("collection"));
    }

    @Override
    public CollectionModel<EntityModel<Candidature>> toCollectionModel(Iterable<? extends Candidature> entities) {
        List<EntityModel<Candidature>> intervenanModel = StreamSupport
            .stream(entities.spliterator(), false)
            .map(this::toModel)
            .toList();

        return CollectionModel.of(intervenanModel, linkTo(methodOn(OffreStageController.class)
            .getAllOffres()).withSelfRel());
    }
}