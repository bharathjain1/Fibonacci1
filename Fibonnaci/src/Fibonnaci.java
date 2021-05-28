
import java.util.*;
import java.io.*;

public class Fibonnaci {
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	//reading the number of tests to be taken.
    System.out.println("enter the test cases");
	//creating an array
    int ar[]=new int[26];
    int i,p,k=0,f1=0,f2=0;
        int t=sc.nextInt();
        sc.nextLine();
        //entering the string value
        for(int i1=0;i1<t;i1++)
        {
        	String str=sc.next();
        	for(i=0;i<str.length();i++)
        {
		
        		p=(int)str.charAt(i)-97;//no of string unique charcters in the string
        		ar[p]++;
        
        }
        	for(i=0;i<26;i++)
        	{
        		if(ar[i]>0)
        		k++;
        	}
        	int a[]=new int[k];
        	k=0;
        	for(i=0;i<26;i++)// storing the value into new array
        	{
        		if(ar[i]>0)
        		
        			a[k++]=ar[i];
        	}
        		Arrays.sort(a);//sorting array a[]
        		if(k>2)
        		{
        			for(i=2;i<k;i++)   // checking for condition satisfy
        			{
        				if(a[i]!=(a[i-1]+a[i-2]))
        				{
        					f1=1;
        					break;
        				}
        			}
        			
        			p=a[0];             //shifting the values to check 
        			a[0]=a[1];			
        			a[1]=p;
        			
        			for(i=2;i<k;i++)
        			{
        				if(a[i]!=(a[i-1]+a[i-2]))
        				{
        					f2=1;
        					break;
        				}
        			}
        	}
        		if(f1==0||f2==0)//if flag is 0 then its dynami
        	System.out.println("Dynamic");
        	else
        	System.out.println("Not");
        }
        	}
        		
	}
        	
        	
        
        
		
	



