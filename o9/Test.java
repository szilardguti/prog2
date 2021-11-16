import genericlist.*;

class Test{
	public static void main(String[] args) {
		GenListStack<Integer> myGenList = new GenListStack<>(10);

		myGenList.push(12);
		myGenList.printStack();
	}
}