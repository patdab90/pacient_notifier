package my.study.siwoz.pncore.entity;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import my.study.siwoz.pncore.entity.enums.Gender;

@MappedSuperclass
public abstract class Person extends BaseEntity {
	private static final long serialVersionUID = 7643145469060532558L;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false)
	private String zipCode;
	@Column(nullable = false)
	private String street;
	@Column(nullable = false)
	private String houseNo;
	@Column(nullable = false)
	private String flatNo;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String phonenumber;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Column(nullable = false)
	private String pesel;

	public String getCity() {
		return city;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public Gender getGender() {
		return gender;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPesel() {
		return pesel;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public String getStreet() {
		return street;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
