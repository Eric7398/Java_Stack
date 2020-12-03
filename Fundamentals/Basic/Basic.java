import java.util.ArrayList;
public class Basic {
    public void all(int number) {
        for (int i = 0; i <= number; i++){
            System.out.println(i);
        }
    }
    public void Odd(int number) {
        for (int i = 1; i <= number; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public void Sum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum += i;
            System.out.println("New Number: "+ i + "  Sum: " + sum);
        }
    }
    public void Iterating(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public void Max(int[] arr) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        String test = String.format("%.0f", max);
        System.out.println(test);
    }
    public void Average(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
    }
    public void OddArray(int num) {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i <= num; i++) {
            if(i % 2 != 0) {
                myArray.add(i);
            }
        }
        System.out.println(myArray);
    }
    public void GreaterY(int[] arr, int y){
        int counter = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > y){
                counter ++;
            }
        }
        System.out.println(counter);
    }
    public void Square(int[] arr){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            myArray.add(arr[i] *= arr[i]);
        }
        System.out.println(myArray);
    }
    public void NegNum(int[] arr){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                myArray.add(arr[i] = 0);
            } else {
                myArray.add(arr[i]);
            }
        }
        System.out.println(myArray);
    }
    public void MaxMinAverage(int[] arr){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        String newmax = String.format("%.0f", max);
        String newmin = String.format("%.0f", min);
        System.out.println("Max: " + newmax + "  Min: " + newmin + "  Average: " + sum/arr.length);
    }
    public void ShiftValue(int[] arr){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 0; i < arr.length - 1; i++){
            myArray.add(arr[i] = arr[i + 1]);
        }
        myArray.add(arr[arr.length - 1] = 0);
        System.out.println(myArray);
    }
}
