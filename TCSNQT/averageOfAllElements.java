package TCSNQT;

public class averageOfAllElements {
    public static int sumOfElements(int[]arr){
        if(arr.length==0){
            return 0;
        }
        int sum= 0;
        for(int i=0;i<arr.length ;i++){
            sum = sum +arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,5,1};
        System.out.println("The average of all elemnts in the array is "+(double)sumOfElements(arr)/arr.length);
    }
}
