public class Converter {
    static int stringConverter(String[][] stringArray)
        throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (4 != stringArray.length) throw new MyArraySizeException();
        for (int i = 0; i < stringArray.length; i++) {
            if (4 !=stringArray[i].length) throw new MyArraySizeException();
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(stringArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
