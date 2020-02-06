package epam.com.maven;

import java.util.Scanner;

public class Candies_analysis {

	public static int candies_weight=2;
	public static int candies_price=2;
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Maximum number of candies: " + Candies.range);
    	Jellies jy = new Jellies();
    	Gems lo = new Gems();
    	System.out.println("Enter Quantities of Jellies and Gems:");
    	jy.quantity(scan.nextInt());
    	lo.quantity(scan.nextInt());
    	if(jy.quantity+lo.quantity<=Candies.range) {
    	System.out.println("Options:\n1.Quantity\n2.Total Candies");
    	int opc = scan.nextInt();
    	if(opc==1) {
    		System.out.println("Enter quantity of range within:");
    		int qun = scan.nextInt();
    		if(jy.display()<=qun) {
    			System.out.println("Jellies are in range of "+qun);
    			System.out.println("No of Jelliess are : "+jy.display());
    		}
    		else {
    			System.out.println("Gems are in range of "+qun);
    			System.out.println("No of Gems are : "+lo.display());
    		}
    	}
    	else if(opc==2) {
        	int total_range = jy.display()+lo.display();
        	if(total_range<Candies.range) {
        		System.out.println("Candies are with in range");
            	System.out.println("Total number of candies in the present are : " + total_range);
        	}
        	else {
        		System.out.println("Candies are not in range");
        	}
    	}
    	else {
    		System.out.println("Enter Valid input");
    		return;
    	}
    	candies_weight = lo.cal_w(lo.quantity)+jy.cal_w(jy.quantity);
    	System.out.println("Total weight of candies: "+candies_weight+" grms\n");
    	
    	candies_price = lo.cal_p(lo.quantity) + jy.cal_p(jy.quantity);
    	System.out.println("Total price of candies: "+candies_price+" Rc.\n");
    	}
    	else {
    		System.out.println("Candies out of range");
    		return;
    	}
	}
}

