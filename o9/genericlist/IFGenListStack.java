package genericlist
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