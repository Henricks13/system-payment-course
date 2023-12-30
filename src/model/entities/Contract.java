package model.entities;

import java.time.LocalDate;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private double totalValue;
	private Installment instalment;
	
	
	public Contract() {
		
	}


	public Contract(Integer number, LocalDate date, double totalValue, Installment instalment) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.instalment = instalment;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public double getTotalValue() {
		return totalValue;
	}


	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}


	public Installment getInstalment() {
		return instalment;
	}


	public void setInstalment(Installment instalment) {
		this.instalment = instalment;
	}
	
	
	
	

}
