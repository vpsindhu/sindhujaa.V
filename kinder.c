#include<stdio.h>
#include<conio.h>
int main()
{
int a,b,c,i,j=1;
printf("Enter the n values:");
scanf("%d",&a);
printf("Enter the pair:");
scanf("%d",&c);
for(i=0;i<2*c;i++)
{
b=2*a-i;
if(c!=b)
{
printf("The pair is %d\n",c,j++,c);
}
}
return 0;
getch();
}
