package f_swich_case;

public class SwitchExampleBreak {
    public static void main(String[] args) {
        int number = 10;                  //dùng swich gọn hơn dùng if else if => hay dùng swich hơn
        switch (number){                  //có BREAK-kiểm tra xem giá trị number rơi vào case nào thì sẽ thực thi case đó và thoát khỏi swich case;
            case 10:
                System.out.println("giá trị là 10");
                break;
            case 20:
                System.out.println("giá trị là 20");
                int a = 3;
                int b = 4;
                System.out.println(a+b);
                break;
            default:
                System.out.println("không có giá trị nào");
        }

    }
}
