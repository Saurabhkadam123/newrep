#include<stdio.h>
int main()
{
    int count;
    printf("enter the count of covid petient\n");
    scanf("%d",&count);
    if (count>=1000)
      {
          printf("impose lockdown");
      }
    else
      { 
           printf("no lockdown but follow the rules properly");
      }

return 0;
}