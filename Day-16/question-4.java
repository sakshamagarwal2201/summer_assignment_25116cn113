public class Ques4 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 2, 5, 3, 6, 4, 7};

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
