import java.util.* ;
public class strings{
    public static void main(String[] args) {

/*
        //String array input and size calculation

        System.out.println("Enter your string size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String name[] = new String [size];

        int totalLength = 0;


        for(int i =0; i<size; i++){
            System.out.println("Enter your string " + i );
            name[i] = sc.next();
            totalLength += name[i].length();
        }
        System.out.println("The length of the array is : " + totalLength);
*/
/*
        //replacing a character in a string taken as input

        System.out.println("Enter your String:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "" ;
        for(int i =0; i<input.length();i++ ){
            if(input.charAt(i) == 'e'){
                result += 'i' ;

            }
            else{
                result += input.charAt(i);
            }
            
        }
        
        System.out.println(result);
*/
/*
        //generating username from given email

        System.out.println("Enter your email:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String username = "";

        for(int i=0 ; i < input.length() ; i++ ){
            if(input.charAt(i)== '@'){
                break;
            }
            else{
                username += input.charAt(i);
            }
        }

        System.out.println("Your username is : " + username);
*/

    }

}
