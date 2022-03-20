#include<stdio.h>
double ammount,disscount;
int main()
{
    printf("enter the ammount of purchase\n");
    scanf("%lf",&ammount);
    if (ammount>=5000);
    {
      ammount =.90*ammount;
    }
    printf(" bill of your purchase is==>%0.2lf\n",ammount);
    return 0;

}