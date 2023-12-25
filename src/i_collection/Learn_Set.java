package i_collection;
//List: ArrayList- cho phép lưu trùng, show theo thứ tự (Sẽ dùng nhiều sau này) - add, set, remove, addAll, removeAll, get, contain
//Set: HashSet - 1 collection không thể chứa 2 giá trị trùng nhau, khai báo trùng nhưng show ra sẽ k show trùng
//Map: HashMap và HashTable - không cho phép lưu trùng key(nếu trùng thì hiểu key cuối), cho phép lưu trùng giá trị mà key ánh xạ tới.

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Learn_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();   //khai báo và khởi tạo đối tuong HashSet - hàm sắp xếp các phần tử trong mảng

        //Thêm đối tượng - dùng hàm add() - không cho phép lưu trùng
        set.add("Set1");
        set.add("Set1");
        set.add("Set3");
        set.add("Set4");
        set.add("Set5");

        //Xóa phần tử khỏi manng
        set.remove("Set3");

        //show giá trị phần tử - dùng for, foreach, iterator
        //Cách 1 dùng Iterator
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //Cách 2 dùng foreach
        System.out.println();
        for(String obj :set){
            System.out.println(obj);
        }
    }
}
