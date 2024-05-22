package com.tulasi.www;

public class Welcome {

	public static void main(String[] args) {
		//find the unique elements.
		int arr[]= {1,3,5,2,1,9,1,1,2,3,3,7,1,6};
		int maxcount=0;int element=0;
		for(int i=0;i<arr.length;i++)
		{int count=0;
			
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
				   count++;
				}
			}
			if(maxcount<count)
			{
				maxcount=count;
				element=arr[i];
			}
			
			
			
			
		}
		
		System.out.println(element+"is repeting for "+maxcount);
	
	}
	

}
