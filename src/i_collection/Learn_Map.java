package i_collection;
//List: ArrayList- cho phép lưu trùng, show theo thứ tự (Sẽ dùng nhiều sau này) - add, set, remove, addAll, removeAll, get, contain
//Set: HashSet - 1 collection không thể chứa 2 giá trị trùng nhau, khai báo trùng nhưng show ra sẽ k show trùng
//Map: HashMap và HashTable - không cho phép lưu trùng key(nếu trùng thì hiểu key cuối), cho phép lưu trùng giá trị mà key ánh xạ tới.

import java.util.HashMap;
import java.util.Map;

public class Learn_Map {
    public static void main(String[] args) {
        Map<String, String> hashMap= new HashMap<String, String>(); //khởi tạo và khai báo đối tượng hashmap

        //Thêm phần tử - dùng hàm put() - không thể lưu trùng key
        hashMap.put("key1", "giatri1");
        hashMap.put("key1", "giatri2");  //không cho phép trùng key "key1", sẽ lưu Map này
        hashMap.put("key3", "giatri2");  //cho phép trùng giá trị "giatri2"
        hashMap.put("key4", "giatri4");

        //show ra Các phần tử của Map
        System.out.println(hashMap);

        //show ra từng phần tử key dùng get()
        System.out.println(hashMap.get("key1"));
        System.out.println(hashMap.get("key4"));


    }
}
