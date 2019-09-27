import LinkedListNode.ListElement;

public class SingleLinkedList
{
    public ListElement head, currPtr;

    public SingleLinkedList()
    {
	head = null;
	currPtr = null;
    } 

    public void addElement(ListElement le)
    {
	if (head == null)
	    {
		head = le;
	    }

	else
	    {
		currPtr = head;
		head = le;
		head.setNext(currPtr);
	    }
    }

    public void deleteElement(int index)
    {
	if (head == null)
	    System.out.println("No elements to delete!");

	else
	    {
	        currPtr = head;

		while (currPtr.getNext() != null && currPtr.getNext().getData() != index)
		    currPtr = currPtr.getNext();
		
		if (currPtr.getNext().getData() == index)
		    {
			currPtr.setNext(currPtr.getNext().getNext());
		    }
	    }
    }

    public ListElement getElement(int index)
    {
	ListElement dummy = new ListElement();
	dummy.setData(9999);

	if (head == null)
	    return dummy;

	else
	    {
	        currPtr = head;

	        while (currPtr.getNext() != null && currPtr.getData() != index)
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

    public static void main (String[] args)
    {
	SingleLinkedList link = new SingleLinkedList();
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
    }
}
