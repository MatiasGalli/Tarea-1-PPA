package dominio;

import logica.DoublyLinkedList;

public class DoublyLinkedListItem {
	public Object Value;
	public DoublyLinkedListItem next, previous;

	public DoublyLinkedListItem(Object value) {
		this.Value = value;
		next = null;
		previous = null;
	}

	public DoublyLinkedList GetList() {
		return null;
	}
	
	public DoublyLinkedListItem GetNext() {
		return next;
	}
	
	public DoublyLinkedListItem GetPrevious() {
		return previous;
	}
}
