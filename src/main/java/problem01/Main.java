package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		int tens = 0;
		int ones = 0;
		int claps = 0;
		//System.out.println(numberString);
		if (number < 10) {
			ones =  number % 10;
			if (ones == 3) {
				claps += 1;
			}
			if (ones == 6) {
				claps += 1;
			}
			if (ones == 9) {
				claps += 1;
			}
			return claps;
		}
		else {
			tens = number / 10;
			ones =  number % 10;
			if (tens == 3) {
				claps += 1;
			}
			if (tens == 6) {
				claps += 1;
			}
			if (tens == 9) {
				claps += 1;
			}
			if (ones == 3) {
				claps += 1;
			}
			if (ones == 6) {
				claps += 1;
			}
			if (ones == 9) {
				claps += 1;
			}
			return claps;
		}
	}
}