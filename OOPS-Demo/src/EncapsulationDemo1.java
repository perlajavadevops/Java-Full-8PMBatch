
public class EncapsulationDemo1 {

	public static void main(String[] args) {
		
		CreditCard creditCard = new CreditCard();

		System.out.println(creditCard.getCardType());
		System.out.println(creditCard.getCreditCardId());
		System.out.println(creditCard.getCreditCardNumber());
		System.out.println(creditCard.getName());
		System.out.println(creditCard.isActiveCard());
	}
}
