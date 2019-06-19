#include <stdio.h>
int main() {
	int n;
    scanf("%d",&n);
      int num=0;
    for(num=1;num<=n;num++){
      if((num%2)==1){
        printf("%d\n",num);
    }
    }
	return 0;
}