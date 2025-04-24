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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}
