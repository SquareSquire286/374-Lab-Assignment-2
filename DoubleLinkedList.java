import LinkedListNode.ListElement;

public class DoubleLinkedList
{
    public ListElement head, tail, currPtr;

    public DoubleLinkedList()
    {
	head = null;
	tail = null;
    } 

    public void addElement(ListElement le)
    {
	if (head == null)
	    {
		head = le;
	    }

	if (tail == null)
	    {
		tail = le;
	    }

	else if (head == tail)
	    {
		currPtr = head;
		head = le;
		head.setNext(currPtr);
		tail.setPrevious(head);
	    }

	else
	    {
		currPtr = head;
		head = le;
		head.setNext(currPtr);
		head.getNext().setPrevious(head);
	    }
    }

    public void deleteElement(int index)
    {
	if (head == null && tail == null)
	    System.out.println("No elements to delete!");

	else
	    {
	        currPtr = tail;

		while (currPtr != head && currPtr.getPrevious().getData() != index)
		    currPtr = currPtr.getPrevious();
		
		if (currPtr.getPrevious().getData() == index)
		    {
			currPtr.getPrevious().getPrevious().setNext(currPtr);
			currPtr.setPrevious(currPtr.getPrevious().getPrevious());
		    }
	    }
    }

    public ListElement getElement(int index)
    {
	ListElement dummy = new ListElement();
	dummy.setData(9999);

	if (head == null && tail == null)
	    return dummy;

	else
	    {
	        currPtr = head;

	        while (currPtr != tail && currPtr.getData() != index)
		    currPtr = (currPtr.getNext());
		
		if (currPtr.getData() == index)
		    return currPtr;

		else return dummy;
	    }
    }

    public void printLinkedListHead()
    {
	if (head == null)
	    System.out.println("No elements to print!");
	
	else
	    {
		currPtr = head;

		while (currPtr != null)
		    {
			System.out.print(currPtr.getData() + " ");
			currPtr = (currPtr.getNext());
		    }
		System.out.println(" ");
	    }
    }

    public void printLinkedListTail()
    {
	if (tail == null)
	    System.out.println("No elements to print!");

	else
	    {
		currPtr = tail;

		while (currPtr != null)
		    {
			System.out.print(currPtr.getData() + " ");
			currPtr = currPtr.getPrevious();
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
