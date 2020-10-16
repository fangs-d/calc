//Author  : Deepansh Dubey.
//Date      : 24/04/2020.
//Purpose: A calculator.


import java.io.*;
class calc
{
double a,b,c;
calc(double d,double e)
{
a=d;
b=e;
c=0;
}
public void sum()
{
c=a+b;
System.out.println("Sum(a+b)                  ="+c);
}
public void dif()
{
if(a>b)
{
c=a-b;
}
else
{
c=b-a;
}
System.out.println("Difference(a&b)           ="+c);
}
public double pro()
{
c=a*b;
return c;
}
public double div()
{
c=a/b;
return c;
}
public void sqr1()
{
c=a*a;
System.out.println("Square of I number        ="+c);
}
public void sqr2()
{
c=b*b;
System.out.println("Square of II number       ="+c);
}
public void pwr()
{
c=Math.pow(a,b);
System.out.println("a raised to power b       ="+c);
}
public void sqrt1()
{
c=Math.sqrt(a);
System.out.println("Square root of I number   ="+c);
}
public void sqrt2()
{
c=Math.sqrt(b);
System.out.println("Square root of II number  ="+c);
}
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double x,y;
System.out.println("Input two numbers");
x=Double.parseDouble(br.readLine());
y=Double.parseDouble(br.readLine());
calc ob=new calc(x,y);
ob.sum();
ob.dif();
System.out.println("Product(a*b)              ="+ob.pro());
System.out.println("Division(a/b)             ="+ob.div());
ob.sqr1();
ob.sqr2();
ob.pwr();
ob.sqrt1();
ob.sqrt2();
}
}