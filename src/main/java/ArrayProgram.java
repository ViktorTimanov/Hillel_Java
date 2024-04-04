public class ArrayProgram {

    public static void main(String[] args) {
        int[] array = {1, 5, 6, 7, 9, 14, 21};
        int element = 100;
        int index = 3;
        ArrayLib.printArray(ArrayLib.addElementToBeginningOfArray(array, element));
        System.out.println();
        ArrayLib.printArray(ArrayLib.addElementToEndOfArray(array, element));
        System.out.println();
        ArrayLib.printArray(ArrayLib.addElementToArrayByIndex(array, element, index));
        System.out.println();
        ArrayLib.printArray(ArrayLib.deleteTheElementFromArrayByIndex(array, index));
    }
}
