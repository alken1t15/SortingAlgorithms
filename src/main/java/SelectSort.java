public abstract class SelectSort {
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_id = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_id = j;
                }
            }
            if (i != min_id) {
                int temp = arr[i];
                arr[i] = min;
                arr[min_id] = temp;
            }
        }
    }
}