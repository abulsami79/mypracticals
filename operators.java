class Operators
{
	public static void main(String[] args)
	{
		int x=10;
		int y=3;
		System.out.println("(1) Arthmetic Operators : +,-,*,/,%");
		
		System.out.println+(a+b);
		System.out.println+(a-b);
		System.out.println+(a*b);
		System.out.println+(a/b);
		System.out.println+(a%b);	

        System.out.println("(2) Ternary Operator : ? , : ");
		int x,y,z;
		x=5;
		y=++x;//y=6
		++x;//pre increament x=1+x x=1+6=7
		x++;//post increament x=x+1 x=7+1=8
		z=x-- + --y;//8+5=13 (after operation value of x=7 and y=5)
		System.out.println("Value of X : "+x+" Valur of Y : "+y+" Vlaue of Z : "+z);

        System.out.println("(3) Multiple Assignment Operator : +=,-=,*=,/=,%=");

		a*=10;//{a=a*10}=100
		b/=10;//{b=b/10}=2
		c+=5;//{c=c+5}=25
		d-=10;//{d=d-10}=5
		e%=10;//{e=e%10}=0
		System.out.println("a*=10; : "+a);
		System.out.println("b/=10; : "+b);
		System.out.println("c+=5; : "+c);
		System.out.println("d-=10; : "+d);
		System.out.println("e%=10; : "+e);
		
		
		
		