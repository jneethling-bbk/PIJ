package data_structures;

public class IntegerTree {

	private int nodeValue;
	private IntegerTree left;
	private IntegerTree right;
	
	public IntegerTree(int value) {
		nodeValue = value;
		left = null;
		right = null;
	}
	
	public void add(int value) {
		if (value < nodeValue) {
			if (left == null) {
				left = new IntegerTree(value);
			} else {
				left.add(value);
			}
		} else {
			if (right == null) {
				right = new IntegerTree(value);
			} else {
				right.add(value);
			}
		}
	}
	
	public IntegerTree remove(int value) {
		IntegerTree a = null;
		IntegerTree b = null;
		IntegerTree c = null;
		IntegerTree d = null;
		IntegerTree root = this;
		
		a = root;
		while (a != null && a.nodeValue != value) {
			b = a;
			a = (value < a.nodeValue) ? a.left : a.right;
		}
		if (a == null) {
			return this;
		} else {
			if (a.left == null) {
				c = a.right;
			} else if (a.right == null) {
				c = a.left;
			} else {
				c = a.right;
				if (c.left != null) {
					do {
						d = c;
						c = c.left;
					} while (c.left != null);
					d.left = c.right;
					c.right = a.right;
				}
				c.left = a.left;
			}
			if (a == root) {
				root = c;
			} else if (b.left == a) {
				b.left = c;
			} else {
				b.right = c;
			}
			a = null;
			return root;
		}
	}
	
	public boolean contains(int value) {
		if (value == nodeValue) {
			return true;
		} else if (value < nodeValue) {
			if (left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		} else {
			if (right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}
	}

	public int getMin() {
		if (left == null) {
			return nodeValue;
		} else {
			return left.getMin();
		}
	}
	
	public int getMax() {
		if (right == null) {
			return nodeValue;
		} else {
			return right.getMax();
		}
	}
	
	public int depth() {
		int n = 0;
		int r = 0;
		int l = 0;
		if (left == null && right == null) {
			return n;
		}
		if (right != null) {
			r = 1 + right.depth();
		}
		if (left != null) {
			l = 1 + left.depth();
		}
		if (r > l) {
			n = r;
		} else n = l;
		return n;
	}
	
	@Override
	public String toString() {
		String str = "";
		if (left == null && right == null) {
			str = nodeValue + " L[] R[]";
		}
		if (left != null && right == null) {
			str = nodeValue + " L" + left.toString() + "] R[]";
		}
		if (left == null && right != null) {
			str = nodeValue + " L[] R[" + right.toString();
		}
		if (left != null && right != null) {
			str = nodeValue + " L" + left.toString() + "] R[" + right.toString();
		}
		return "[" + str + "]";
	}
}
