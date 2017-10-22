import java.util.Random;
import java.util.Scanner;
public class diceHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner (System.in);
Random rand = new Random();
System.out.println("This program will stimulate tossing a pair of dice.");
System.out.println("How many times would you like the pair of dice to be tossed?");
int toss=in.nextInt();
System.out.println("Here is the sequence of sums, one for each toss:");
int two=0;
int three=0;
int four=0;
int five=0;
int six=0;
int seven=0;
int eight=0;
int nine=0;
int ten=0;
int eleven=0;
int twelve=0;

for (toss=toss; toss > 0;toss--) {
	int dice=rand.nextInt(12)+2;	
	System.out.print(dice + " ");
	if (dice ==2) {
		two++;
	}
	if (dice ==3) {
		three++;
	}
	if (dice ==4) {
		four++;
	}
	if (dice ==5) {
		five++;
	}
	if (dice ==6) {
		six++;
	}
	if (dice ==7) {
		seven++;
	}
	if (dice ==8) {
		eight++;
	}
	if (dice ==9) {
		nine++;
	}
	if (dice ==10) {
		ten++;
	}
	if (dice ==11) {
		eleven++;
	}
	if (dice ==12) {
		twelve++;
	}
	
	
}
System.out.println("");

//Histogram
System.out.print("2:");
for (two=two;two>0;two--) {
	System.out.print("*");	
}
System.out.println("");
System.out.print("3:");
for (three=three;three>0;three--) {
	System.out.print("*");	
}
System.out.println("");
System.out.print("4:");
for (four=four;four>0;four--) {
	System.out.print("*");
}
System.out.println("");
System.out.print("5:");
for (five=five;five>0;five--) {
	System.out.print("*");	
}
System.out.println("");
System.out.print("6:");
for (six=six;six>0;six--) {
	System.out.print("*");	
}
System.out.println("");
System.out.print("7:");
for (seven=seven;seven>0;seven--) {
	System.out.print("*");	
}
System.out.println("");
System.out.print("8:");
for (eight=eight;eight>0;eight--) {
	System.out.print("*");	
}
System.out.println("");
System.out.print("9:");
for (nine=nine;nine>0;nine--) {
	System.out.print("*");	
}
System.out.println("");
System.out.print("10:");
for (ten=ten;ten>0;ten--) {
	System.out.print("*");
}
System.out.println("");
System.out.print("11:");
for (eleven=eleven;eleven>0;eleven--) {
	System.out.print("*");	
}
System.out.println("");
System.out.print("12:");
for (twelve=twelve;twelve>0;twelve--) {
	System.out.print("*");	
}
System.out.println("");

	}

}
