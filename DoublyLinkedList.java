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
			first = last = newItem;
			first.SetPrevious(null);
			last.SetNext(null);
		} else {
			last.SetNext(newItem);
			newItem.SetPrevious(last);
			last = newItem;
			last.SetNext(null);
		}
	}

	public void AddAfter(DoublyLinkedListItem afterItem, DoublyLinkedListItem newItem) {

		if (afterItem == null) {
			return;
		}

		DoublyLinkedListItem newNode = new DoublyLinkedListItem(newItem);

		newNode.SetNext(afterItem.GetNext());

		afterItem.SetNext(newNode);

		newNode.SetPrevious(afterItem);

		if (newNode.GetNext() != null)
			newNode.GetNext().SetPrevious(newNode);
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
