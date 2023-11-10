package com.pgr.eightpm.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fos = new FileInputStream("creditcard2.ser");

		ObjectInputStream objectOut = new ObjectInputStream(fos);
		CreditCard creditCard = (CreditCard) objectOut.readObject();

		System.out.println(creditCard.toString());
		objectOut.close();
		fos.close();
		System.out.println("De-Serialization Done");
		//Multithreading and Collections Framework (Generics, Java 8 features........)
	}
}
