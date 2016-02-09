class Switch{

    public static void main(String[] args)throws java.io.IOException {
        int x = 2;
        switch(x){
            case 1:
                System.out.println("1");
                System.out.println("2");
            case 2:
                System.out.println("3");
                System.out.println("4");
            case 3:
                System.out.println("5");
                System.out.println("6");
                break;
            case 4:
                System.out.println("7");
            case 5:
                System.out.println("8");
                System.out.println("9");
            default:
                System.out.println("The end");
        }
    }
}