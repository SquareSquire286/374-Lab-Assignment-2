import LinkedListNode.ListElement;

public class DoubleLinkedList
{
    public ListElement head, tail, currPtr;

    public DoubleLinkedList()
    {
	head = null; // set head and tail to null
	tail = null;
    } 

    public void addElement(ListElement le)
    {
	if (head == null)
	    {
		head = le; // if head is null, the element parameter becomes the head
	    }

	if (tail == null)
	    {
		tail = le; // if tail is null, the element paramenter becomes the tail
	    }

	else if (head == tail) // this would mean that there is only one element in the list
	    {
		currPtr = head; // assign the value of the head to the traversing pointer
		head = le; // the element parameter becomes the new head
		head.setNext(currPtr); // head is linked to the traversing pointer (the old head)
		tail.setPrevious(head); // the new head is linked to the tail (which is also the old head)
	    }

	else // if there are two or more elements in the list
	    {
		currPtr = head; // point the traversing pointer to the head
		head = le; // the element parameter becomes the new head
		head.setNext(currPtr); // the new head is linked to the old head
		head.getNext().setPrevious(head); // the old head is linked to the new head to ensure that the list is doubly linked
	    }
    }

    public void deleteElement(int index)
    {
	if (head == null && tail == null) // if the list is empty
	    System.out.println("No elements to delete!");

	else
	    {
	        currPtr = tail; // the traversing pointer points to the tail

		while (currPtr != head && currPtr.getPrevious().getData() != index)
		    currPtr = currPtr.getPrevious(); // traverse the list backwards until the head is reached or the desired index value is found
		
		if (currPtr.getPrevious().getData() == index) // if the desired index value is found
		    {
			currPtr.getPrevious().getPrevious().setNext(currPtr); // skip over the node with the desired data value
			currPtr.setPrevious(currPtr.getPrevious().getPrevious());
		    }
	    }
    }

    public ListElement getElement(int index)
    {
	ListElement dummy = new ListElement(); // dummy value in the event that the desired index is not in the list
	dummy.setData(9999);

	if (head == null && tail == null)
	    return dummy; // return the dummy value if the list is empty

	else
	    {
	        currPtr = head;

	        while (currPtr != tail && currPtr.getData() != index)
		    currPtr = (currPtr.getNext()); // traverse the list until we reach the tail or the desired index value
		
		if (currPtr.getData() == index)
		    return currPtr; // return the pointer with the desired index value if it is found

		else return dummy; // return the dummy value if the desired index value is not found
	    }
    }

    public void printLinkedListHead()
    {
	if (head == null) // if there are no elements in the list
	    System.out.println("No elements to print!");
	
	else
	    {
		currPtr = head; // traversing pointer points to the beginning of the list

		while (currPtr != null)
		    {
			System.out.print(currPtr.getData() + " ");
			currPtr = (currPtr.getNext()); // print elements sequentially until the end of the list is reached
		    }
		System.out.println(" ");
	    }
    }

    public void printLinkedListTail()
    {
	if (tail == null) // if there are no elements in the list
	    System.out.println("No elements to print!");

	else
	    {
		currPtr = tail; // traversing pointer points to the back of the list

		while (currPtr != null)
		    {
			System.out.print(currPtr.getData() + " ");
			currPtr = currPtr.getPrevious(); // prints elements sequentially until the beginning of the list is reached
		    }
		System.out.println(" ");
	    }
    }

    public static void main (String[] args)
    {
	DoubleLinkedList link = new DoubleLinkedList();
	ListElement le = new ListElement();
        ListElement le1 = new ListElement();
	ListElement le2 = new ListElement();
	ListElement le3 = new ListElement();
	ListElement le4 = new ListElement();
	ListElement le5 = new ListElement();
	ListElement le6 = new ListElement();

	le.setData(3);
	le1.setData(7);
	le2.setData(4);
	le3.setData(8);
	le4.setData(2);
	le5.setData(5);
	le6.setData(6);

	link.deleteElement(10);
	link.addElement(le);
	System.out.println("Inserted item " + le.getData());
	link.addElement(le1);
	System.out.println("Inserted item " + le1.getData());
	link.addElement(le2);
	System.out.println("Inserted item " + le2.getData());
	link.addElement(le3);
	System.out.println("Inserted item " + le3.getData());
	link.printLinkedListHead();
	link.printLinkedListTail();
	System.out.println("Retrieved item " + link.getElement(7).getData());
	link.addElement(le4);
	System.out.println("Inserted item " + le4.getData());
	link.deleteElement(4);
	System.out.println("Deleted item " + le2.getData());
	link.addElement(le5);
	System.out.println("Inserted item " + le5.getData());
	link.addElement(le6);
	System.out.println("Inserted item " + le6.getData());
	link.deleteElement(8);
	System.out.println("Deleted item " + le3.getData());
	System.out.println("Retrieved item " + link.getElement(10).getData());
	link.printLinkedListHead();
	link.printLinkedListTail();
    }
}
