class Guess{

    public static void main(String[] args)throws java.io.IOException {
        char scan = 'a', answer = 'g';
        System.out.println("Угадай букву :)");
    while(scan!='g') {
        scan = (char) System.in.read();
        if (scan == 'g')
            System.out.println("Угадал ! :)");
        else System.out.println(" :( Не угадал... Пробуй еще! :)");
       }
    }
}
