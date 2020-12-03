import java.lang.Math;
public class PythagoreanTheorem {
    public double calculateHypotenuse(int legA, int legB) {
        double hypotenuse = ((legA*legA) + (legB*legB));
            return Math.sqrt(hypotenuse);
        
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
    }
}