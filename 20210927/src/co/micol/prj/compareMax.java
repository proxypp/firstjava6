package co.micol.prj;

public class compareMax { //���޹��� �μ����� ū ���� �����Ѵ�.
	private int n;
	private int m;
	
	public compareMax(int n, int m) {// ������
		this.n = n;
		this.m = m;
	}
	public int getMax() {
		int max = 0; // �μ��� �������� 0�� �����Ѵ�.
		if(n>m) {
			max = n;
		}else if(n<m) {
			max = m;
		}
		return max;
		
	}
	
	
}
