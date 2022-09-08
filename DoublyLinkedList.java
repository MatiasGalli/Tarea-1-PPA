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

		newItem.SetNext(afterItem.GetNext());

		afterItem.SetNext(newItem);

		newItem.SetPrevious(afterItem);

		if (newItem.GetNext() != null)
			newItem.GetNext().SetPrevious(newItem);
	}

	public void AddBefore(DoublyLinkedListItem beforeItem, DoublyLinkedListItem newItem) {

		if (beforeItem == null) {
			return;
		}

		newItem.SetPrevious(beforeItem.GetPrevious());

		beforeItem.SetPrevious(newItem);

		newItem.next = beforeItem;

		if (newItem.GetPrevious() != null)
			newItem.GetPrevious().SetNext(newItem);
		else {
			first = newItem;
		}
	}

	public void Clear() {
		DoublyLinkedListItem temp;
		temp = new DoublyLinkedListItem(null);
		while (this.first != null) {
			temp = this.first;
			this.first = this.first.GetNext();
			temp = null;
		}
	}

	public void Contains(DoublyLinkedListItem item) {
		if (first == null) {
			return;
			
		} else {
			int i = 0;
			DoublyLinkedListItem current = first;
			while (current != null && current == item) {
				current = current.GetNext();
				i++;
			}
			if (current != null) {
				System.out.println("The node is in the position " + i + " of the list.");
			} else {
				System.out.println("The node has not been found.");;
			}
		}
	}

	public void Remove(DoublyLinkedListItem item) {
		if (first == null || item == null) {
			return;
		}

		if (first == item) {
			first = item.GetNext();
		}

		if (item.GetNext() != null) {
			item.GetNext().SetPrevious(item.GetPrevious());
		}

		if (item.GetPrevious() != null) {
			item.GetPrevious().SetNext(item.GetNext());
		}
		return;
	}

	public void RemoveFirst() {
		if (this.first != null) {
			DoublyLinkedListItem tempItem = this.first;
			this.first = this.first.next;
			tempItem = null;
			if (this.first != null)
				this.first.SetPrevious(null);
		}
	}

	public void RemoveLast() {
		if (this.first != null) {
			if (this.first.next == null) {
				this.first = null;
			} else {
				DoublyLinkedListItem temp = new DoublyLinkedListItem(null);
				temp = this.first;
				while (temp.GetNext().GetNext() != null)
					temp = temp.GetNext();
				DoublyLinkedListItem lastNode = temp.GetNext();
				temp.SetNext(null);
				lastNode = null;
			}
		}
	}
}
