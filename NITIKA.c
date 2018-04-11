#include<stdio.h>
#include<string.h>
#include<ctype.h>
int main()
{
	int i,len,temp,count=0;
	int j,t;
	char str[100];
	scanf("%d",&t);
	getchar();
	for(j=0;j<t;j++)
	{   
	    count=i=temp=0;
        gets(str);
        //scanf("%[^\t\n]s",&str);
        len=strlen(str);
        str[0]=toupper(str[0]);
        printf("%c",str[0]);
        for(i=0;i<len;i++)
        {
            if(str[i]==' ')
	        {
	            count++;
	        	str[i]='.';
	        	printf("%c ",str[i]);
	        	i++;
	        	str[i]=toupper(str[i]);
	        	printf("%c",str[i]);
	        	temp=i;
	   	    }
	   	    if(i<len)
	   	    {
	   	         if(count==0)
	   	         {
	                temp=0;
	       	     }
   	        }
	    }
	    temp=temp+1;
        for(i=temp;i<len;i++)
        {
            str[i]=tolower(str[i]);
            printf("%c",str[i]);
        }
        printf("\n");
	}
return 0;
}
