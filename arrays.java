import java.util.* ;
public class arrays {
    public static void main(String[] args) {

        //Input an array and search elemets in it

        //input size of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        int arr[] = new int [size];

        //input array elements
        for(int i=0; i<size ; i++){
            System.out.println("Enter the value of "+ i +"th element in the array");
            int val = sc.nextInt();
            arr[i] = val;
        }
        //search for the element
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();

        //output the index of element if array is present
        for(int i =0 ; i<size; i++ ){
            if(arr[i]== x){
                System.out.println("Element found at index " + i);
            }
        }

    }
}
