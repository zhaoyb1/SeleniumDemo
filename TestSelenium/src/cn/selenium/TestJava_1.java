package cn.selenium;

public class TestJava_1 {
	public static void main(String[] args) {
		//二维数组的置换（倒置）-- 等行列
		int data[][]  =new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		
//		1  2  3
//		4  5  6
//		7  8  9
//		第一次循环    1  4  3      第二次循环       1  4  7        第三次循环     1   4   7 
//		        2  5  6           2  5  6           2   5   8
//              7  8  9           3  8  9           3   6   9
//		结果：
//		注：观察发现 1  5   9  的位置是不变的   可以发现当外循环和内循环的角标不一致时，才会置换
//		1  4  7
//		2  5  8
//		3  6  9
//		
		for(int x=0;x<data.length;x++){
			for(int y=x;y<data[x].length;y++){
				if (x!=y) {
					
					int temp=data[x][y];
					data[x][y]=data[y][x];
					data[y][x]=temp;
				}
				
			}
			
		}
		
		
		for(int i=0;i<data.length;i++){
			for (int j = 0; j < data[i].length; j++) {
				
				System.out.print(data[i][j]+"、");
				
			}
			 
			  
			System.out.println();
			 
		 }
		
		 
		System.out.println();
		
	}

}
