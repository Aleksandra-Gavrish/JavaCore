package JC_HW1;

public class Man implements RUN_JUMP {
    int maxLength;
    int maxHeight;
    String name;

    public Man ( int maxLength, int maxHeight, String name) {
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
        System.out.println("Человек побежал");
    }
    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгнул");
    }
    @Override
    public String toString() {
        return "Человек по имени " + name;
    }
}