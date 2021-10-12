import java.util.ArrayList;

interface IntStack {
	void push(int elem);
	int pop();
}

class ListStack implements IntStack{
	private ArrayList<Integer> ls;

	ListStack(int size) {
		ls = new ArrayList<Integer>(size);
	}

	public void push(int elem){
		ls.add(elem);
	}

	public int pop(){
		if(ls.size() != 0){
			int temp = ls.get(ls.size()-1);
			ls.remove(ls.size()-1);
			return temp;}
		else
			System.out.println("Stack is empty!");
			return -1;
	}

	public void printStack() {
		System.out.print("Stack's elements: ");
		for(var i : ls){
			System.out.print(i);
			System.out.print(' ');
		}
		System.out.println();
	}
}

class IFListStack {
	public static void main(String[] args) {
		ListStack myStack = new ListStack(5);

		for(int i = 0; i < 20; i++)
			myStack.push(i);
		System.out.println("Feltöltés kész");

		for(int i = 0;i < 20; i++){
			myStack.printStack();
			System.out.println(myStack.pop());
		}
		System.out.println(myStack.pop());
	}
}