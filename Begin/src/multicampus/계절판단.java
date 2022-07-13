package multicampus;
import java.util.*;
public class 계절판단 {

	public static void main(String[] args) {

		
		System.out.println("월을 입력하면 계절을 돌려준단다");
		
		
		for(;;) {
			
			Scanner sc = new Scanner(System.in);
			int month = sc.nextInt();
			String result;
			
		switch(month) {
		
		case 12,1,2 :
			result = "겨울";
			break;
			
		case 3,4,5 :
			result = "보보봄";
			break;
			
		case 6,7,8 : 
			result = ("여어어어어어름");
			break;
			
		case 9,10,11 : 
			result = ("가을");
			break;
			
		default :
			System.out.println("그런게 지구에 있을리가 없잖아");
			continue;
		}
		System.out.println(month+"월의 계절은 "+result+"이란다 boy.");
		}
		
		
		
	}
}
