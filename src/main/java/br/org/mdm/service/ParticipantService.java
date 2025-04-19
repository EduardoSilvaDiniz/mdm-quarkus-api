package br.org.mdm.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;

import br.org.mdm.model.ParticipantEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
@Consumes(MediaType.APPLICATION_JSON)
public class ParticipantService implements PanacheRepository<ParticipantEntity>{

  public ParticipantEntity createParticipant(ParticipantEntity userParticipant) {
    ParticipantEntity.persist(userParticipant);
    return userParticipant;
  }
}
