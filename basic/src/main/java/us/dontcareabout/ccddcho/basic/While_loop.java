package us.dontcareabout.ccddcho.basic;

public class While_loop {
	{	
		int n = 5;
		int i = 0;
		int j = 0;
		while( i < n ) {
			while( j <= i ) {
			System.out.print("*");
			j++;
		}
			j = 0;
			i++;
			System.out.println();
		}
		
	}
}
