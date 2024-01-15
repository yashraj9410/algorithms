import java.util.Scanner;
public class NextGreaterEleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();

        // we have to find the next greater element that can be formed by the digits of n 
        // eg for n = 12 -> out -> 21 
        // eg for 12326 -> 12362
        /*  Aproach ->
         *  int n to string then check for the first dip from reverse 
         *  swap the element at first dip with the next greater elemnt to dip 
         *  sort the elements after the first dip 
         */

        int index1 = -1 , index2 = -1;
        String str = Integer.toString(n);

        // finding the first dip
        for(int i = str.length()-1;i>0;i--){
            if(str.charAt(i)>str.charAt(i-1)){
                index1 = i-1;
                break;
            }
        }
        
        // if no dip then no num is possible to be smaller
        if(index1 == -1){
            System.out.println(-1);
        }
        
        // finding the next grater element to index 1 
        for(int i = index1;i<str.length();i++){
            if(str.charAt(index1)<str.charAt(i)){
                index2 = i;
            }
        }
        
        // swapping the element at index 1 and index 2 
        StringBuilder sb = new StringBuilder(str);
        char temp = sb.charAt(index1);
        sb.setCharAt(index1, sb.charAt(index2));
        sb.setCharAt(index2, temp);

        // Reverse the substring from index1 + 1 to the end of the string
        int start = index1 + 1, end = str.length() - 1;
        while (start < end) {
            temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }

        try {
            // Parse the modified string as an integer
             System.out.println(Integer.parseInt(sb.toString()));
        } catch (NumberFormatException e) {
            // If parsing fails, return -1
            System.out.println(-1);
        }
    }
}
