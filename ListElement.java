package LinkedListNode;

public class ListElement
{
    private ListElement next;
    private ListElement previous;
    private int data;

    public ListElement()
    {
	this.data = 0;
	this.next = null;
	this.previous = null;
    }
    
    public void setData(int i)
    {
	this.data = i;
    }

    public void setNext(ListElement le)
    {
	this.next = le;
    }

    public int getData()
    {
	return this.data;
    }

    public ListElement getNext()
    {
	return this.next;
    }
    
    public void setPrevious(ListElement le) // two new functions added for the doubly linked list
    {
	this.previous = le;    
    }

    public ListElement getPrevious() // since the 'previous' attribute is private, it must be accessed through a setter and a getter 
    {
	return this.previous; // otherwise, this file is the same as in the master branch
    }
}
