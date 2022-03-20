#include<stdio.h>
int num1,num2,num3;
int main()
{
    printf("enter three values here sequencely\n");
    scanf("%d%d%d",&num1,&num2,&num3);
    if(num1>num2)
    {
        if(num1>num3)
         {
             printf("%d",num1);
         }
        else(num3>num2)
        {
            printf("%d",num3);
        }
    }
    else(num2>num3)
    printf("%d",num2);
    return 0;
}