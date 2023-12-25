package c_ham_phuongthuc;

public class static_1 {
    int rollno;      //biến toàn cục
    String name;     //biến toàn cục
    static String college = "Bưu chính viễn thông";     //biến static

    static_1 (int r, String n) {      //hàm xây dựng truyền vào tham số
        rollno = r;                //truyền tham số vào biến toàn cục
        name = n;
    }

    void display() {
        System.out.println(name + " - " + rollno + " - " + college);
    }

    public static void main(String[] args) {
        static_1 st1 = new static_1(29, "LinhLT"); //tạo 1 đối tượng thay mặt cho class để gọi lại các hàm trong class
        static_1 st2 = new static_1(25, "Huyen");
        st1.display();
        st2.display();
    }
}
