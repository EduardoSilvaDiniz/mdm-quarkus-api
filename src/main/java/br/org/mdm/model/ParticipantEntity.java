package br.org.mdm.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "participants")
public class ParticipantEntity extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String phone;

	public void setId(Long id){
		this.id = id;
	}

	public Long getId(){
		return this.id;
	}
  // private Address address;
  // private MaritalStatus maritalStatus;
  // private CPF cpf;

  // @PrePersist
  // public void prePersist(Integer number, String district, String street, MaritalStatus
  // maritalStatus){
  // this.address = new Address(number, district, street);
  // this.maritalStatus = maritalStatus;
  // }
}
