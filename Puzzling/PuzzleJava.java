import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{
    
    public static ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=0; i< 10 ;i++){
        Random randMachine = new Random();
        int num =randMachine.nextInt(20);
        myArray.add(num);
        }
        return myArray;

    }

    public static char getRandomLetter(){
       Random randMachine = new Random();
       int randnum=randMachine.nextInt(25)+97;
        char c = (char)randnum;

    return c;
    }

    public static String generatePassword(){
        String password="";
        for(int i=0; i<8 ;i++){
            char randc=getRandomLetter();
            password+=randc;
        }
        return password;

    }

    public static ArrayList<Character> getNewPasswordSet(int num){
        ArrayList<Character> myArray = new ArrayList<Character>();
         for(int i=0; i<num ;i++){
            char randc=getRandomLetter();
            myArray.add(randc);
        }
        return myArray;

    }
}