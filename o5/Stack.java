class myStack {
	final int max = 10;
	private int stck[] = new int[max];
	private int pos;

	myStack()
	{
		pos = -1;
	}

	public void push(int i)
	{
		if(full())
			System.out.println("A stack tele van!");
		else
			stck[++pos] = i;
	}

	public int pop()
	{
		if(empty()){
			System.out.println("A stack üres!");
			return -1;
		}
		else
			return stck[pos--];
	}

	public int top()
	{
		return stck[pos];
	}

	public boolean empty() { return pos == -1; }
	public boolean full() { return pos == max-1; }
}

class Stack {

	public static void main(String[] args) {
		
		myStack sztekk = new myStack();

		for(int i = 0;i < 11; i++) sztekk.push(i);

		sztekk.push(50);
		System.out.println("A stack legfelső eleme: "  + sztekk.top());

		for(int i =0; i < 10; i++){
			System.out.println(sztekk.pop());
		}

		sztekk.pop();
		System.out.println("A stack üres?: " + sztekk.empty());
	}
}