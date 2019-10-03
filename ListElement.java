package LinkedListNode;

public class ListElement
{
    private ListElement next;
    private ListElement previous;
    private int data;

    public ListElement()
    {
	this.data = 0; // default constructor, setting null values for the pointers and 0 for the data value
	this.next = null;
	this.previous = null;
    }
    
    public void setData(int i) // since the 'data' attribute is private, it must be accessed with a setter and a getter
    {
	this.data = i;
    }

    public void setNext(ListElement le) // since the 'next' attribute is private, it must be accessed with a setter and a getter
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
}
