public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 3, 2, 9, 676, 876, 34, 12, 68, 43};
        BubbleSort.bubbleSort(arr);
        QuickSort.quickSort(arr, 0, arr.length - 1);
        SelectSort.selectSort(arr);
        for (int b : arr) {
            System.out.print(b + " ");
        }
    }
}