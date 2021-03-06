public class PuzzleJavaTest {
    public static void main(String[] args){


        // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
        System.out.println("PUZZLE 01");
        PuzzleJava I = new PuzzleJava();
        int[] ArrayI = {3,5,1,2,7,9,8,13,25,32};
        I.SumAllNum(ArrayI);


        // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.
        System.out.println("PUZZLE 02");
        PuzzleJava II = new PuzzleJava();
        String[] ArrayII = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        II.ShuffleArray(ArrayII);


        // Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.
        System.out.println("PUZZLE 03");
        PuzzleJava III = new PuzzleJava();  
        String alphabet = "abcdefghijklmnopqrskuvwxyz";
        III.ShuffleAlphabet(alphabet);


        // Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
        System.out.println("PUZZLE 04");
        PuzzleJava IV = new PuzzleJava();
        int min = 55;
        int max = 100;
        IV.RandomNum(min,max);


        // Create a random string that is 5 characters long.
        System.out.println("PUZZLE 05");
        PuzzleJava V = new PuzzleJava();
        V.RandomString(5);


        // Generate an array with 10 random strings that are each 5 characters long
//        System.out.println("PUZZLE 06");
//        PuzzleJava VI = new Puzzlejava();
//        VI.someRandomString(10);
    }

}