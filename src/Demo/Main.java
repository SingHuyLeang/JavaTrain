package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        // for each
        for (Integer integer : list) {
            System.out.println(integer);
        }
        // for i
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
        // .forEach
        list.forEach(a-> System.out.println(a));
//        list.forEach(System.out::println); lamda
    }
}
// .add();
// .get();
// .set();
// .contain();
// .clear();
// .clone();
