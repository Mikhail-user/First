class AaBb{

    public static void main(String[] args)throws java.io.IOException {
        char a = (char)System.in.read();
        if(a >= 'A'&& a <='z'){
            if(a >='A'&& a <='Z')
                a+=32;
            else a -= 32;
        }

        System.out.print(a + " ");
    }
}
