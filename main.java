package JC_HW1;

public class main {
    public static void main(String[] args) {
       RUN_JUMP[] members = {
                new Man (3, 5, "Иван"),
                new Man (1, 4, "Марья"),
                new Cat(3, 4, "Том"),
                new Cat(4, 6, "Муся"),
                new Robot(0, 1, 1111),
                new Robot(4,7,999)
        };

        Barrier[] obstacles = {
                new Treadmill(1),
                new Treadmill(5),
                new Wall(1),
                new Wall(3)
        };

        for (RUN_JUMP member : members) {
            System.out.println("На старте " + member);
            boolean winner = true;
            for (Barrier obstacle : obstacles) {
                System.out.println(member + " проходит " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println(" Препятствие пройдено! ");
                } else {
                    winner = false;
                    System.out.println(" Провал! ");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " Успешно прошел испытание! ");
            } else {
                System.out.println(member + " Проиграл! ");
            }
            System.out.println();
        }
    }
}


