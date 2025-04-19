package br.org.mdm.controller;

import br.org.mdm.model.ParticipantEntity;
import br.org.mdm.service.ParticipantService;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/participants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ParticipantController {

  private final ParticipantService participantService;

  public ParticipantController(ParticipantService userService) {
    this.participantService = userService;
  }

  @POST
  @Transactional
  public Response createParticipant(ParticipantEntity ParticipantEntity) {
    return Response.ok(participantService.createParticipant(ParticipantEntity)).build();
  }

  @GET
  public List<ParticipantEntity> getParticipants() {
    return participantService.listAll();
  }
}
