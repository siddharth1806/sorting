
package sort;
import java.util.*;
interface sortoperations
{
	void sortm1(int arr[]);
	 void sortm2(int arr[]);
	 void sortm3(int arr[]);
	
}
class Mysort implements sortoperations
{
	public void sortm1(int[] arr)
	{
		int flag;
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}		
			}
		}
		for(int k=0;k<=arr.length;k++)
		{		
		System.out.println(arr[k]);	
		}
	}
	public  void sortm2(int[] arr)
	{
		int flag;
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}		
			}
		}
	for(int k=0;k<=arr.length;k++)
		{		
		System.out.println(arr[k]);	
		}	
	}
	public void sortm3(int[] arr)
	{
		int flag=0;
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}		
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int k=0;k<=arr.length;k++)
		{		
		System.out.println(arr[k]);	
		}
	}	
}
public class Test88
{
	public static void main(String[] args)
	{
		int arr[]={34,56,7,45,3};
		System.out.println("By which method you want to sort ");
		System.out.println("enter 1 for method 1");
		System.out.println("enter 2 for method 2");
		System.out.println("enter 3 for method 3");		
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		Mysort obj=new Mysort();
		if(z==1)
		{
			obj.sortm1(arr);
		}
		else if(z==2)
		{
			obj.sortm2(arr);
	
		}
		else if(z==3)
		{
			obj.sortm3(arr);
		}		
	}

}
