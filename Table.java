/**
 * Created by Михаил on 17.01.2016.
 */
public class Table {
    public static void main(String [] args){
        boolean a = true, b = true;
        System.out.println("A\t    B\t    AND\t    OR\t    XOR\t    NOT\n" +
                "" + a + "\t" + b + "\t" + (a&b) + "\t" + (a|b) + "\t" + (a^b) + "\t" + (!a) + "\n" +
                "" + a + "\t" + (b = false) + "\t" + (a&b) + "\t" + (a|b) + "\t" + (a^b) + "\t" + (!a) + "\n" +
                "" + (a = false) + "\t" + (b = true) + "\t" + (a&b) + "\t" + (a|b) + "\t" + (a^b) + "\t" + (!a) + "\n" +
                "" + a + "\t" + (b = false) + "\t" + (a&b) + "\t" + (a|b) + "\t" + (a^b) + "\t" + (!a));
    }
}
