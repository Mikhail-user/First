public class Menu {
    public static void main(String [] args)throws java.io.IOException {
        System.out.println("\t    �������\n" +
                "\n" +
                "      ������� ����� ������� ��� ������:\n" +
                "1) ��� ����� ���� for?\n" +
                "2) ��� ����� �������� if?\n" +
                "3) ��� ����� �������� switch?");
        char a = (char)System.in.read();
        System.out.println(a);
        switch(a){
            case '1':
                System.out.println("     ������ ������� ���?");
                System.out.println("1) ��");
                System.out.println("2) ���");
                a = (char) System.in.read();
                switch(a){
                    case '1':
                        System.out.printf("��� ���� �����������?!)");
                        break;
                    case '2':
                        System.out.println("����� ���!)))");
                        break;
                }
            case '2':
                System.out.println("�� ����� ������� ������ ���!");
                break;
            case '3':
                System.out.println("��� ���!)");
                break;
            default:
                System.out.println("������ ������ ���� ���...");
        }
    }
}
