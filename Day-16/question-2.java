public class Ques2 {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 2, 3, 2, 4, 5, 2};

        int maxFrequency = 0;
        int maxElement = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxFrequency) {
                maxFrequency = count;
                maxElement = arr[i];
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("Frequency: " + maxFrequency);
    }
}
