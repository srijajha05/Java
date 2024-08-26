package TCSNQT;

public class productOfSubArray {
    public static void findMaxProductBruteForce(int [] arr){
        int result = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int product = 1;
                for(int k=i;k<j;k++){
                    product =product * arr[k];
                    
                    result = Math.max(result, product);
                }
            }
        }
       System.out.println("The maximum product possible is : "+result);

    }
    public static void findMaxProductBruteForceOptimized(int [] arr){
        if(arr.length==1){
            System.out.println(arr[0]);
        }
        int result = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int product = 1;
            for(int j=i;j<arr.length;j++){
                product =product*arr[j];
                
                result = Math.max(product, result);
            }
            //result= Math.max(result, product);
        }
        System.out.println("The maximum product possible is : "+result);
    }
    public static void findMaxIntrutiveOptimizedApproach(int[] arr){
        int prefix =1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            
            if(prefix==0){
                prefix=1;//restart new subarray
            }
            if(suffix==0){
                suffix =1;//restart new subarray
            }
            prefix =prefix* arr[i];
            suffix = suffix * arr[arr.length-1-i];
            ans = Math.max(ans, Math.max(prefix,suffix));
            
        }
        System.out.println("The maximum product possible is : "+ans);
    }
    public static void findMaxProduct(int[] arr){
        int result = arr[0];
        int product1 = arr[0];
        int product2 = arr[0];
        for(int i=1;i<arr.length;i++){
            product1 = Math.max(arr[i],Math.max(arr[i]*product1, arr[i]*product2));
            product2 = Math.min(arr[i], Math.min(arr[i]*product1, arr[i]*product2));
            
            result = Math.max(result, product1);

        }
        System.out.println("The maximum product possible is : "+result);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,-4,5};
        findMaxProductBruteForce(arr);
        findMaxProductBruteForceOptimized(arr);
        findMaxIntrutiveOptimizedApproach(arr);
        findMaxProduct(arr);
    }
}