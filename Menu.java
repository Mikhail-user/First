public class Menu {
    public static void main(String [] args)throws java.io.IOException {
        System.out.println("\t    Справка\n" +
                "\n" +
                "      Нажмите цифру нужного вам пункта:\n" +
                "1) Что такое цикл for?\n" +
                "2) Что такое оператор if?\n" +
                "3) Что такое оператор switch?");
        char a = (char)System.in.read();
        System.out.println(a);
        switch(a){
            case '1':
                System.out.println("     Раньше изучали его?");
                System.out.println("1) Да");
                System.out.println("2) Нет");
                a = (char) System.in.read();
                switch(a){
                    case '1':
                        System.out.printf("Так чего спрашиваешь?!)");
                        break;
                    case '2':
                        System.out.println("Тогда учи!)))");
                        break;
                }
            case '2':
                System.out.println("По этому запросу данных нет!");
                break;
            case '3':
                System.out.println("Сам учи!)");
                break;
            default:
                System.out.println("Такого пункта меню нет...");
        }
    }
}
