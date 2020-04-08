package Lesson_2;

public class MyArrayDataException extends RuntimeException {
    private int xCoordinate;
    private int yCoordinate;

    MyArrayDataException(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public void printStackTrace() {
        System.out.printf("In cell [%d][%d] not an int number", xCoordinate, yCoordinate);
    }
}
