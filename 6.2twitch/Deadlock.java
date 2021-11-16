class A {
	synchronized void foo(B b){
		String name = Thread.currentThread().getName();
	
		System.out.println(name + " entered A.foo...");

		try{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		}

		System.out.println(name + " callin B.last()");
		b.last();
	}

	synchronized void last(){
		System.out.println("A.last()");
	}
}

class B {
	synchronized void bar(A a){
		String name = Thread.currentThread().getName();
	
		System.out.println(name + " entered B.bar...");

		try{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
		}

		System.out.println(name + " callin A.last()");
		a.last();
	}

	synchronized void last(){
		System.out.println("B.last()");
	}
}

class Deadlock implements Runnable {
		A a = new A();
		B b = new B();
		Thread t;

		Deadlock(){
			Thread.currentThread().setName("MainThread");
			t = new Thread(this, "RacingThread");
		}

		void deadlockStart(){
			t.start();
			a.foo(b);
			System.out.println("MainThread");
		}

		public void run(){
			b.bar(a);
			System.out.println("OtherThread");
		}

		public static void main(String[] args) {
			
			Deadlock dl = new Deadlock();
			dl.deadlockStart();
		}
}