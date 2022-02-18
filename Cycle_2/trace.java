import java.util.*;
class trace
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner (System.in);
  System.out.println("Enter order of square matrix:");
  int m=obj.nextInt();
  System.out.println("Enter matrix:");
  int i,j,sum=0;
  int a[][]=new int[m][m];
  for(i=0;i<m;i++)
  {
   for(j=0;j<m;j++)
   {
    a[i][j]=obj.nextInt();
   }
  }
  System.out.println("Matrix is:");
  for(i=0;i<m;i++)
  {
   for(j=0;j<m;j++)
   {
    System.out.print(a[i][j]+" ");
   }
   System.out.print("\n");
  }
  for(i=0;i<m;i++)
  {
    sum+=a[i][i];
  }
  System.out.println("Trace of matrix is:"+sum);
 }
}




/*
Output:
Enter order of square matrix:
3
Enter matrix:
3
2
1
2
3
4
3
1
5
Matrix is:
3 2 1 
2 3 4 
3 1 5 
Trace of matrix is:11
*/
