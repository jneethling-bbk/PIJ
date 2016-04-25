package data_structures;

public class IntegerListNode {
    private int value;
    private IntegerListNode nextNode;

    public IntegerListNode(int value) {
		this.value = value;
		this.nextNode = null;
    }
    public int getValue() {
		return value;
    }
    public IntegerListNode getNext() {
		return nextNode;
    }
    public void setNext(IntegerListNode n) {
		this.nextNode = n;
    }
}
