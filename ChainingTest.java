package separateChaining;

public class ChainingTest {
	public static void main(String arg[]) {
		ChainingHashTable<String> hashTable = new ChainingHashTable<String>(2);
		hashTable.insert(1, "Ali");
		hashTable.insert(1, "Fatima");
		System.out.println(hashTable.searchByElement("Fatima"));
		System.out.println(hashTable.searchByElement("Edd"));
	}
}
