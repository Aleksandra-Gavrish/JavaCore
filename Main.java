package JC_HW3;
public class Main {
public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box();
        Box<Apple> appleBox2 = new Box();
        Box<Orange> OrangeBox = new Box();


        for (int i = 0; i < 4; i++) {
            appleBox1.add(new Apple());
        }
        for (int i = 0; i < 8; i++) {
            appleBox2.add(new Apple());
        }
        for (int i = 0; i < 9; i++) {
            OrangeBox.add(new Orange());
        }
        appleBox1.info();
        appleBox2.info();
        OrangeBox.info();

        Float apple1Weigth = appleBox1.getWeight();
        Float apple2Weigth = appleBox2.getWeight();
        Float orangeWeigth = OrangeBox.getWeight();
        System.out.println("Вес коробки 1 с яблоками: " + apple1Weigth + " кг ");
        System.out.println("Вес коробки 2 с яблоками: " + apple2Weigth + " кг ");
        System.out.println("Вес коробки с апельсинами: " + orangeWeigth + " кг ");

        System.out.println("Сравнить вес appleBox1 и OrangeBox: " + appleBox1.compare(OrangeBox));
        System.out.println("Сравнить вес appleBox2 и OrangeBox: " + appleBox2.compare(OrangeBox));

    appleBox1.moveTo(appleBox2);

    appleBox1.info();
    appleBox2.info();
    OrangeBox.info();
        }
        }
