import LinkedListNode.ListElement;

public class SingleLinkedList
{
    public ListElement head, currPtr;

    public SingleLinkedList()
    {
	head = null; // set the head and the traversing pointer to null
	currPtr = null;
    } 

    public void addElement(ListElement le)
    {
	if (head == null)
	    {
		head = le; // the element parameter becomes the head if there are no elements in the list
	    }

	else
	    {
		currPtr = head; // the traversal pointer points to the existing head
		head = le; // the element parameter becomes the new head
		head.setNext(currPtr); // the old head is linked to the new head
	    }
    }

    public void deleteElement(int index)
    {
	if (head == null) // if there are no elements in the list
	    System.out.println("No elements to delete!");

	else
	    {
	        currPtr = head; // traversal pointer points to the front of the list

		while (currPtr.getNext() != null && currPtr.getNext().getData() != index)
		    currPtr = currPtr.getNext(); // traverse the list until the desired data value is found or the end of the list is reached
		
		if (currPtr.getNext().getData() == index) // if the desired data value is found
		    {
			currPtr.setNext(currPtr.getNext().getNext()); // the node with the desired data value is bypassed
		    }
	    }
    }

    public ListElement getElement(int index)
    {
	ListElement dummy = new ListElement();
	dummy.setData(9999); // dummy value in case the desired data value is not found

	if (head == null)
	    return dummy; // return the dummy value if there are no elements in the list

	else
	    {
	        currPtr = head; // traversal pointer points to the front of the list

	        while (currPtr.getNext() != null && currPtr.getData() != index)
		    currPtr = (currPtr.getNext()); // traverse the list until the end is reached or the desired data value is found
		
		if (currPtr.getData() == index)
		    return currPtr; // return the pointer with the data element if the data element is found in the list

		else return dummy; // return the dummy value if the end of the list is reached
	    }
    }

    public void printLinkedListHead()
    {
	if (head == null) // if there are no elements in the list
	    System.out.println("No elements to print!");
	
	else
	    {
		currPtr = head; // traversal pointer points to the beginning of the list

		while (currPtr != null)
		    {
			System.out.print(currPtr.getData() + " ");
			currPtr = (currPtr.getNext()); // traverse the list and output the data elements sequentially until the end of the list is reached
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
