package org.ibm.test.git;

public class MultiplePrgm3 {
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[3]=90;
		

		System.out.println(a[2]);
int l=a.length;
System.out.println(l);
for (int i=0;i<a.length;i++) {
	System.out.println(a[i]);
	
}
for(int x:a)
{
	System.out.println(x);
}
		
	}

}
