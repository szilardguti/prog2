interface IntStack {
	void push(int elem);
	int pop();
}

class FixedStack implements IntStack {
	private int stck[];
	private int tos;

	FixedStack(int size) {
		stck = new int[size];
		tos = -1;
	}

	public void push(int elem) {
		if(tos == stck.length-1)
			System.out.println("Stack is Full!");
		else
			stck[++tos] = elem;
	}

	public int pop() {
		return stck[tos--];
	}
}

class IFFixedStack {
	public static void main(String[] args) {
		FixedStack myStack = new FixedStack(10);

		for(int i = 0; i < 11; i++)
			myStack.push(i);


		for(int i = 0; i < 10; i++)
			System.out.println(myStack.pop()); 
	}
}