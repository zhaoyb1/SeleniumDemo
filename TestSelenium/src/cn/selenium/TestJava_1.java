package cn.selenium;

public class TestJava_1 {
	public static void main(String[] args) {
		//��ά������û������ã�-- ������
		int data[][]  =new int [][]{{1,2,3},{4,5,6},{7,8,9}};
		
//		1  2  3
//		4  5  6
//		7  8  9
//		��һ��ѭ��    1  4  3      �ڶ���ѭ��       1  4  7        ������ѭ��     1   4   7 
//		        2  5  6           2  5  6           2   5   8
//              7  8  9           3  8  9           3   6   9
//		�����
//		ע���۲췢�� 1  5   9  ��λ���ǲ����   ���Է��ֵ���ѭ������ѭ���ĽǱ겻һ��ʱ���Ż��û�
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
				
				System.out.print(data[i][j]+"��");
				
			}
			 
			  
			System.out.println();
			 
		 }
		
		 
		System.out.println();
		
	}

}
