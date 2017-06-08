import java.util.*;
public class Largest
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int i;
int n=scan.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=scan.nextInt();
}
Arrays.sort(a);
System.out.print(a[n-1]);
