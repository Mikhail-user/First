/**
  Created by Михаил on 17.01.2016.
 */
// Заменил true на 1, а false на 0.

public class Table2 {
    public static void main(String [] args){
        boolean a = true, b = true;
        System.out.println("A\tB\tAND\tOR\tXOR\tNOT\n" +
                "" + (a?1:0) + "\t" + (b?1:0) + "\t" + ((a&b)?1:0) + "\t" + ((a|b)?1:0) + "\t" + ((a^b)?1:0) + "\t" + ((!a)?1:0) + "\n" +
                "" + (a?1:0) + "\t" + ((b = false)?1:0) + "\t" + ((a&b)?1:0) + "\t" + ((a|b)?1:0) + "\t" + ((a^b)?1:0) + "\t" + ((!a)?1:0) + "\n" +
                "" + ((a = false)?1:0) + "\t" + ((b = true)?1:0) + "\t" + ((a&b)?1:0) + "\t" + ((a|b)?1:0) + "\t" + ((a^b)?1:0) + "\t" + ((!a)?1:0) + "\n" +
                "" + (a?1:0) + "\t" + ((b = false)?1:0) + "\t" + ((a&b)?1:0) + "\t" + ((a|b)?1:0) + "\t" + ((a^b)?1:0) + "\t" + ((!a)?1:0));
    }
}
