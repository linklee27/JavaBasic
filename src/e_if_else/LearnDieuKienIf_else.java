package e_if_else;

public class LearnDieuKienIf_else {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "LinhLT";
        int diem = 45;

        //Câu lệnh if-else
        if (a < 20 && b < 30 && name.equals("LinhLT")) {        //kiểm tra điều kiện, equals là kiềm tra xem name có trùng vs chuỗi LinhLT hay không.
            System.out.println("pinggggggg");
        } else {
            System.out.println("sai oyyyy");
        }

        //Toán tử điều kiện
        String s = (a % b == 0) ? "a chia hết cho b" : "a không chia hết cho b"; // dấu ? thay cho IF, dấu : thay cho ELSE/ nếu s đúng thì... nếu s sai thì..
        System.out.println(s);

        //If - else - if
        if (diem < 40) {
            System.out.println("Tạch");
        } else if (diem >= 50) {
            System.out.println("Xếp loại D");
        } else if (diem >= 60) {
            System.out.println("Xếp loại C");
        } else if (diem >= 70) {
            System.out.println("Xếp loại B");
        } else {
            System.out.println("Xếp loại yếu");
        }

        //ví dự khác của if - else - if, kiểm tra hiển thị thông báo khi nhập email
        String message = "Lấy từ hệ thống";
        if (message == "please full value") {
            System.out.println("Chưa điền email");
        } else if (message == "please include @..") {
            System.out.println("sai format email");
        } else if (message == "please enter @..") {
            System.out.println("sai format email");
        } else {
            System.out.println("nhập Email thành công");
        }
    }
}

//if-else sử dung khi chỉ có 2 TH, nếu đúng thì in a, còn không thì in b
//if-else-if sử dụng khi có nhiều trường hợp, nếu đùng thì in a, nếu không đúng 1 thì in b, nếu k đúng 2 thì in c....