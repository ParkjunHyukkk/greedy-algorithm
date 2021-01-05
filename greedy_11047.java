package greed;
import java.util.Scanner;
public class greedy_11047 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int price = 0;
		int N = 0;
		
		N = in.nextInt();
		price = in.nextInt();
		
		int[] coin= new int[N];
		
		for(int i = 0 ; i < N; i++) {
			coin[i] = in.nextInt();			
		} 

		int count = 0;
		
		for(int i = N-1 ; i>=0 ; i--) {
			
			//���� ������ ��ġ�� price���� �۰ų� ���ƾ��� ���������ϴ�.
		if(coin[i]<=price) {
			//���� ��ġ�� �������� ������ �� �ִ� ������ �����ش�.
			count +=(price/coin[i]);
			price = price%coin[i];
		}
		
		}
		System.out.println(count);
	}

}
