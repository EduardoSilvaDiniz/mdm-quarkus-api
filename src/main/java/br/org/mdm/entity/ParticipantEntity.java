package br.org.mdm.entity;

import br.org.mdm.record.Participant;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "participants")
public class ParticipantEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String phone;

  public ParticipantEntity() {}

  public ParticipantEntity(Participant entity) {
    this.id = entity.id();
    this.name = entity.name();
    this.phone = entity.phone();
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    ParticipantEntity other = (ParticipantEntity) obj;
    return Objects.equals(id, other.id);
  }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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
