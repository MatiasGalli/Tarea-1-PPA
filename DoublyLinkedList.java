package logica;

import dominio.DoublyLinkedListItem;

public class DoublyLinkedList {
	public DoublyLinkedListItem first, last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public void AddFirst(DoublyLinkedListItem item) {
		DoublyLinkedListItem newItem = new DoublyLinkedListItem(item);
		if (first == null) {
			last = newItem;
		} else {
			first.SetPrevious(newItem);
		}
		newItem.SetNext(first);
		first = newItem;
	}

	public void AddLast(DoublyLinkedListItem item) {
		DoublyLinkedListItem newItem = new DoublyLinkedListItem(item);
		if (first == null) {
			last = newItem;
		}else {
			first.SetPrevius(newItem);
		}
		newItem.setNex(first);
		last = newItem;
	}

	public void AddAfter(DoublyLinkedListItem afterItem, DoublyLinkedListItem newItem) {

	}

	public void AddBefore(DoublyLinkedListItem beforeItem, DoublyLinkedListItem newItem) {

	}

	public void Clear() {

	}

	public void Contains(DoublyLinkedListItem item) {

	}

	public void Remove(DoublyLinkedListItem item) {

	}

	public void RemoveFirst() {

	}

	public void RemoveLast() {

	}
}
