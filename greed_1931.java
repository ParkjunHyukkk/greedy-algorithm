package greed;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class greed_1931 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num; // ȸ�ǽ� �뿩 ��Ȳ ��
		
		num = in.nextInt();
		
		/*
		 time[][0] �� ���۽����� �ǹ�
		 time[][1] �� ��������� �ǹ�
		 */
		
		
		//���� �ð��� ������ �ð� ������ ���� 2���� �迭 ����
		int[][] time = new int[num][2];  
		
		// �ִ� ȸ���� ���� �Է� ������ �ش�Ǵ� ��ġ������
		for(int i = 0 ; i < num; i++) {
			time[i][0] = in.nextInt();
			time[i][1] = in.nextInt();
		}
		
		// ����� �ִ� ȸ�� ����� �����Ͽ� �ð��� ��ġ���� Ȯ�� �ϱ� ���� ����
		Arrays.sort(time,new Comparator<int[]>(){
			
			public int compare(int[] start,int[] end) {
				// ���� �ð��� ���� ��� ���� �ð��� ���� ������ ������ �ʿ�
				
				
				// ���� �ð��� ���� ��� [1] ���� �ð����� �˸�
				if(start[1] == end[1]) { 
					// ���� �ð��� �������� ����
					return Integer.compare(start[0], end[0]);
				} // ���� ���·θ� �׳� start����
					return Integer.compare(start[1], end[1]);
				
				
			}
		});
		
		int count = 0; // ȸ���� ����
		int prev_end_time = 0; // ���� ȸ�ǰ� ������ �ð��� ����ִ� ����
		
		// ������ ȸ�Ǹ� �������� ���� �ð��� ���� �ð��� ��ġ�� �ʴ´ٸ� count
		for(int i = 0 ; i < num ; i++) { 
			// ���� �ð��� ���� �ð����� ���ų� ũ�� 
			if(prev_end_time <= time[i][0]) { 
				// ���� ȸ�ǰ� ���۵� �ð��� �˷��ִ� ������ ���� �ð��� ����
				prev_end_time = time[i][1];
				// count ����
				count++;
			}
		}
		System.out.println(count);
	}

}