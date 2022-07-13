package day08;
import java.util.*;

public class 학점계산 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("학년을 입력해주세요");
		
		int grade = sc1.nextInt();
		
		if(score>=60 && grade != 4) {
			System.out.println("합격");
		}
		else if(score >= 70 && grade == 4) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합");
		}
		
		
		
		
	}

}
