package Inheritance;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] [] = new int[2] [3];
		a[0][0]= 0;
		a[0][1]= 6;
		a[0][2]= 8;
		a[1][0]= 10;
		a[1][1]= 4;
		a[1][2]= 50;
		/*int b[][]={{4,3,2},{5,6,8}};
		System.out.println(b[1][2]);*/
		
		int min=a[0][0];
		int minimumcolumn=0;
		
		
		
		for(int i=0;i<2;i++)   //row
		{
			for(int j=0;j<3;j++)// cloumn
			{
				//System.out.println(a[i][j]);
				if (a[i][j]<min)          // to find the minimum value in multi dimensional array
				{
					min=a[i][j];
					minimumcolumn=j; //  give the column of minimum value
					
				}
			}
		}
		System.out.println(min);
		// max value in identified column
		int max=a[0][minimumcolumn];
		int k=0;
		while(k<2)
		{
			if (a[k][minimumcolumn]>max)
			{
				max= a[k][minimumcolumn];
			}
			k++;
		}
		System.out.println(max);
	}

}
