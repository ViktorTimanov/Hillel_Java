public class ArrayLib {

    public static int[] deleteTheElementFromArrayByIndex (int [] array, int index){
        int[] result = new int[array.length - 1];
        for (int i = 0; i < index; i++){
            result[i] = array[i];
        }
        for (int i = index; i < result.length; i++){
            result[i] = array[i + 1];
        }
        return result;
    }

    public static int[] addElementToArrayByIndex (int[] array, int element, int index){
        int[] result = new int[array.length + 1];
        for (int i = 0; i < index; i++){
            result[i] = array[i];
        }
        result[index] = element;

        for(int i = index + 1; i < result.length; i++){
            result[i] = array[i - 1];
        }
        return result;
    }

    public static int[] addElementToEndOfArray (int[] array, int element){
        int[] result = new int[array.length + 1];
        for (int i = 0; i < result.length - 1; i++){
            result[i] = array[i];
        }
        result[result.length - 1] = element;
        return result;
    }

    public static int[] addElementToBeginningOfArray (int[] array, int element){
        int[] result = new int[array.length + 1];
        result[0] = element;
        for (int i = 1; i < result.length; i++){
            result[i] = array[i - 1];
        }
        return result;
    }

    public static void printArray (int[] array){
        for (int element: array){
            System.out.print(element + " ");
        }
    }
}
