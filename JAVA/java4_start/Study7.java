package java4_start;
import java.util.Scanner;
public class Study7 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int select;
		while(true)
		{
			System.out.println("1.입력");
			System.out.println("2.출력");
			System.out.println("3.종료");
			System.out.print("선택:");
			select = sc.nextInt();
			String insert="";
			if(select==1)
			{
				System.out.print("입력기능입니다:"); insert = sc.next();
				System.out.println("다른 기능을 선택하시겠습니까? 예 or 아니오 :"); String first = sc.next();
				if(first=="예")
				{
					System.out.println("선택지로 돌아갑니다");
				}
				else if(first=="아니오")
				{
					break;
				}
			}
			else if(select==2)
			{
				System.out.println("출력기능입니다:"+insert);
			}
			else
			{
				System.out.print("프로그램 종료"); break;
			}
		}
	}
}