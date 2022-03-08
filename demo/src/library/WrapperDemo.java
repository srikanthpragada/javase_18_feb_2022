package library;

public class WrapperDemo {

	public static void process(Integer obj) {
		  System.out.println(obj.getClass());
		  int v = obj;    // auto-unboxing
		  System.out.println(v * v);
	}
	
	public static void main(String[] args) {
		 process(10);     // Autoboxing
		 //process(true);
		 
		 Integer i = new Integer(10);

	}

}
