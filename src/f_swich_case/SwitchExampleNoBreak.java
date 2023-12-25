package f_swich_case;

public class SwitchExampleNoBreak {
    public static void main(String[] args) {
        int number = 20;
        switch (number){  //swich khong có BREAK- kiểm tra xem giá trị number rơi vào case nào thì sẽ thực thi case đó và thực thi tiếp các case sau case đó mà k cần kiểm tra.
            case 10:
                System.out.println("giá trị là 10");
            case 20:
                System.out.println("giá trị là 20");
            case 30:
                System.out.println("giá trị là 30");
                int a = 10;
                int b = 20;
                System.out.println(a+b);
            default:
                System.out.println("Không có giá trị nào");
        }
    }
}
