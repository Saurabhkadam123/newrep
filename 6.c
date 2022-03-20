#include<stdio.h>
int main()
{
    int num=10;
    int *ptr;
    ptr=&num;
    printf("%d\n",num);//10
    printf("%u\n",&num);//6422300
    printf("%d\n",ptr);//6422300
    printf("%u\n",&ptr);//6422296
    printf("%d\n",*ptr);//10
    *ptr=1000;
    printf("%d\n",num);//10
    printf("%u\n",&num);//6422300
    printf("%d\n",ptr);//6422300
    printf("%u\n",&ptr);//6422296
    printf("%d\n",*ptr);//10
    return 0;
}