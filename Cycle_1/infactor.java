import java.util.*;
class infactor
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter number:");
  int a=obj.nextInt();
  int i;
  System.out.println("Factors of "+a);
  for(i=1;i<=a;i++)
  {
   if(a%i==0)
      System.out.println(i);
   continue;
  } 
 }
}

/*
Output:
Enter number:
8
Factors of 8
1
2
4
8
*/
