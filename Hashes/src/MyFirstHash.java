import java.util.HashSet;

public class MyFirstHash {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		h.add("Lemur");
		h.add("Orangutang");
		h.add("Spider");
		h.add("Gorilla");
		
		System.out.println(h.size());
		
		System.out.println(h);
		
		System.out.println(h.contains("Spider"));
	}

}
