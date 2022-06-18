package separateChaining;

import java.util.ListIterator;

public class ChainingHashTable<E> {
	private SortedList<E>[] hashArray;
	int size;

	public ChainingHashTable(int size) {
		hashArray = new SortedList[size];
		for (int j = 0; j < hashArray.length; j++)
			hashArray[j] = new SortedList<>();
		size = size;
	}

	public int hashFunc(int key) {
		return key % hashArray.length;
	}

	public void insert(int k, E d) {

		int hashVal = hashFunc(k);
		hashArray[hashVal].insert(k, d);
	}

	public void delete(int k) {
		int hashVal = hashFunc(k);
		hashArray[hashVal].delete(k);
	}

	public E find(int k) {
		int hashVal = hashFunc(k);
		E d = (E) hashArray[hashVal].find(k);
		return d;
	}

	public void displayTable() {
		for (int j = 0; j < hashArray.length; j++)
			hashArray[j].displayList();

	}
	
	public int searchByElement(E e) {
		for(int i = 0; i< size; i++) {
			 if(hashArray[i].find(e)) {
				 return i;
			 }
		}
		return -1;
	}

}
