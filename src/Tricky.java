/*
  	ISYS 320
  	Name(s): Timothy James
  	Date: 11/1/2017
*/

/* 1. It will output message 1, message 2, message 1, 
 * done w/message 2, and done w/ main.
*/

public class Tricky {
    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }
    
    public static void message1() {
        System.out.println("This is message1.");
    }
    
    public static void message2() {
        System.out.println("This is message2.");
        message1();
        System.out.println("Done with message 2.");
    }
}

/* 3. I was correct. At first I thought it was going 
 * to just output message 1, message 2, done w/message 2, 
 * and done w/ main. I did not catch the hidden "message1();"
 * in the second static void message at first glance but after
 * looking a little closer I suspect that this was the "Tricky"
 * part.
 */
 
 

