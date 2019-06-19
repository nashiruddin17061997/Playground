#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int n1=n;
  int n2=n;
  int sum=0;
  int temp=0; int temp1=0;
  int count=0;
     while(n>0){
       temp=n%10;
       count++;
       n=n/10;
     }
  while(n1>0){
    temp1=n1%10;
    sum=sum+(temp1*temp1*temp1);
    n1=n1/10;
  }
  if(sum==n2)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");

	return 0;
}