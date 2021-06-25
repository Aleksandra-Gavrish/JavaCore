package JC_HW3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> list;
    public Box(T... fruit) {
        list = Arrays.asList(fruit);
    }
    public Box() {
        list = new ArrayList<T>();
    }
    public void add(T fruit) {
        list.add(fruit);
    }
    void moveTo(Box<T> box) {
        box.list.addAll(list);
        list.clear();
    }
    public void info() {
        if (list.isEmpty()) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("В коробке находятся " + list.get(0).toString() + " в количестве: " + list.size() + "штук");
        }
    }
    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }
    public boolean compare(Box<?> o) {
        return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }
}