package epam.com.maven;

public class Chocolates {
	int size;
	int price;
}

class BarOne extends Chocolates{
	int dweight = 50;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int total_w(int n) {
		return dweight*n;
	}
	public int total_p(int n) {
		return price*n;
	}
}

class Snickers extends Chocolates{
	int sweight = 30;
	public int display() {
		return size;
	}
	public void getsize(int n) {
		size=n;
	}
	public int total_w(int n) {
		return sweight*n;
	}
	public int total_p(int n) {
		return price*n;
	}
}