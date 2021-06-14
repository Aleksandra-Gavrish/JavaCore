package JC_HW1;

public class Robot implements RUN_JUMP {
    int maxLength;
    int maxHeight;
    int ID;

    public Robot(int maxHeight, int maxLength, int ID) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.ID = ID;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {
        System.out.println("Робот побежал");
    }
    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгнул");
    }
    @Override
    public String toString() {
        return "Робот ID: " + ID;
    }
}