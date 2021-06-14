package JC_HW1;

public class Cat implements RUN_JUMP {
    int maxLength;
    int maxHeight;
    String name;

    public Cat (int maxHeight, int maxLength, String name) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.name = name;
    }
    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Кот побежал");
    }
    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгнул");
    }

    @Override
    public String toString() {
        return "Кот по кличке " + name;
    }
}