package br.org.mdm.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
  private Integer number;
  private String district;
  private String street;

  public Address(Integer number, String district, String street) {
    this.number = number;
    this.district = district;
    this.street = street;
  }
}
