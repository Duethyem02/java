import java.util.*;//transpose of matrix
class tmatrix
{
 public static void main(String args[])
 {
  int i,j;
  int a[][]=new int[10][10];
  int t[][]=new int[10][10];
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter order of matrix:");
  int m=obj.nextInt();
  int n=obj.nextInt();
  System.out.println("Enter matrix:");
  for(i=0;i<m;i++)
  {
   for(j=0;j<n;j++)
   {
      a[i][j]=obj.nextInt();
   }
  }
  for(i=0;i<n;i++)
  {
   for(j=0;j<m;j++)
   {
    t[i][j]=a[j][i];
   }
  }
  System.out.println("Transpose is:");
  for(i=0;i<n;i++)
  {
   for(j=0;j<m;j++)
   {
    System.out.print(t[i][j]+" ");
   }
   System.out.println();
  }
 } 
}

/*
Output:
Enter order of matrix:
2
2
Enter matrix:
1
2
3
4
Transpose is:
1 3 
2 4 
*/
