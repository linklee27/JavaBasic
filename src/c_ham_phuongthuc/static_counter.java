package c_ham_phuongthuc;

public class static_counter {
    static int count = 0;     //biến static, khởi tạo với count = 0

    static_counter() {         //khởi tạo class để tính toán mỗi lần khởi tạo class sẽ tăng lên 1
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        static_counter st1 = new static_counter(); //khởi tạo class lần 1, count = 1
        static_counter st2 = new static_counter(); //khởi tạo class lần 2, count = 2
        static_counter st3 = new static_counter(); //khởi tạo class lần 3, count = 3

    }
}
