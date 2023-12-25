package a_bien;

public class class_bien {
    String city = "ha noi"; //biến toàn cục (ngoài hàm, trong class)
    public String street; //biến toàn cục
    static String address = "thanh tri"; //biến toàn cục có static thì gọi là biến static
    public static String ten ="le linh"; //biến static

    public void hamngoaimain (){ //hàm ngoài hàm main
        int diem = 9; //khai báo biến, biến local-cục bộ (nằm trong hàm)
        System.out.println("diem = 9"); //in thông tin ra (sout)
        System.out.println(city); //gọi biến toàn cục - biến ngoài hàm
    }

    public static void main(String[] args) { //hàm main để thực thi
        String name = "linh"; //biến local
        System.out.println(name);

        //gọi biến static
        System.out.println(ten);

        //gọi biến toàn cục trong hàm main (có static) thì phải thêm static ở biến toàn cục
        System.out.println(address);

        //gọi biến toàn cục không có static
        class_bien bientoancuc = new class_bien();
        System.out.println(bientoancuc.street);

        //gọi 1 hàm khác bên ngoài hàm main (hàm hamngoaimain)
        class_bien bienlocal = new class_bien();
        bienlocal.hamngoaimain();

        //gọi class khác System.out.println(thongtin.tinhtrang);


    }
}
//       biến local
//- Nằm trong hàm
//- không dùng được trong phạm vi truy cập (public, private, rotected)
//- không gọi được sang hàm khác
//
//        biến toàn cục
//- Nằm ngoài hàm, trong class
//- dùng được trong phạm vi truy cập (public, private, rotected)
//- Có thể gọi trực tiếp trong các hàm khác nhau, ngoại trừ hàm main (hàm có static)
//
//        biến static
//- Nằm ngoài hàm, trong class với từ khóa "static"
//- dùng được trong phạm vi truy cập (public, private, rotected)
//- Có thể gọi trực tiếp trong các hàm khác nhau kể cả hàm static
//- có thể gọi biến/hàm static thông qua tên class: vd sinhvien.name
