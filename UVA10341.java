import java.util.Scanner;

public class UVA10341 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int i,j,k,l,m,n;
		while(scan.hasNext())
		{
			String s = scan.next();
			if(s.equals("EOF"))
			{
				break;
			}
			else
			{
				i = Integer.parseInt(s);	
			}
			j = scan.nextInt();
			k = scan.nextInt();
			l = scan.nextInt();
			m = scan.nextInt();
			n = scan.nextInt();
			Equation e =new Equation(i,j,k,l,m,n);
			double start = 0;
			double end = 1;
			double f =findRoot(0,1,0.000001,e);
			if(round2(f,4)==1.0||round2(f,4)==0.0)
			{
				System.out.println("No solution");
			}
			else
			{
			System.out.println(round2(f,4));
			}
		}
	}
	public static double round2(double number, int scale) {
	    int pow = 10;
	    for (int i = 1; i < scale; i++)
	        pow *= 10;
	    double tmp = number * pow;
	    return ( (double) ( (int) ((tmp - (int) tmp) >= 0.5f ? tmp + 1 : tmp) ) ) / pow;
	}
	public static double findRoot(double a, double b,  double epsilon,Equation e) {
		double x = (a + b) / 2;
		if (Math.abs(a - x) < epsilon) {
			return x;
		} else if (e.evaluate(a) > 0 && e.evaluate(x) > 0 || e.evaluate(a) < 0 && e.evaluate(x) < 0){
			return findRoot(x, b, epsilon,e);
		} else {
			return findRoot(a, x,epsilon,e);
		}
	}

}
