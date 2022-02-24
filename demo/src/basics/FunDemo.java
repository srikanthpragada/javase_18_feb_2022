package basics;

public class FunDemo {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sum(int ... nums) {
         int total = 0;
         
         for (int n : nums)
        	 total += n;
         
         return total;
	}

	public static void main(String[] args) {
		System.out.println(add(10, 20));
		System.out.println(sum(10, 20, 30));
		System.out.println(sum(10, 20, 30, 40, 50));

	}

}
