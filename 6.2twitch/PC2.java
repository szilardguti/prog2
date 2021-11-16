class Q {
	int n;
	boolean valueSet = false;
//előző verzió nem teljesen jó, legyen egy segédváltozó

	synchronized int get() {
		while(!valueSet){
			try{
				wait();
			} catch(InterruptedException e){
				System.out.println("InterruptedException");
			}
		}
		System.out.println("Get: " + n);
		valueSet = false;
		notify(); //jelzi a másik szálnak, hogy írhat
		return n;
	}

	synchronized void put(int n) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException");
			}
		}
		this.n = n;
		valueSet = true;
		System.out.println("Put: " + n);
		notify();
	}
}

class Producer implements Runnable {
	Q q;
	Thread t;

	Producer(Q q) {
		this.q = q;
		t = new Thread(this, "Producer thread");
	}

	public void run() {
		int i = 0;
		while(true)
			q.put(i++);
	}
}

class Consumer implements Runnable {
	Q q;
	Thread t;

	Consumer(Q q){
		this.q = q;
		t = new Thread(this, "Consumer thread");
	}

	public void run(){
		while(true)
			q.get();
	}
}

class PC2 {
	public static void main(String[] args) {
		
		Q q = new Q();

		Producer p = new Producer(q);
		Consumer c = new Consumer(q);

		p.t.start();
		c.t.start();

		System.out.println("Ctrl+C to stop");
	}
}