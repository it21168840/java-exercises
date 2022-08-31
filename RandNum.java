import java.util.Scanner;
public class RandNum {
	Random R = new Random();

	int array[][]= new int[5][5];
	int maximum=1;
	int minimum=100;   
	int total=0;
	
	double average;
	
	public RandNum() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				array[i][j]= r1.nextInt(100);    
				array[i][j]++;   
		}
	}
	
	public void calculate() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
				if(array[i][j]>maximum) {
					this.maximum= this.array[i][j];
				}
				if(array[i][j]<minimum) {
					this.minimum=this.array[i][j];
				}
				this.total+=array[i][j];
			}
		}
		
		this.average= (double) this.total/25.0;
	}
	
	public void display() {
		
		System.out.println("The array");
		for(int i=0;i <5 ;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(array[i][j]+"\t");
			}
		System.out.println();
		}
		
		System.out.println(" Maximum = " + this.maximum);
		System.out.println("Minimum ="+ this.minimum);
		System.out.println("Average = "+ this.average);
	}	
}
public class MyMain{

	public static void main(String[] args) {
		RandNum R=  new RandNum();
		
		R.calculate();
		R.display();
	}

}
