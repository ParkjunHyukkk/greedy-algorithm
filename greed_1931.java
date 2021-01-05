package greed;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class greed_1931 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num; // 회의실 대여 현황 수
		
		num = in.nextInt();
		
		/*
		 time[][0] 은 시작시점을 의미
		 time[][1] 은 종료시점을 의미
		 */
		
		
		//시작 시간과 끝나는 시간 설정을 위한 2차원 배열 선언
		int[][] time = new int[num][2];  
		
		// 최대 회의의 수가 입력 받으면 해당되는 위치까지의
		for(int i = 0 ; i < num; i++) {
			time[i][0] = in.nextInt();
			time[i][1] = in.nextInt();
		}
		
		// 흩어져 있는 회의 목록을 정렬하여 시간이 겹치는지 확인 하기 위해 정렬
		Arrays.sort(time,new Comparator<int[]>(){
			
			public int compare(int[] start,int[] end) {
				// 종료 시간이 같을 경우 시작 시간이 빠른 순으로 정렬이 필요
				
				
				// 종료 시간이 같은 경우 [1] 종료 시간임을 알림
				if(start[1] == end[1]) { 
					// 시작 시간을 기준으로 리턴
					return Integer.compare(start[0], end[0]);
				} // 원래 상태로면 그냥 start리턴
					return Integer.compare(start[1], end[1]);
				
				
			}
		});
		
		int count = 0; // 회의의 개수
		int prev_end_time = 0; // 다음 회의가 시작할 시간을 담아주는 변수
		
		// 졍렬한 회의를 바탕으로 이전 시간과 시작 시간이 겹치지 않는다면 count
		for(int i = 0 ; i < num ; i++) { 
			// 시작 시간이 이전 시간보다 같거나 크면 
			if(prev_end_time <= time[i][0]) { 
				// 다음 회의가 시작될 시간을 알려주는 변수에 종료 시간을 저장
				prev_end_time = time[i][1];
				// count 증가
				count++;
			}
		}
		System.out.println(count);
	}

}