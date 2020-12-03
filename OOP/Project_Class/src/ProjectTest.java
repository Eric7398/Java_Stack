public class ProjectTest {
    public static void main(String[] args) {
        Project I = new Project();
        System.out.println(I.elevatorPitch());
        
        Project II = new Project("Recipe Finder");
        System.out.println(II.elevatorPitch());
        
        Project III = new Project("Recipe Finder", "A creative innovation in our day and age.");
        System.out.println(III.elevatorPitch());
        
        Project IV = new Project("Recipe Finder", "A creative innovation in our day and age.", 1000.99);
        System.out.println(IV.elevatorPitch());
    }
}