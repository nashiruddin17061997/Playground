#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int fact=1;
  int i=0;
  for(i=1;i<=n;i++){
    fact=fact*i;
  }
  printf("%d",fact);

	return 0;
}