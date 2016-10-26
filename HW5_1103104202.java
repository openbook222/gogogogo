package test;

public class HW5_1103104202 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] a={{1,2,3},{4,5,6},{7,8,9}};
    int[][] b={{1,2,3},{1,2,3},{1,2,3}};
    int[][] c=new int[a.length][b[0].length];
    int i,j,k;
    for(i=0;i<a.length;i++)
    	for(j=0;j<b[i].length;j++)
    		for(k=0;k<b.length;k++)
    		c[i][j]+=a[i][k]*b[k][j];
	x(a);
	x(b);
	x(c);
	}
    public static void x(int a[][]){
		int i,j;
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++)
			{if(a[i][j]<10)
				System.out.print("[ "+a[i][j]+"] ");
			 else
				System.out.print("["+a[i][j]+"] ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
