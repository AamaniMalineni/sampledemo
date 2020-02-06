package epam.com.maven;

public class Laddu extends sweetpackage{
	int weight=5;
	int price=10;
	public int display() {
		return total;
	}

	public int calculate(int lc) {
		return total=lc*weight;// TODO Auto-generated method stub
		
	}
	public int calculate_c(int n) {
		return total=n*price;
	}

}
