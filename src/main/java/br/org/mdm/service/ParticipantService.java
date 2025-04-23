package br.org.mdm.service;

import br.org.mdm.entity.ParticipantEntity;
import br.org.mdm.record.Participant;
import br.org.mdm.repository.ParticipantRepository;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
@Consumes(MediaType.APPLICATION_JSON)
public class ParticipantService {

  @Inject ParticipantRepository participantRepository;

  public List<Participant> listParticipants() {
    PanacheQuery<ParticipantEntity> participants = participantRepository.findAll();
    return participants.stream().map(Participant::fromEntity).toList();
  }

  public Participant createParticipant(Participant participant) {
    ParticipantEntity participantEntity = new ParticipantEntity(participant);
    participantRepository.persist(participantEntity);
    return participant;
  }

  public Participant updateParticipant(Participant participant) {
    ParticipantEntity participantEntity = new ParticipantEntity(participant);
    participantRepository.persist(participantEntity);
    return participant;
  }

  public void deleteParticipant(Long id) {
    ParticipantEntity participant = participantRepository.findById(id);
    participantRepository.delete(participant);
  }
}
