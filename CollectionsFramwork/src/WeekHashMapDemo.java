import java.util.WeakHashMap;

class Person{
	public String toStirng() {
		return "T";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize");
	}
}
public class WeekHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		//HashMap<Integer, String> map1 = new HashMap<>();
		WeakHashMap<Person, String> map1 = new WeakHashMap<>();

		String name = "name";
		Person  i = new Person();
		map1.put(i, name);
		
		System.out.println(map1);
		i = null;
		System.gc();
		Thread.sleep(500);
		
		System.out.println(map1);

		
	}
}
