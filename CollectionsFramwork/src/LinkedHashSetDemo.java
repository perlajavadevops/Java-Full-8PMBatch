import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Perla");//Insertion order
		set.add("Reddy");
		set.add("Mahesh");
		set.add("Karthik");
		set.add("Dhatrika");//entry <k,v>
		set.add("Dhatrika");
		set.add(null);
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
