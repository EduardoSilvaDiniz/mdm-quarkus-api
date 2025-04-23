package br.org.mdm.record;

import br.org.mdm.entity.ParticipantEntity;

public record Participant(Long id, String name, String phone) {

  static public Participant fromEntity(ParticipantEntity entity) {
    return new Participant(entity.getId(), entity.getName(), entity.getPhone());
  }
}
