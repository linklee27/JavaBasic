package h_mang_array;

public class Array {
    public static void main(String[] args) {

        //KHỞI TẠO MẢNG, GÁN GIÁ TRỊ VÀ DUYỆT/IN PHẦN TỬ TRONG MẢNG
        int mang1[] = new int[10];     //Khai báo và khởi tạo mảng
        mang1[0] = 2;                  //gán giá trị cho phần tử trong mảng
        mang1[1] = 4;
        mang1[3] = 6;
        for (int i : mang1) {         //dùng for / for cải tiến để duyệt, in phần tử trong mảng
            System.out.println(i);
        }

        //KHỞI TẠO MẢNG CÓ SẴN GIÁ TRỊ LUÔN, KHÔNG CẦN PHẢI GÁN GIA TRI
        String mang2[] = new String[20];
        for (int i = 0; i < 20; i++) {     //nạp giá trị chuỗi vào mảng
            mang2[i] = "Home";
        }
        System.out.println(mang2[2]);

        //MẢNG NẶC DANH, không cần đầy đủ thông tin mảng (độ dài cụ thể, k cần nạp theo vị trí cụ thể,...)
        int mang3[] = {2, 3, 4, 5, 6, 7, 8, 9};
        for (int i : mang3) {
            System.out.println(i);
        }
    }
}

//TRUYỀN MẢNG VÀO PHƯƠNG THỨC TRONG JAVA
//public class Array {
//    static void min(int mang4[]){
//
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

