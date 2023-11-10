package com.pgr.eightpm.io;

import java.io.Serializable;

public class CreditCard implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 101L;

	private int creditId;
	private String creditCardNumber;
	private transient String name;//initiance variable
	private static int pinNumber;//In the Serialization, static memeber will not 
	private double amount;

	public CreditCard(int creditId, String creditCardNumber, String name, int pinNumber, double amount) {
		this.creditId = creditId;
		this.creditCardNumber = creditCardNumber;
		this.name = name;
		this.pinNumber = pinNumber;
		this.amount = amount;
	}

	/**
	 * @return the creditId
	 */
	public int getCreditId() {
		return creditId;
	}

	/**
	 * @param creditId the creditId to set
	 */
	public void setCreditId(int creditId) {
		this.creditId = creditId;
	}

	/**
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * @param creditCardNumber the creditCardNumber to set
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
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
	 * @return the pinNumber
	 */
	public int getPinNumber() {
		return pinNumber;
	}

	/**
	 * @param pinNumber the pinNumber to set
	 */
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CreditCard [creditId=" + creditId + ", creditCardNumber=" + creditCardNumber + ", name=" + name
				+ ", pinNumber=" + pinNumber + ", amount=" + amount + "]";
	}

}
