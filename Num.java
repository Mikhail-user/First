

import java.util.Scanner;

class Num{

    public static void main(String[] args) {
        System.out.println("������� �����...\n" +
                "���� ������ ����� �� ���������, ������� \"0\"");
        Scanner scan = new Scanner(System.in);
        int num = 1;
        while(num!=0){
        num = scan.nextInt();
        }
        System.out.println("Exit :)");
    }
}
