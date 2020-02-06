package epam.com.maven;

import java.util.ArrayList;
import java.util.Scanner;

public class Sweet_analysis {
	static public int Sweets_weight;
	static public int Sweets_price;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		ArrayList<String> Sweets=new ArrayList<String>();
		Sweets.add("kova");
		Sweets.add("Laddu");
		
		//int weight[]=new int[Sweets.size()];
		int price[]=new int[Sweets.size()];
		kova k=new kova();
		Laddu l=new Laddu();
		
		System.out.println("Enter number of sweets\n");
		int kc=s.nextInt();
		int lc=s.nextInt();
		
		k.calculate(kc);
		l.calculate(lc);
		price[0]=k.display();
		price[1]=k.display();
		System.out.print("Total weight of sweets is: ");
		Sweets_weight=l.calculate(l.weight)+k.calculate_w(k.weight);
		System.out.println(Sweets_weight+" grams\n");
		
		System.out.print("Total price of sweets is: ");
		Sweets_price=l.calculate_c(price[0])+k.calculate(price[1]);
		System.out.println(Sweets_price+" Rs\n");
		
		
		
	}

}
