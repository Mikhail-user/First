class Guess{

    public static void main(String[] args)throws java.io.IOException {
        char scan = 'a', answer = 'g';
        System.out.println("������ ����� :)");
    while(scan!='g') {
        scan = (char) System.in.read();
        if (scan == 'g')
            System.out.println("������ ! :)");
        else System.out.println(" :( �� ������... ������ ���! :)");
       }
    }
}
