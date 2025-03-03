public class MergeArra {
    //For Merge and Sorting of two arrays
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

     //For Merge of two arrays
    public static int[] mergedArray(int[] arr1, int[] arr2) {
        int[] merged2 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        //first add arr1 element in merged2 
        while (i < arr1.length) {
            merged2[k++] = arr1[i++];
        }

        
        //first add arr2 element in merged2 
        while (j < arr2.length) {
            merged2[k++] = arr2[j++];
        }

        return merged2;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 3, 5, 7 };
        int[] arr2 = { 2, 4, 6, 8 };
        int[] merged = mergeSortedArrays(arr1, arr2);
        int[] merged2 = mergedArray(arr1, arr2);
        System.out.print("Merged array: ");
        for (int num : merged2) {
            System.out.print(num + " ");
        }

        System.out.print("\nMerged Sorted array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}