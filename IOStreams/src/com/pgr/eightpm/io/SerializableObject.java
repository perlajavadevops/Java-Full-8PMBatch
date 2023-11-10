package com.pgr.eightpm.io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializableObject {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("creditcard2.ser");
		
		//Employee emp2 = new Employee(102,"Dhatrika",707070707070L);
		//emp2.companyName = "ABCD ";
		
		CreditCard creditCard = new CreditCard(1, "89999", "Gangadhar", 101, 4000);
		ObjectOutputStream objectOut = new ObjectOutputStream(fos);
		objectOut.writeObject(creditCard);
		objectOut.close();
		fos.close();
		System.out.println("Serialization Done");
	}
}
