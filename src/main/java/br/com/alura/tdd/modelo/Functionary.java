package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Functionary {

	private String name;
	private LocalDate admissionDate;
	private BigDecimal salary;

	public Functionary(String name, LocalDate admissionDate, BigDecimal salary) {
		this.name = name;
		this.admissionDate = admissionDate;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getAdmissionDate() {
		return this.admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public void salaryReadjustment(BigDecimal readjustment) {
		this.salary = this.salary.add(readjustment);

		roundSalary();
	}

	private void roundSalary() {
		this.salary = this.salary.setScale(2, RoundingMode.HALF_UP);
	}
}
