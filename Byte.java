import java.util.Scanner;

class Byte{

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
         int b = a.nextInt();
         int f = b/128;
         int c = b%128;
        if(f%2!=0)c+=-128;
         byte d = (byte)c;
        System.out.println(d);
        d = (byte)b;
        System.out.println(d);
    }
}
