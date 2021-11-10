public class Homework3 {

        public static void main(String[] args) {
            invertArray();
            fillArray();
            changeArray();
            fillDiagonal();
            printArrayInConsole(retLenArr(8,9));
        }

        public static void invertArray() {
            int[] arr = {1, 0, 1, 0, 0, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > 0) {
                    arr[i] = arr[i] - 1;
                } else {
                    arr[i] = arr[i] + 1;
                }
                System.out.println(arr[i]);
            }
        }

        public static void fillArray() {
            int[] arr = new int[101];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
                System.out.println(arr[i]);
            }
        }

        public static void changeArray() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] = arr[i] * 2;
                }
                if (arr[i] > 6) ;
                {
                    arr[i] = arr[i] * 1;
                    System.out.println(arr[i]);
                }
            }
        }

        public static void fillDiagonal() {
            int[][] arr = new int[3][3];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0, x = arr[i].length; j < arr[i].length; j++, x--) {
                    if (i == j || i == x - 1) arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.print("\n");

            }
        }
        public static int[] retLenArr (int len, int initialValue){
            int arr[] = new int[len];
            for (int i = 0; i < arr.length; i++){
                arr[i] = initialValue;
            }
            return arr;
        }
        public static void printArrayInConsole(int[] inputArray) {
            for (int i = 0; i < inputArray.length; i++) {
                System.out.print(inputArray[i] + " ");
            }
            System.out.println();
        }
    }
