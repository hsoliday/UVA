public class Equation 
{
	double p,q,r,s,t,u;
	public Equation(double p,double q,double r,double s,double t,double u)
	{
		this.p= p;
		this.q = q;
		this.r= r;
		this.s = s;
		this.t= t;
		this.u = u;
	}
	public double evaluate(double x)
	{
		return p*Math.exp(-1*x)+q*Math.sin(x)+r*Math.cos(x)+s*Math.tan(x)+t*x*x+u;
	}
}
