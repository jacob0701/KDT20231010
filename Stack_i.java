package Stack;
import java.util.*;
public class Stack_i {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	IntStack s = new IntStack(64);
	
	while (true) {
		System.out.println();
		System.out.printf("현재데이터 개수 : %d / %d%n",s.size(),s.getCapacity());
		System.out.println("1 푸시 2 팝 3피크 4덤프 0종료");
	
		int menu = sc.nextInt();
		if (menu == 0) break;
	
		
		int x;
		switch(menu) {
		case 1:
			System.out.println("데이터 : ");
			x = sc.nextInt();
			
			try {
				int a = s.push(x);
				System.out.println(a+"추가");
				
			}catch (IntStack.OverflowIntStackException e) {
				System.out.println("full");
				
			}break;
		
		case 2:
			System.out.println("pop :  " );
			
			
			try {
				int b = s.pop();
				System.out.println(b + " 뺌");
				
			}catch (IntStack.EmptyIntStackException e) {
				System.out.println("empty");
				
			}break;
		
		
		}
		
	}
	
}//end of main
}//end of class
