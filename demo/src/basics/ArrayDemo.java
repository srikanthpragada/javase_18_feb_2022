package basics;

public class ArrayDemo {

	public static void main(String[] args) {
		var a = new double[5];
		
		for(int i = 0; i < a.length; i ++)
			System.out.println(a[i]);

		for(var n : a)
			System.out.println(n);
	}

}
