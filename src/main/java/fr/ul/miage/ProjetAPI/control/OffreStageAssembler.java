package fr.ul.miage.ProjetAPI.control;

import fr.ul.miage.ProjetAPI.entity.OffreStage;
import fr.ul.miage.ProjetAPI.boundary.OffreStageRepresentation;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.hateoas.CollectionModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Component
public class OffreStageAssembler implements RepresentationModelAssembler<OffreStage, EntityModel<OffreStage>> {

    @Override
    public EntityModel<OffreStage> toModel(OffreStage offreStage) {
        return EntityModel.of(offreStage,
                linkTo(methodOn(OffreStageRepresentation.class).getAllOffres()).withRel("collection")
        );
    }

    @Override
    public CollectionModel<EntityModel<OffreStage>> toCollectionModel(Iterable<? extends OffreStage> entities) {
        List<EntityModel<OffreStage>> offreStageModel = StreamSupport
            .stream(entities.spliterator(), false)
            .map(this::toModel)
            .toList();

        return CollectionModel.of(offreStageModel, linkTo(methodOn(OffreStageRepresentation.class)
            .getAllOffres()).withSelfRel());
    }
    
}
