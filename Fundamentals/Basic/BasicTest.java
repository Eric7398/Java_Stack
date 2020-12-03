public class BasicTest {
    public static void main(String[] args) {
        Basic I = new Basic();
        I.all(255);
        System.out.println("All Numbers");

        Basic II = new Basic();
        II.Odd(255);
        System.out.println("All Odd Numbers");

        Basic III = new Basic();
        III.Sum(255);
        System.out.println("All Sum Numbers");

        Basic IV = new Basic();
        int[] ArrayI = {1,3,5,7,9,13};
        IV.Iterating(ArrayI);
        System.out.println("Iterating an Array");

        Basic V = new Basic();
        int[] ArrayII = {-3, -5, -7};
        V.Max(ArrayII);
        System.out.println("Max Number");

        Basic VI = new Basic();
        int[] ArrayIII = {2, 10, 3};
        VI.Average(ArrayIII);
        System.out.println("Average Number");

        Basic VII = new Basic();
        VII.OddArray(255);
        System.out.println("Array with Odd Number");

        Basic VIII = new Basic();
        int[] ArrayIV = {1, 3, 5, 7};
        int y = 3;
        VIII.GreaterY(ArrayIV, y);
        System.out.println("Greater than Y");

        Basic IX = new Basic();
        int[] ArrayV = {1, 5, 10, -2};
        IX.Square(ArrayV);
        System.out.println("Square of Array");

        Basic X = new Basic();
        int[] ArrayVI = {1, 5, 10, -2};
        X.NegNum(ArrayVI);
        System.out.println("Negative Array Number");

        Basic XI = new Basic();
        int[] ArrayVII = {1, 5, 10, -2};
        XI.MaxMinAverage(ArrayVII);
        System.out.println("Max Min Average");

        Basic XII = new Basic();
        int[] ArrayVIII = {1, 5, 10, 7, -2};
        XII.ShiftValue(ArrayVIII);
        System.out.println("Shift Array Value");
    }
}