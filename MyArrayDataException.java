public class MyArrayDataException extends MyException {
    MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные в ячейке [%d, %d]\n", row, col));
    }
}
