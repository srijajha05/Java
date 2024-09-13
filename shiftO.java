public class shiftO {
    public static void shiftTheO(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i]; 
                count++;
            }
        }
       while(count!=arr.length){
        arr[count]=0;
        count++;
       }
    }
    
    public static void main(String[] args) {
        int [] arr = {1,2,0,3,4,5,6,72,81,0,6};
        shiftTheO(arr);
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
}
