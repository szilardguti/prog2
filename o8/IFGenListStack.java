import java.util.ArrayList;

interface IntStack<T> {
	void push(T elem);
	T pop();
}

class GenListStack<T> implements IntStack<T>{
	private ArrayList<T> ls;

	GenListStack(int size) {
		ls = new ArrayList<T>(size);
	}

	public void push(T elem){
		ls.add(elem);
	}

	public T pop(){
		if(ls.size() != 0){
			T temp = ls.get(ls.size()-1);
			ls.remove(ls.size()-1);
			return temp;
		}
		else
			System.out.println("Stack is empty!");
			return null;
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

class IFGenListStack {
	public static void main(String[] args) {
		GenListStack<Integer> myStack = new GenListStack<>(5);

		for(int i = 0; i < 10; i++)
			myStack.push(i);
		System.out.println("Int array feltöltés kész");

		for(int i = 0;i < 10; i++){
			myStack.printStack();
			System.out.println(myStack.pop());
		}
		System.out.println(myStack.pop());


		GenListStack<String> myStackStr = new GenListStack<>(3);

		for(int i = 0;i < 6; i++)
			myStackStr.push(String.valueOf(i));
	
		for(int i = 5;i > 3; i--)
			myStackStr.pop();

		myStackStr.printStack();
	}
}