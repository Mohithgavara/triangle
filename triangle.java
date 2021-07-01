import java.util.*;
class triangle
{
public static void main(String args[])
{
int n,i,j;
Scanner sc=new Scanner(System.in);
System.out.print("enter n value");
n=sc.nextInt();
for(i=n-1;i>=0;i--)
{
for(j=0;j<=i;j++)
{
System.out.print("*"+" ");
}
System.out.println();
}
}
}
