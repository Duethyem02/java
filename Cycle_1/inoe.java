import java.util.*;
class inoe
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter the number:");
  int a=obj.nextInt();
  if(a%2==0)
    System.out.println(a+"is an even number");
  else
    System.out.println(a+ "is an odd number");

 }
}

/*
Output:
Enter the number:
10
10is an even number
*/
