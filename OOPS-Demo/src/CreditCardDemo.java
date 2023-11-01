public class CreditCardDemo {

	public static void main(String[] args) {
		CreditCard creditCard = new CreditCard();

		creditCard.setActiveCard(true);
		creditCard.setCardType("Master");
		creditCard.setCreditCardId(101);
		creditCard.setCreditCardNumber("11222233444");
		creditCard.setName("Perla Reddy");

		System.out.println(creditCard.getCardType());
		System.out.println(creditCard.getCreditCardId());
		System.out.println(creditCard.getCreditCardNumber());
		System.out.println(creditCard.getName());
		System.out.println(creditCard.isActiveCard());
	}
}
