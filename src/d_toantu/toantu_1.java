package d_toantu;

public class toantu_1 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //toán tử số học
        System.out.println("hiệu là" + ":" + (a/b));
        System.out.println("tổng là" + ":" + (a+b));
        System.out.println(a*b);
        //System.out.println(a+=b); //a=a+b rồi lưu = 30

        //toán tử so sánh
        System.out.println(a>b);
        System.out.println(a==b);

        //toán tử logic
        System.out.println((a > 30) && (b < 20));
        System.out.println((a>10) || (b>10));

        //toán tử gán
        String name, address, city; //khai báo tất cả là kiểu string
        name = address = city = "đồng tháp"; // cùng giá trị là đông tháp
        System.out.println(name + address + city);
    }
}
