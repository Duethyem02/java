import java.util.*;//Searching for a particular character in a string
class xs
{
 public static void main(String args[])
 {
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter string:");
  String s=obj.next();//accepting string
  System.out.println("Enter character to be searched:");
  char x=obj.next().charAt(0);//accepting character
  int i=0,n;
  n=s.length();
  for(i=0;i<n;i++)
  {
   if (s.charAt(i)==x)
   {
    System.out.println(x+"is found at"+(i+1));
    break;    
   }
   else
   {
     continue;
   }
  }
  if (i==n)
     System.out.println(x+"is not found");
 }
}
/*
Output:

//1
Enter string:
Welcome
Enter character to be searched:
c
cis found at4

//2

Enter string:
Welcome
Enter character to be searched:
a
ais not found
*/
