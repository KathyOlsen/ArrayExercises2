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
                    numArray[j] = null;
                }
            }
        }
        //print remaining values
        //FIX - IT'S THROWING A NULL POINTER EXCEPTION ERROR
        for (int i = 0; i < 10; i++){
            try{
                System.out.println(numArray[i]);
            }catch(Exception e){

            }
        }
        System.out.println();
    }
}
