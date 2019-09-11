import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        //1. Print a string in reverse.
        String word = "Welcome";
        char[] letters = new char[word.length()];
        for(int i = 0; i < letters.length; i++){
            letters[i] = word.charAt(i);
        }
        for (int i = (letters.length - 1); i >= 0; i--){
            System.out.print(letters[i]);
        }
        System.out.println();

        //2. Find the length of a string without using the library function.
        //Method 1 - pad string so longer than any likely English word
        String word2 = "pumpernickle";
        String paddedWord2 = word2 + "************************************";
        String[] word2array = new String[35];
        int sum = 0;
        for (int i = 0; i < 35; i++){
            word2array[i] = Character.toString(paddedWord2.charAt(i));
            if (!word2array[i].equals("*")){
                 sum ++;
            }
        }
        System.out.println("The length of " + word2 + " is " + sum + ".");
        //Method 2 - use try-catch
        String word3 = "pumpernickle";
        String[] word3array = new String[35];
        int sum2 = 0;
        for (int i = 0; i < 35; i++){
            try{
                word3array[i] = Character.toString(word3.charAt(i));
                sum2 ++;
            }catch(Exception e){

            }
        }
        System.out.println("The length of " + word2 + " is " + sum2 + ".");


        //3.Store 10 input values in an array; remove duplicates and print remaining values.
        //input and store values
        String num;
        String[] numArray = new String[10];
        System.out.println("I will ask you to input 10 numbers.");
        for (int i = 0; i < 10; i++){
            System.out.println("Please enter number #" + (i+1) + ":");
            num = key.next();
            numArray[i] = num;
        }
        //remove duplicates
        for(int i = 0; i < 9; i++){
            for(int j = i + 1; j < 10; j++){
                if(numArray[i].equals(numArray[j])){
                    numArray[j] =  " ";
                }
            }
        }
        //print remaining values
        for (int i = 0; i < 10; i++){
            if(!numArray[i].equals(" ")){
                System.out.println(numArray[i]);
            }
        }
        System.out.println();

        //4. Given 2 arrays, print out all pairs that sum to 13.
        int[] array1 = {1,7,6,5,9};
        int[] array2 = {2,7,6,3,4};
        System.out.println("The following array pairs sum to 13: ");
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++)
            if(array1[i] + array2[j] == 13){
                System.out.println("(" + array1[i] + "," + array2[j] + ")");
            }
        }
        System.out.println();

        //5. Store 10 input values in an array and print the total number of odd and even values.
        int[] values = new int[10];
        int oddSum = 0;
        int evenSum = 0;
        System.out.println("I will ask you for 10 numbers.");
        for(int i = 0; i < 10; i++){
            System.out.println("Please enter number #" + (i+1) + ":");
            int newNum = key.nextInt();
            values[i] = newNum;
            if(values[i]%2 == 0){
                evenSum += 1;
            }else {
                oddSum += 1;
            }
        }
        System.out.println("You entered " + oddSum + " odd numbers.");
        System.out.println("You entered " + evenSum + " even numbers.");

    }
}
