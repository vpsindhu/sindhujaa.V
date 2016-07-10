package binary;
import java.util.Scanner;
class Bin
{
public static void main(String args[])
{
int b[]=new int[23];
int a[]=new int[30];
int i=0;
int max=b[0];
System.out.println("enter the array value");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(i=0;i<5;i++)
{
b[i]=s.nextInt();
}
while(b[i]>0)
{
a[i++]=b[i]%2;
b[i]=b[i]/2;
}
for(int j=i-1;j<=n;j++)
{
System.out.println("binary values"+b[j]);
}
for(j=0;j<=n;j++)
{
for(f=j+1;f<=n;f++)
{
if(b[j]<b[f])
{
r=b[j];
b[j]=b[f];
b[f]=r;
}
}
System.out.println("descending order of the binary value"+r);
}
}
