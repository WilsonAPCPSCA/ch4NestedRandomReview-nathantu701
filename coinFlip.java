import java.util.Random;
import java.util.Scanner;
public class coinFlip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random rand = new Random();
Scanner in = new Scanner(System.in);

System.out.println("This program will stimulate flipping a fair coin");
System.out.println("How many times would you like the coin to be flipped: ");
int times = in.nextInt();
int h = 0;
int t = 0;
while (times > 0){
	double n=rand.nextInt();
	if (n>0.5){
		System.out.print("H");
		h++;
		times--;		
	}
	else if(n<0.5){
		System.out.print("T");
		t++;
		times--;
	}
	if (times==0){
		System.out.println("");
		System.out.println("There were " + h + " heads and " + t + " tails.");
	}
}
	}

}