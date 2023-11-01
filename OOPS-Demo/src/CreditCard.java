public class CreditCard {//POJO --> Plain Old Java Objects, Beans, Entities, dto, transfer, 

	// cvv, card number, nameon the card, card type, card limit, card pinnumber.

	private int creditCardId;

	private String creditCardNumber;

	private String cardType;

	private String name;

	private boolean isActiveCard;
	

	/**
	 * @return the isActiveCard
	 */
	public boolean isActiveCard() {
		return isActiveCard;
	}

	/**
	 * @param isActiveCard the isActiveCard to set
	 */
	public void setActiveCard(boolean isActiveCard) {
		this.isActiveCard = isActiveCard;
	}

	public void setCreditCardId(int creditCardId) {
		this.creditCardId = creditCardId;
	}

	public int getCreditCardId() {
		return creditCardId;
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
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}

	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
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

}
