class NewThread implements Runnable {

	Thread t;

	NewThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Child thread " + t);
	}

	public void run() {
		try {		
			for (int i = 5;i > 0; i--) {
				System.out.println(i);
				Thread.sleep(500);
			}				
			}catch (InterruptedException e) {
				System.out.println("Child thread interrupted");
			}
			System.out.println("Child thread exiting.");
	}
}

class ThreadDemo {
	public static void main(String[] args) {
		
		NewThread nt = new NewThread();

		nt.t.start();

		try {
			for(int i = 5; i > 0; i--){
				System.out.println(i);
				Thread.sleep(1000);
			} 
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread");
	}
}