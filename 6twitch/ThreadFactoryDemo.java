class NewThread implements Runnable {

	Thread t;
	String name;

	NewThread(String n) {
		name = n;
		t = new Thread(this, "Demo Thread");
		System.out.println(name + " thread " + t);
	}

	public static NewThread createAndStart(){
		NewThread myNewThr = new NewThread("factory");
		myNewThr.t.start();
		return myNewThr;
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

class ThreadFactoryDemo {
	public static void main(String[] args) {
		
		NewThread nt = NewThread.createAndStart();

		try {
			for(int i = 5;i > 0; i--){
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
				System.out.println("Main thread interrupted");
			}
		System.out.println("Main thread exiting");
	}
}