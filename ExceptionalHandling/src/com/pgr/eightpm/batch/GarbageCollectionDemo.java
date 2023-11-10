package com.pgr.eightpm.batch;

public class GarbageCollectionDemo {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method");
	}

	public static void main(String[] args) throws Throwable {
		GarbageCollectionDemo de = new GarbageCollectionDemo();
		System.out.println(de.hashCode());
		System.gc();
		de.finalize();
		de = null;
		System.out.println(de.hashCode());
	}

}
