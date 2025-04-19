package br.org.mdm.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import br.org.mdm.others.CPF;

@Entity
@Table(name = "pays")
public class PayEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	private CPF cpf;
	private LocalDateTime payDay;
	private LocalDate monthReference;
	private Integer value;

	// @PrePersist
	public void prePersist(){
		this.payDay = LocalDateTime.now();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Integer getCpf() {
		return cpf.getNumber();
	}

	public void setCpf(Integer number) {
		this.cpf.setNumber(number);
	}

	public LocalDateTime getPayDay() {
		return payDay;
	}

	public void setPayDay(LocalDateTime payDay) {
		this.payDay = payDay;
	}

	public LocalDate getMonthReference() {
		return monthReference;
	}

	public void setMonthReference(LocalDate monthReference) {
		this.monthReference = monthReference;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
