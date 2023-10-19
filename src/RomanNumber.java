import java.util.HashMap;
import java.util.Scanner;

//B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)
public class RomanNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Roman Number");
        String romanNumber = input.nextLine();
        System.out.println(romanValueInt(romanNumber));


    }


    public static int romanValueInt(String romanNumber){
        HashMap<Character,Integer> romanNumberMap = new HashMap<>();

        romanNumberMap.put('I',1);
        romanNumberMap.put('V',5);
        romanNumberMap.put('X',10);
        romanNumberMap.put('L',50);
        romanNumberMap.put('C',100);
        romanNumberMap.put('D',500);
        romanNumberMap.put('M',1000);


        int res = 0;

        int prevValue = 0;

        for(int i = romanNumber.length() - 1;i >= 0; i--){
            int curValue = romanNumberMap.get(romanNumber.charAt(i));

            if(curValue >= prevValue){
                res+=curValue;
            }else{
                res-=curValue;
            }
            prevValue = curValue;
        }
        return res;
    }
}