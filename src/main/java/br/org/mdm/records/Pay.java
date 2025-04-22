package br.org.mdm.records;

import br.org.mdm.others.CPF;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public record Pay(
    UUID id, CPF cpf, LocalDateTime payDay, LocalDate monthReference, Integer value) {}
