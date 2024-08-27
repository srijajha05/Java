package TCSNQT;

public class findingEquilibriumIndex{
    public static void findEquilibrium(int[] arr){
        for(int i=0;i<arr.length;i++){
            int prefix = 0;
            for(int j=0;j<i;j++){
                prefix+= arr[j];
            }
            int suffix = 0;
            for(int j=i+1;j<arr.length;j++){
                suffix += arr[j];
            }
            if(prefix==suffix){
                System.out.println(i);
            }
        }
    }
    public static void optimalSolution(int [] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
           sum = sum+arr[i];
        }
        int prefix=0;
        int suffix = sum;
        for(int i=0;i<arr.length;i++){
           
            suffix = suffix-arr[i];
            if(prefix == suffix){
                System.out.println(i);
            }
            prefix = prefix+arr[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,-1,4};
        findEquilibrium(arr);
        optimalSolution(arr);
    }
}