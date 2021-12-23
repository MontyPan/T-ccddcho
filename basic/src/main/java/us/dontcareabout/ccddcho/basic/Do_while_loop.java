package us.dontcareabout.ccddcho.basic;

public class Do_while_loop {
	int n = 5;
	int i = 0;
	int j = 0;
			
	{
		do {
			do {
				j++;
				System.out.print("*");
				
			}while( j <= i );
				j = 0;
				i++;
				System.out.println();
		}while( i < n ) ;
			
	}
}
