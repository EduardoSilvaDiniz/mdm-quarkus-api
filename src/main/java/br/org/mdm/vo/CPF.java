package br.org.mdm.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public class CPF {
  private Integer number;

  public CPF(Integer number) {
    this.number = number;
  }

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
