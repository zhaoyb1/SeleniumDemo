package cn.selenium;

public class TestJava {
	
	public static void main(String[] args) {
		//一维数组的置换--
		int [] data=new int[]{1,2,3,4,5,6,7,8,9};
		//结果：987654321
		
	 
		int y=data.length-1;
		
		for(int x=0;x<data.length/2;x++){
			
			 int temp=data[x];
			 data[x]=data[y];
			 data[y]=temp;
			 y--;
			
			
		}
		
		 for(int c=0;c<data.length;c++){
			 
			 System.out.println(data[c]);
			 
		 
			 
			 
			 
		 }
		
		 
	}

}
