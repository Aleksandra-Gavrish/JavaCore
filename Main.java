package JC_HW2;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"2", "2", "2", "2"},
                {"3", "3", "3", "3"},
                {"4", "4", "4", "4"},
        };
            try {
                int result = task(arr);
                System.out.println(result);
            }
            catch (MyArraySizeException ex) {
                System.out.println("Слишком большой объем массива!");
            }
            catch (MyArrayDataException ex) {
            System.out.println("Неправильное значение массива!");
            System.out.println("Ошибка в ячейке: " + ex.i + "-" + ex.j);
        }
    }

    public static int task(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    summ = summ + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return summ;
    }
}


