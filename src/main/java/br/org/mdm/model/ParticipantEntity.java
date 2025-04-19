package br.org.mdm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

import br.org.mdm.others.Address;
import br.org.mdm.others.CPF;
import br.org.mdm.others.MaritalStatus;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name = "participants")
public class ParticipantEntity extends PanacheEntityBase {

	@Id
	private CPF cpf;
	private String name;
	private MaritalStatus maritalStatus;
	private String phone;
	private Address address;

	// @PrePersist
	public void prePersist(Integer number, String district, String street, MaritalStatus maritalStatus){
		this.address = new Address(number, district, street);
		this.maritalStatus = maritalStatus;
	}

	public CPF getCpf() {
		return cpf;
	}
	public void setCpf(CPF cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
