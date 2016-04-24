package data_structures;

public class IntegerNode {
    private int value;
    private IntegerNode nextNode;

    public IntegerNode(int value) {
		this.value = value;
		this.nextNode = null;
    }
    public int getValue() {
		return value;
    }
    public IntegerNode getNext() {
		return nextNode;
    }
    public void setNext(IntegerNode n) {
		this.nextNode = n;
    }
}
