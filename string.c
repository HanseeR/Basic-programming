//to implement major functions of string.h in single c program using switch case to select specific finctions from user choie (like strlrn,strcat,strcpy,stremp,strrev)


#include<stdio.h>
#include<string.h>
main()
{
	int a,b;
	char s1[100],s2[100];
	printf("Enter the string.\n");
	scanf("%s",s1);
	//strlen(),strrev(),strcat(),strupr(),stremp()
	printf("Enter the operation you wish to perform on the string \n1. String Length\n2.String Reverse\n3. String Concatination\n4. String Copy\n5. String Upper Case\n6. String Lower case\n7.String Comparison\n ");
    scanf("%d",&a);	
    switch(a)
    {
	
    {
    	case 1:
    		b=strlen(s1);
    		printf("String length=%d",b);
    		break;
	}
	case 2:
		{
			printf("String Reverse=&d",strrev(s1));
		}
		case 3:
			{
				printf("Enter the target string.\n");
				scanf("%s",s2);
				strcat(s2,s1);
				printf("Result=%s",s2);
			}
			case 4:
				{
					strcpy(s2,s1);
					printf("copied string =%s",s2);
					break;
				}
                case 5:
                	{
                		printf("The upper case of string is %s",strupr(s1));
                		break;
					}
                      case 6:
                      	{
                      		printf("The lower case of the string is%s",strlwr(s1));
                      		break;
						  }
						  case 7:
						  	{
						  		printf("Enter the string you wish to compare to previous one\n");
						  		scanf("%s",s2);
						  		a=strcmp(s1,s2);
						  		printf("String Compare %d",a);
						  		break;
							  }
                                default:
                                {
                                	printf("You have not entered a valid option");
                                	
								}
								
							}
						}
								





















