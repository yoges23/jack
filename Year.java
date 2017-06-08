import java.util.*;
public class Year
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a=Scan.nextInt();
if((a%400==0)||((a%4==0)&&(a%100!=0)))
{
System.out.print("Entered year is leap year");
}
else
{
System.out.print("Entered year is not leap year");
}
}
}
