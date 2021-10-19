class DoublyLinkedList {
	Node head;

	class Node {
		int data;
		Node next;
		Node prev;

		Node(int d) { data = d; }
	}

	public void push(int new_data){
		Node new_Node = new Node(new_data);

		new_Node.next = head;
		new_Node.prev = null;

		if (head != null)
			head.prev = new_Node;

		head = new_Node;
	}

	public void print_from_start() {
		Node temp;
		temp = head;

		if(temp == null){
			System.out.println("A lista üres");
		}
		else while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void print_from_end() {
		Node temp;
		temp = head;

		if(temp == null){
			System.out.println("A lista üres");
		}
		else while(temp.next != null) {
			temp = temp.next;
		}

		while(temp != null){
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.println();
	}

	public void append(int new_data){
		Node new_Node = new Node(new_data);

		new_Node.next = null;
		Node temp = head;

		if(temp == null){
			new_Node.prev = null;
			head = new_Node;
			return;
		}

	    while (temp.next != null)
	        temp = temp.next;
	 
	    temp.next = new_Node;
	    new_Node.prev = temp;

	}

}



class TestDLinkedList {
	public static void main(String[] args) {
		DoublyLinkedList my_D =  new DoublyLinkedList();

		for(int i = 0;i < 5; i++) my_D.push(i);
		my_D.append(42);	
		my_D.print_from_start();
		my_D.print_from_end();
	}
}