package data_structures;

public class HashUtilities {

	public static void main(String[] args) {
		String[] strArray = {"In computing, a hash table (hash map) is a data structure used to implement an associative array, a structure that can map keys to values.",
							"A hash table uses a hash function to compute an index into an array of buckets or slots, from which the desired value can be found.",
							"Ideally, the hash function will assign each key to a unique bucket, but it is possible that two keys will generate an identical hash causing both keys to point to the same bucket.",
							"Instead, most hash table designs assume that hash collisions—different keys that are assigned by the hash function to the same bucket—will occur and must be accommodated in some way.",
							};

		OneToOneMap oto = new OneToOneMap();
		System.out.println(oto.isEmpty());
		
		for (String s : strArray) {
			oto.put(shortHash(s.hashCode()), s);
			System.out.println(shortHash(s.hashCode()));
		}
		System.out.println(oto.isEmpty());
		oto.put(505, "The key should already be in use");
		System.out.println(oto.get(505));
		System.out.println(oto.get(0));
		oto.remove(505);
		oto.put(505, "The key can now be used");
		System.out.println(oto.get(505));

	}
	public static int shortHash(int n) {
		return  Math.abs(n % 997);
	}

}
