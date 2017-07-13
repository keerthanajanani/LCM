# LCM
import java.io.*;
import java.util.*;
public class LCM
{
public static void main(String args[])throws IOException
{
int a,b,c=0,d,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first number");
a=Integer.parseInt(br.readLine());
System.out.println("Enter second number");
b=Integer.parseInt(br.readLine());
c=a*b;
d=c;
for(i=1;i<=c;i++)
{
if(i%a==0 && i%b==0 && i<d)
d=i;
}
System.out.println("The LCM : "+d);
}
}
