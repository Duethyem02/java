import java.util.*;
class areas
{
 public static void main(String args[])
 {
  Scanner in =new Scanner(System.in);
  areas ob = new areas();
  System.out.println("Circle:-\nRadius:");
  int r = in.nextInt();
  ob.area(r);
  System.out.println("Rectangle:-\nLength:");
  int l = in.nextInt();
  System.out.println("Breadth:");
  int b = in.nextInt();
  ob.area(l,b);
  System.out.println("Triangle:-\nBase:");
  double bs = in.nextInt();
  System.out.println("Height:");
  double h = in.nextInt();
  ob.area(bs,h);
  
 }
 void area(int a)
 {
  double ar=3.14*a*a;
  System.out.println("Area = "+ar); 
 }
 void area(int x,int y)
 {
  System.out.println("Area = "+(x*y));
 }
 void area(double u,double v)
 {
  System.out.println("Area = "+(0.5*u*v));
 } 
}


/*
Output:
Circle:-
Radius:
4
Area = 50.24
Rectangle:-
Length:
3
Breadth:
4
Area = 12
Triangle:-
Base:
5
Height:
4
Area = 10.0
*/
