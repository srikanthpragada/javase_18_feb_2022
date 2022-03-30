package adv;

class PrintNumbers implements Runnable {
	public void run() {
		System.out.println("Printing Number using normal class");
	}
}

public class LambdaWithRunnable {

	public static void print() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		// Using normal class
		Thread t1 = new Thread(new PrintNumbers());
		t1.start();

		// Using anonymous inner class
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printing number using anonymous class");
			}
		});
		t2.start();

		// Using lambda expression
		Thread t3 = new Thread(() -> System.out.println("Printing number using lambda expression"));
		t3.start();

		// Using lambda block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});
		t4.start();

		// Using method reference 
		Thread t5 = new Thread(LambdaWithRunnable::print);
		t5.start();

	}

}
