import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
public class PuzzleJava {
    public static void SumAllNum(int[] arr){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > 10){
                myArray.add(arr[i]);
            }
        }
        System.out.println(myArray);
    }

    public static void ShuffleArray(String[] names){
        ArrayList<String> myArray = new ArrayList<String>();
        List<String> list = Arrays.asList(names);
        Collections.shuffle(list);
        list.toArray(names);
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length; i++){
            if(names[i].length() > 5){
                myArray.add(names[i]);
            }
        }
        System.out.println(myArray);
    }

    public static void ShuffleAlphabet(String letters){
        ArrayList<Character> alpha = new ArrayList<Character>();
        for (int i = 0; i < letters.length(); i++) {
            alpha.add(letters.charAt(i));
        }
        Collections.shuffle(alpha);
        System.out.println(alpha);
        System.out.println("Final Letter: " + alpha.get(alpha.size() - 1));
        if(alpha.get(0) == 'a' || alpha.get(0) == 'e' || alpha.get(0) == 'i' || alpha.get(0) == 'o' || alpha.get(0) == 'u'){
            System.out.println("Starting with a vowel");
        }
    }

    public static void RandomNum(int min, int max){
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++){
            int rand = random.nextInt(max - min) + min;
            numbers.add(rand);
        }
        System.out.println(numbers);
        for (int nums: numbers){
        } 
        System.out.println("Sorted:");
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println("Min: " + numbers.get(0) + "  Max: " + numbers.get(numbers.size()-1));
    }

    public static void RandomString(int num){
        String strings = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String output = "";
        Random rand = new Random();
        for ( int i = 0; i < num; i++){
            int chara = rand.nextInt(25);
            output += strings.charAt(chara);
        }
        System.out.println(output);
    }
//    public static void someRandomString(int num){
//        String[] output = new String[num];
//        for (int i = 0; i < output.length; i++){
//            output[i] = RandomString(5);
//        }
//        System.out.println(output);
//    }
}
