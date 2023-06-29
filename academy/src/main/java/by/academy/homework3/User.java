package by.academy.homework3;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class User {

	private String name;
	private int age;
	private int manney;
	private String dateOfBirth;
	private String phone;
	private String email;
	DateValidator dateValidator;
	Validator phoneValidator;
	Validator emailValidator;

	public User(String name, int age, int manney) {
		super();
		this.name = name;
		this.age = age;
		this.manney = manney;
		dateValidator = new DateValidator();
		emailValidator = new BelarusPhoneValidator();
		phoneValidator = new EmailValidator();

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the manney
	 */
	public int getManney() {
		return manney;
	}

	/**
	 * @param manney the manney to set
	 */
	public void setManney(int manney) {
		this.manney = manney;
	}

	/**
	 * @return the dateValidator
	 */
	public DateValidator getDateValidator() {
		return dateValidator;
	}

	/**
	 * @param dateValidator the dateValidator to set
	 */
	public void setDateValidator(DateValidator dateValidator) {
		this.dateValidator = dateValidator;
	}

	/**
	 * @return the phoneValidator
	 */
	public Validator getPhoneValidator() {
		return phoneValidator;
	}

	/**
	 * @param phoneValidator the phoneValidator to set
	 */
	public void setPhoneValidator(Validator phoneValidator) {
		this.phoneValidator = phoneValidator;
	}

	/**
	 * @return the emailValidator
	 */
	public Validator getEmailValidator() {
		return emailValidator;
	}

	/**
	 * @param emailValidator the emailValidator to set
	 */
	public void setEmailValidator(Validator emailValidator) {
		this.emailValidator = emailValidator;
	}

	/**
	 * @param date 
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth(Date date) {
		return dateOfBirth;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, dateOfBirth, dateValidator, email, emailValidator, manney, name, phone,
				phoneValidator);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return age == other.age && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(dateValidator, other.dateValidator) && Objects.equals(email, other.email)
				&& Objects.equals(emailValidator, other.emailValidator) && manney == other.manney
				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone)
				&& Objects.equals(phoneValidator, other.phoneValidator);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", manney=" + manney + ", dateOfBirth=" + dateOfBirth
				+ ", phone=" + phone + ", email=" + email + ", dateValidator=" + dateValidator + ", phoneValidator="
				+ phoneValidator + ", emailValidator=" + emailValidator + "]";
	}

	public void setDateOfBirth(String dateBirth) {
		if (dateValidator.isValid(dateOfBirth)) {
			this.dateOfBirth = dateBirth;
		} else
			System.out.println("Invalid date format. Please enter in the format dd/MM/yyyy or dd-MM-yyyy.");

	}

	public void setPhone(String phone) {
		if (phoneValidator.isValid(phone)) {
			this.phone = phone;
		} else
			System.out
					.println("Invalid phone number. Please enter a valid Belarusian phone number starting with +375.");
	}

	public void setEmail(String email) {
		if (emailValidator.isValid(email)) {
			this.email = email;
		} else
			System.out.println("Invalid email address. Please enter a valid email address.");
	}

	public void enterUserDetails() {
		System.out.print("Enter date of birth (dd/MM/yyyy or dd-MM-yyyy): ");
		Scanner scan = new Scanner(System.in);

		System.out.println("write your date of birth");
		setDateOfBirth(scan.nextLine());

		System.out.println("write your phone num");
		setPhone(scan.nextLine());

		System.out.println("write your email");
		setEmail(scan.nextLine());

	}

}
