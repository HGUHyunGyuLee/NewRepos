package myFirstPackage;


import java.util.Scanner;

public class MyFirstClass {
	public int number;
	public void recieve() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		this.number = number;
		sc.close();
			}
	

}

class printing extends MyFirstClass {
	public void printingstars() {
		for(int i=0;i<this.number;i++) {
			for(int j=0;j<this.number;j++) {
				if(i<=this.number/2) {
					if(i+j<=this.number/2-1)
						System.out.print(" ");
					else if(j-i>=this.number/2+1)
						System.out.print(" ");
					else
						System.out.print("*");
				
				}
				else if(i>this.number/2) {
					if(i-j>=this.number/2+1)
						System.out.print(" ");
					else if(i+j>=this.number/2*3+1)
						System.out.print(" ");
					else
						System.out.print("*");
						
				}
			}
		 System.out.println();
	    }
	}
}


class making_stars {
	public static void main(String[] args) {
		System.out.print("홀수를 입력하세요");
		printing s1 = new printing();
		s1.recieve();
		s1.printingstars();

	}

}
/*class start {
int number;
	public void recieve() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		this.number = number;
		sc.close();
			}
	public void printingup() {
		for(int i=0;i<this.number;i++) {
			for(int j=-1;j<i;j++) {
				System.out.print("*");
			}
		System.out.println("");
		}
	}
	public void printingdown() {
		int temp = this.number-1;
		for(int i=0;i<this.number-1;i++) {
			for(int j=0;j<temp;j++) {
				System.out.print("*");
			}
		System.out.println("");
		temp--;
		}
	}
}
*/