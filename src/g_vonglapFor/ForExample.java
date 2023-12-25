package g_vonglapFor;

public class ForExample {
    public static void main(String[] args) {
        //FOR ĐƠN GIẢN - LÀM VIỆC GÌ ĐÓ LẶP ĐI LẶP LẠI NHIỀU LẦN, biết số lần lặp, bắt đầu từ bao nhiêu.
        for(int i = 0; i <= 10 ; i++){
            System.out.println("HELLO" + i);
        }

        //FOREACH CẢI TIẾN - DUYỆT 1 MẢNG HOẶC 1 LIST HOẶC COLLECTION, kiểm tra từ đầu tới cuối, bản chất bắt đầu từ 0
        int arr[] = {22,33,44,55,66};  //khai báo mảng
        for (int i : arr) {            //chạy tự động cho đến hết mảng, k quan tâm mảng có bao nhiêu phần tử.
            System.out.println("HELLO" + i);
        }

        //FOR cải tiến -> chuyển sang for đơn giản nếu như xác định được con số lặp.
        int arr1[] = {22,33,44,55,66,7};  //khai báo mảng
        for (int i = 0; i <= 4; i++) {            //chạy tự động cho đến giá trị thứ 4
            System.out.println("HELLO" + arr1[i]);
        }

    }
}
//FOR
//        Khi biết số lần lặp thì dùng FOR
//        Khi không biết số lần lặp thì dùng WHITE
//        -For đơn giản: LÀM VIỆC GÌ ĐÓ LẶP ĐI LẶP LẠI NHIỀU LẦN, biết số lần lặp, bắt đầu từ bao nhiêu.
//        -For cải tiến(Foreach): DUYỆT 1 MẢNG HOẶC 1 LIST HOẶC COLLECTION, kiểm tra từ đầu tới cuối, bản chất bắt đầu từ 0
//        -For gán nhãn(ít dùng)
