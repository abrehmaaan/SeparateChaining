package separateChaining;

public class SortedList<E> {
	private Node<E> head = null;

	public void insert(int k, E d) {

		Node<E> previous = null;
		Node<E> current = head;

		while (current != null && k > current.key) {
			previous = current;
			current = current.next;
		}
		if (previous == null)
			head = new Node<E>(k, d, head);
		else
			previous.next = new Node<E>(k, d, current);
	}

	public E find(int k) {
		Node<E> current = head;
		while (current != null && current.key <= k) {
			if (current.key == k)
				return current.data;
			current = current.next;
		}
		return null;

	}
	
	public boolean find(E e) {
		Node<E> current = head;
		while (current != null) {
			if (current.data == e)
				return true;
			current = current.next;
		}
		return false;

	}

	public void delete(int k) {

		if (head != null)
			if (head.key == k)
				head = head.next;
			else {
				Node<E> previous = null;
				Node<E> current = head;
				while (current != null && k != current.key) {
					previous = current;
					current = current.next;
				}
				if (current != null)
					previous.next = current.next;
			}
	}

	public void displayList() {
		Node<E> current = head;
		while (current != null) {
			current.diplay();
			current = current.next;
		}
	}

}