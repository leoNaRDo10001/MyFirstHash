import java.util.HashSet;

public class MyFirstHash {

	public static void main(String[] args) {
		
		/*
		HashSet<String> h = new HashSet<String>();
		h.add("Lemur");
		h.add("Orangutang");
		h.add("Spider");
		h.add("Gorilla");
		
		System.out.println(h.size());
		
		System.out.println(h);
		
		System.out.println(h.contains("Spider"));
		
		System.out.println(h.isEmpty());
		*/
		
		HashSet<Integer> hashb = new HashSet<Integer>();
		hashb.add(11);
		hashb.add(44);
		hashb.add(77);
		
		Object [] h = hashb.toArray();
		System.out.println(h[0]);
	}

}
