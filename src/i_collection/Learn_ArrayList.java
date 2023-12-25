package i_collection;
//List: ArrayList- cho phép lưu trùng, show theo thứ tự (Sẽ dùng nhiều sau này) - add, set, remove, addAll, removeAll, get, contain
//Set: HashSet - 1 collection không thể chứa 2 giá trị trùng nhau, khai báo trùng nhưng show ra sẽ k show trùng
//Map: HashMap và HashTable - không cho phép lưu trùng key(nếu trùng thì hiểu key cuối), cho phép lưu trùng giá trị mà key ánh xạ tới.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Learn_ArrayList {

    //THUỘC INTERFACE LIST (thêm, xóa, lây ra độ dài - k có sắp xếp, sắp xếp ở Map v Set)
    public static void main(String[] args) {
        List<String> listmenu = new ArrayList<String>();        //khai báo và khởi tạo đối tuong ArrayList - cách 1
        //ArrayList <String> listmenu = new ArrayList<String>(); //khái báo cách 2

        //Thêm phần tử vào bộ ArrayList - dùng hàm add
        listmenu.add("Menu1");
        listmenu.add("Menu2");
        listmenu.add("Menu3");
        listmenu.add("Menu4");
        listmenu.add("Menu5");

        //tính độ dài của ArrayList - dùng hàm size()
        System.out.println(listmenu.size());
        System.out.println("-----------");

        //sửa nội dung phần tử vị trí số 1 (chạy tử 0)
        listmenu.set(1, "Menuedit");

        //xóa phần tử - dùng hàm remove()
        listmenu.remove(2);

        //copy phần tử của list 1 sang list 2 - dùng addAll
        //list 1: listmenu
        //list 2: tempmenu
        List<String> tempmenu = new ArrayList<String>();
        tempmenu.addAll(listmenu);
        for (String obj : tempmenu) {         //dùng for để duyệt phần tử, in ra kết quả list 2
            System.out.println(obj);
        }
        System.out.println("-----------");

        //Tìm kiếm giá trị - giá trị là menu thì trả về TRUE, còn k có thì FALSE
        System.out.println(listmenu.contains("Menu"));
        System.out.println("-----------");

        //show giá trị phần tử - dùng for, foreach, interator
        //Cách 1 - dùng for, hàm Get()
        for (int i = 0; i < listmenu.size(); i++) {
            System.out.println(listmenu.get(i));
        }
        System.out.println("-----------");

        //Cách 2 - dùng foreach
        for (String obj1 : listmenu) {
            System.out.println(obj1);
        }
        System.out.println("-----------");

        //Cách 3 - dùng interator
        Iterator<String> interator = listmenu.iterator();
        while (interator.hasNext()) {                      //dùng white là do không biết điểm dừng, giới hạn trong ArrayList
            System.out.println(interator.next());           //print là in không xuống dòng, println là in xuống dòng
        }
    }

}

