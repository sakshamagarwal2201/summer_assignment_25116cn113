public class Ques3 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        System.out.print("Intersection of Arrays: ");

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            // Check if the element exists in the second array
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            // Avoid printing duplicates
            boolean duplicate = false;
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (found && !duplicate) {
                System.out.print(arr1[i] + " ");
            }
        }
    }
}
