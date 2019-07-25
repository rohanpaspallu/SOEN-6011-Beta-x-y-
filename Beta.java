import java.util.Scanner;

public class Beta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("enter the value of x:");
		double x = Double.parseDouble(in.nextLine());
		System.out.println("enter the value of y:");
		double y = Double.parseDouble(in.nextLine());
		double z = x+y;
//		x=x-1;
//		y=y-1;
//		z=z-1;
//		z=z+1;
		double g_x = gamma(x);
		double g_y = gamma(y);
		double g_z = gamma(z);
//		double p = Math.PI;
//		double e = Math.E;
//		System.out.println(p+"     "+e);
		
		
		System.out.println(g_x);
		System.out.println(g_y);
		System.out.println(g_z);
		
		double beta = (g_x * g_y)/g_z;
		
		System.out.println(beta);
	}

	private static double gamma(double x) {
		// TODO Auto-generated method stub
//		x=49;
		x=x-1;
		double pi = 3.141592653589793;
		double e = 2.718281828459045;

		double root = (2*Math.PI*x);
		double sqr = sq(root);
//		double val = (x/e);
		double pow = Math.pow((x/Math.E), x);
//		double pow = pppp((x/e),x);
		double result = (sqr) *(pow);
		//System.out.println("Value is  " +result);
		
		return result;
	}
	
	public static double sq(double number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}
	
	
	static double powerd(double a,double b)
	{
		//return Math.pow(a, b);
		double p=1;
		for(int i=1;i<=b;i++)	
		{
			p=p*a;
		}
		return p;
	}
	static double fact(double n)
	{
		if(n<=1)
			return 1;
		else
			return (n*fact(n-1));		
	}
	static double loggn(double n)
	{
//		if(n>r-1)
//			return 1+ loggn(n/r,r);
//		else
//			return 0;
		double sum=0;
		double j =(n-1)/(n+1);
		for(int i=1;i<=99;i++)
		{
			double k = 2*i-1;
			sum+=(1/k)*(powerd(j,k));
		}
		return 2*sum;
		
	}
	static double pppp(double a,double b)
	{
		double sum=0;
		for(int i=0;i<=99;i++)
		{
			double k=powerd((b*loggn(a)),i);
			sum=sum+k/(fact(i));
		}
		return sum;
	}

}
