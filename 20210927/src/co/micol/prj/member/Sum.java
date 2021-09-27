package co.micol.prj.member;

public class Sum {
	int n;
	int m;
	public Sum(int n, int m) {
		this.n = n;
		this.m = m;
	}
	private int Sum() {
		int sum = 0;
		for(int i =n; i<=m; i++) {
			sum = sum+i;
		}
		return sum;
	}
	
	public int getSum() {
		
		return Sum();
	}
	
}
