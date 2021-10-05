class myStack<T> {
	final int max = 10;
	private T stck[];
	private int pos;
	private T help;

	myStack()
	{
		pos = -1;
	}

	public void push(T i)
	{
		if(full())
			System.out.println("A stack tele van!");
		else
			stck[++pos] = i;
	}

	public T pop()
	{
		if(empty()){
			System.out.println("A stack üres!");
			return help;
		}
		else
			return stck[pos--];
	}

	public T top()
	{
		return stck[pos];
	}

	public boolean empty() { return pos == -1; }
	public boolean full() { return pos == max-1; }
}

class genericStack {

	public static void main(String[] args) {
		
		myStack<int> sztekk = new myStack();

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