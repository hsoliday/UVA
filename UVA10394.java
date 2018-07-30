import java.util.ArrayList;
import java.util.Scanner;

public class UVA10394 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		for(int i = 3;i<20000000;i+=2)
		{
			if(isPrime(i))
			{
				list.add(i);
				System.out.println(i);
			}
		}
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			findTwin(list,scan.nextInt());
		}
	}
	public static void findTwin(ArrayList<Integer> list,int i)
	{
		int n = 0;
		int count = -1;
		if(i ==1)
		{
			System.out.print("(");
			System.out.print(3);
			System.out.print(",");
			System.out.print(5);
			System.out.println(")");
			return;
		}
		if(i ==2)
		{
			System.out.print("(");
			System.out.print(5);
			System.out.print(",");
			System.out.print(7);
			System.out.println(")");
			return;
		}
		while(n<i-2)
		{
			count++;
			if(list.get(count)+2==list.get(count+1))
			{
				n++;
			}
		}
		System.out.print("(");
		System.out.print(list.get(count));
		System.out.print(",");
		System.out.print(list.get(count+1));
		System.out.println(")");
		
	}
	public static boolean isPrime(int n)
	{
		if(n%2==0)
		{
			return false;
		}
		for(int i = 3;i<Math.sqrt(n)+3;i+=2)
		{
			if(n/i==((double)n/(double)i))//sketchy mod 
			{
				return false;
			}
		}
		return true;
	}

}
