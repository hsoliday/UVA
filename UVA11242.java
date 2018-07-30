import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class TourDeFrance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int f=scan.nextInt();
		while(true)
		{
		int r=scan.nextInt();
		int[] far=new int[f];
		for(int i =0;i<f;i++)
		{
			far[i]=scan.nextInt();
		}
		int[] rar=new int[r];
		for(int i =0;i<r;i++)
		{
			rar[i]=scan.nextInt();
		}
		Double[] fullSet=new Double[r*f];
		for(int i =0;i<f;i++)
		{
			for(int j =0;j<r;j++)
			{
				fullSet[i*r+j]=((double) rar[j])/((double)far[i]);
			}	
		}
		ArrayList<Double> tmp = new ArrayList<Double>();
		for(Double d:fullSet)
		{
			tmp.add(d);
		}
		 Collections.sort(tmp);
		double v =0;
		for(int i =0;i<tmp.size()-1;i++)
		{
			if((tmp.get(i+1)/tmp.get(i))>v)
			{
				v = (tmp.get(i+1)/tmp.get(i));
			}
		}
		System.out.printf("%.2f%n",v);
		f=scan.nextInt();
		if(f==0)
		{
			break;
		}
		}
	}

}
