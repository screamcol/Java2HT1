package Lesson_2;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"},
                            {"5", "6", "seven", "8"},
                            {"9", "10", "11", "12"},
                            {"13", "14", "15"}};
        try {
            System.out.println("Sum elements of array is: " + sumOfElements(array));
        } catch (MyArraySizeException e) {
            System.out.println("Incorrect size of array. Should be 4x4");
        } catch (MyArrayDataException e) {
            System.out.println("Array contains not an int number");
            e.printStackTrace();
        }

    }

    private static int sumOfElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int internalArrayLength = 0;
            for (int j = 0; j < array[i].length; j++) {
                internalArrayLength++;
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new  MyArrayDataException(i, j);
                }
            }
            if (internalArrayLength != array.length) throw new MyArraySizeException();
        }
        return sum;
    }
}
