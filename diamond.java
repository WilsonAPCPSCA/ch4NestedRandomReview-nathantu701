import java.util.Scanner;
public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("Give me the side length of your triangle and I will draw it out");
int sideLength = in.nextInt();
int row=1;
//top half of diamond
int m = row;
for(int spacing=((sideLength*2)-1)/2; spacing>=0;spacing--) {
	int n = spacing;
	while(n>0) {
		System.out.print(" ");
		n--;		
	}
	int star = m*2-1;
	while (star>0) {
		System.out.print("*");
		star--;
		
		if (star==0) {
			System.out.println("");
		}
	}
	m++;
}
//bottom half of diamond
m=m-2;
for (int spacingBottom=1; spacingBottom<sideLength;spacingBottom++) {
	int z=spacingBottom;
	while (z>0) {
		System.out.print(" ");
		z--;		
	}
	int star = m*2-1;
	while (star>0) {
		System.out.print("*");
		star--;
		
		if (star==0) {
			System.out.println("");
		}
	}
	m--;
	
}
	
	
	
	}
}