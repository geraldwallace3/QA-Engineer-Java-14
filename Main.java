public class Main {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"11", "22", "33", "44"},
                {"55", "66", "77", "88"},
                {"99", "00", "111", "222"},
                {"333", "444", "555", "666"}
        };
        String[][] incorrectSizeMatrix = {
                {"11", "22", "33", "44"},
                {"55", "66", "77", "88"},
                {"99", "00", "111", "222"},
        };
        String[][] incorrectDataMatrix = {
                {"11", "22", "33", "44"},
                {"55", "66", "77", "88"},
                {"RR", "00", "111", "222"},
                {"333", "444", "555", "666"}
        };
        try {
            System.out.println("Сумма элементов массива равна " + Converter.stringConverter(correctMatrix) + ".\n");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Сумма элементов массива равна " + Converter.stringConverter(incorrectSizeMatrix) + ".\n");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Сумма элементов массива равна " + Converter.stringConverter(incorrectDataMatrix) + ".\n");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}