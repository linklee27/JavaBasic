package c_ham_phuongthuc;

public class Phuongthuc {
    public void ShowInfo(){ //khai báo hàm không trả về - có void
        System.out.println("Lê Thị Linh");
        System.out.println("29 tuổi");
    }

    public static String getName(){ //Khai báo hàm trả về - không có void
        return "LinhLT";            // return chuỗi cùng kieeur du liệu
    }
    public  static String getName1(){ //Khai báo hàm trả về - không có void
        String name = "LinhLT1";
        return name;            // return biến cùng kieeur du liệu với phương thưc
    }

    private static int getAge(){
        int age = 30;
        return age;
    }

    public int cong2so (int a, int b){         //Truyền tham số cho hàm trả về- cùng kiểu dữ liệu
        return a + b;
    }


    protected void thongtin(String name, int age){ //Truyền tham số cho hàm không trả về - khác kiểu dữ liệu
        System.out.println(name);
        System.out.println(age);
        System.out.println(name + age);
    }


    public static void main(String[] args) {
        Phuongthuc PT = new Phuongthuc(); //tạo 1 đối tượng thay mặt cho class để gọi lại các hàm trong class

        PT.ShowInfo();                       //gọi hàm ShowInfo thông qua class (đã có sout rồi)

        System.out.println(getName());       //gọi hàm getName thông qua class  (chưa có sout)

        System.out.println(getName1());      //gọi hàm getName1 thông qua class

        System.out.println(getAge() + 10);   //gọi hàm getAge thông qua class, in ra có thể tính toán tùy ý

        System.out.println(PT.cong2so(5,6)); //gọi hàm cong2so thong qua class

        PT.thongtin("Linh",29);   //gọi hàm thongtin thông qua class
        PT.thongtin("Huyen",24);





    }
}
