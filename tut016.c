#include<stdio.h>
void func1(char str[])
{
    int i=0;
    while (str[i]!='\0')
    {
        printf("%c",str[i]);
        i++;
    }
    
   printf("\n");
    
}
int main(){
    char str[34];
printf("enter the strings\n");
gets(str);
printf("using printf %s\n",str);
printf("using puts: \n");
puts(str);
printf("using function \n");
func1(str);

return 0;
}