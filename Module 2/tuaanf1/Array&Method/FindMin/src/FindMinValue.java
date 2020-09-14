
public class FindMinValue {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};

        int index = FindMin(arr);
        System.out.println("The smallest element in the array is: " + arr[index] + " at index "+ index);

    }

    public static int FindMin(int [] arr){
        int min = arr[0];
        int index = -1;
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }

        for (int i = 0;i < arr.length; i++ ){
            if (arr[i] == min){
                index = i;
            }
        }
        return index;
    }
}
