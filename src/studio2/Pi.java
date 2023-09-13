package studio2;

import java.util.Scanner;


public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int times = 0;
		System.out.print("How many times? ");
		int t = in.nextInt();
		for (int i=1;i<=t;i++)
		{
			
		double Random = (double)(Math.random() * 4);
		if (Random <= Math.PI)
				{
			times ++;
				}
		
	}
		double pi = ((double)times / t);
		System.out.print(pi);

}
}