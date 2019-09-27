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
}
