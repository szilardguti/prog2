class NewThread implements Runnable {

	Thread t;
	String name;

	NewThread(String n) {
		name = n;
		t = new Thread(this, "Demo Thread");
		System.out.println(name + " thread " + t);
	}

	public void run() {
		try {		
			for (int i = 5;i > 0; i--) {
				System.out.println(i);
				Thread.sleep(500);
			}				
			}catch (InterruptedException e) {
				System.out.println(name + " thread interrupted");
			}
			System.out.println(name + " thread exiting.");
	}
}

class MultiThreadDemo {
	public static void main(String[] args) {
		
		NewThread nt1 = new NewThread("One");
		NewThread nt2 = new NewThread("Two");
		NewThread nt3 = new NewThread("Three");

		nt1.t.start();
		nt2.t.start();
		nt3.t.start();

		try {
			System.out.println("Waiting threads to finish...");
			nt1.t.join();
			nt2.t.join();
			nt3.t.join();

		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Thread One is alive: " + nt1.t.isAlive());
		System.out.println("Thread Two is alive: " + nt2.t.isAlive());
		System.out.println("Thread Three is alive: " + nt3.t.isAlive());

		System.out.println("Main thread exiting");
	}
}