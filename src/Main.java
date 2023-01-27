import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);

        System.out.println("Элементов с списке: " + number.size());
        System.out.println("Цикл For:");
        for (int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }
        System.out.println("Цикл While:");
        Iterator <Integer> iterator= number.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Улучшенный цикл For:");
        for (Integer o : number) {
            System.out.println(o);
        }
    }

}