package br.org.mdm.record;

import br.org.mdm.entity.CPF;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record Pay(
    UUID id, CPF cpf, LocalDateTime payDay, LocalDate monthReference, Integer value) {}
