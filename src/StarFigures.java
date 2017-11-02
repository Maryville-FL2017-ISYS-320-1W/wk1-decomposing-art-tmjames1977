/*
  	ISYS 320
  	Name(s): Timothy James
  	Date: 11/1/2017
*/

// 4. Your pseudocode algorithm for how to break down the figure
/* for (each 2 lines) {
 *  print 5 stars.
 *  }
 * for {
 * print 1 space.
 * print 1 star.
 * print 1 space.
 * print 1 star.
 * print 1 space.
 * }
 * 
 * 
 * for (each 2 lines) {
 *  print 5 stars.
 *  }
 * for {
 * 	print 1 space.
 * 	print 1 star.
 * 	print 1 space.
 * 	print 1 star.
 * 	print 1 space.
 * }
 * for (each 2 lines) {
 *  print 5 stars.
 *  }
 * 
 * for (each 3 lines) {
 * 	print 2 spaces.
 *  print 1 star.
 *  print 2 spaces.
 * for (each 2 lines) {
 *  print 5 stars.
 *  }
 *  for {
 * 	print 1 space.
 * 	print 1 star.
 * 	print 1 space.
 * 	print 1 star.
 * 	print 1 space.
 * } 
 */

public class StarFigures {
	public static void main(String[] args) {
		separater();
		star();
		blank();
		separater();
		star();
		separater();
		blank();
		linestar();
		separater();
		star();
	}

	public static void separater() {
		System.out.println("*****");
		System.out.println("*****");
	}
	public static void star() {
		System.out.println(" * * ");
		System.out.println("  *  ");
		System.out.println(" * * ");
	}
	
	public static void linestar() {
		for (int i=0; i<3; i++) {
			System.out.println("  *  ");
		}
	}
	
	public static void blank() {
		System.out.println("");
	}
}
