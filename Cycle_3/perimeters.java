import java.util.*;
class perimeters
{
 public static void main(String args[])
 {
  Scanner in = new Scanner(System.in);
  System.out.println("Circle:-\nRadius:");
  int r = in.nextInt();
  perimeter ob = new perimeter(r);
  System.out.println("Rectangle:-\nLength:");
  int l = in.nextInt();
  System.out.println("Breadth:");
  int b = in.nextInt();
  ob = new perimeter(l,b);
  
 }
}
class perimeter
{
 perimeter(int a)
 {
  double p=3.14*2*a;
  System.out.println("Perimeter = "+p); 
 }
 perimeter(int x,int y)
 {
  System.out.println("Perimeter = "+(2*(x+y)));
 } 
}


/*
Output:

Circle:-
Radius:
5
Perimeter = 31.400000000000002
Rectangle:-
Length:
4
Breadth:
5
Perimeter = 18
*/
