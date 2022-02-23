package basics;

import java.util.Scanner;

public class NetPrice {

	public static void main(String[] args) {

      int price, discountedPrice, discount, tax, netPrice;
      
       Scanner s = new Scanner(System.in);
       
       System.out.print("Enter price :");
       price = s.nextInt();
       
       discount = price * 20 / 100;
       discountedPrice = price - discount;
       tax = discountedPrice * 8 / 100; 
       netPrice = discountedPrice + tax;
       
       System.out.printf("Price            : %8d\n",price);
       System.out.printf("- Discount       : %8d\n",discount);
       System.out.printf("                   --------\n");
       System.out.printf("Discounted Price : %8d\n",discountedPrice);
       System.out.printf("+ Tax            : %8d\n",tax);
       System.out.printf("                   --------\n");
       System.out.printf("Net Price          %8d\n", netPrice);

	}

}
