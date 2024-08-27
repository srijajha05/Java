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
    public static void main(String[] args) {
        int arr[] = {1,-1,4};
        findEquilibrium(arr);
    }
}