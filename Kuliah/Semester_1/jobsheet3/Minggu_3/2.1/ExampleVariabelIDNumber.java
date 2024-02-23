
public class ExampleVariabelIDNumber {

    public static void main(String[] args) {
        String myHobby = "Playing futsal";
        boolean isIntelligent = true;
        char myGender = 'M';
        byte myAge = 20;
        double myGPA = 3.38, myHeight = 1.68;
        System.out.println(myHobby);
        System.out.println("Am I intelligent? " + isIntelligent);
        System.out.println("Gender: " + myGender);
        System.out.println("My current age is " + myAge);
        /** %s serves as a placeholder that allows you to insert values into a string with specific formatting. 
        In this case, it's used to create a human-readable sentence that includes the GPA and height values.**/
        System.out.println(String.format("My GPA is %s and my height is %s meters", myGPA, myHeight));
    }
}
