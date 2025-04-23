package br.org.mdm.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CPF {
  private Integer number;

  public CPF(Integer number) {
    this.number = number;
  }
}
