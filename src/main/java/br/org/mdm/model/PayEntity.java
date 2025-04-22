package br.org.mdm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pays")
public class PayEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private LocalDateTime payDay;

  @Column(nullable = false)
  private LocalDate monthReference;

  @Column(nullable = false)
  private Integer value;

  // private CPF cpf;
  // @PrePersist
  // public void prePersist(){
  // 	this.payDay = LocalDateTime.now();
  // }
}
