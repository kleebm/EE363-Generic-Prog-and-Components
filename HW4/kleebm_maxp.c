#include <stdio.h>

/*@ requires \valid(p) && \valid(q);
    ensures *p <= *q;
    ensures (*p == \old(*q) && *q == \(*q) ||
            *q == \old(*p) && *p == \old(*q));
*/
void maxptr(int* p, int*q){
 if(*p > *q){
	int temp = *p;
	*p = *q;
	*q = temp;
 }
}

main(){
	int *a;
	int *b;
	int w = 20;
	int x = 10;
	a = &w;
	b = &x;

	printf("Before: a is:%d @ %d  \n  b is:%d @ %d \n ",a,*a,b,*b);
	maxptr(a,b);
	printf("After: a is:%d @%d  \n   b is: %d @ %d \n ",a,*a,b,*b);

	int y = 10;
	int z = 20;
	a = &y;
	b = &z;

	printf("Before: a is %d @ %d \n b is:%d @ %d \n  ",a,*a,b,*b);
	maxptr(a,b);
	printf("After: a is %d @ %d \n b is:%d @ %d \n ",a,*a,b,*b);
}
