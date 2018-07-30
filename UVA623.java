import java.math.BigInteger;
import java.util.Scanner;

public class UVA623 {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);

	while(scan.hasNext())
	{
		String s = scan.next();
		System.out.println(s+"!");
		System.out.println(factorial(Integer.parseInt(s)));
	}
}
public static String factorial(int n) {
    BigInteger fact = new BigInteger("1");
    for (int i = 1; i <= n; i++) {
        fact = fact.multiply(new BigInteger(i + ""));
    }
    return fact.toString();
}
}
