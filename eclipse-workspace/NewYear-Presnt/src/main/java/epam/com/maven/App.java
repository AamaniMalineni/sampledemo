package epam.com.maven;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter maximum price");
        int mp=s.nextInt();
        ArrayList<String> Candies=new ArrayList<String>();
        ArrayList<String> Chocolates=new ArrayList<String>();
        Candies.add("gems");
        Candies.add("Jellies");
        Chocolates.add("BarOne");
        Chocolates.add("Snickers");
        
        System.out.println("calling of SweetPackage class\n");
        Sweet_analysis.main(args);
        
        System.out.println("calling of CandiesPackage class\n");
        Candies_analysis.main(args);
        
        System.out.println("calling of ChoclatesPackage class\n");
        Chocolates_analisys.main(args);
        
        int total_weight=0;
        total_weight=Sweet_analysis.Sweets_weight+Candies_analysis.candies_weight+Chocolates_analisys.tw_choco;
        System.out.println("Total weight of the New Year Gift is"+total_weight+"Gms");
        
        int total_price=0;
        total_price=Sweet_analysis.Sweets_price+Candies_analysis.candies_price+Chocolates_analisys.tc_choco;
        if(mp<total_price) {
        	System.out.println("Gift price more than expected. Please get within range");
    }
        else {
        	System.out.println("Total price of the gift is"+total_price+"Rs.");
        }
        
        
        
        
        
        
    }
}
