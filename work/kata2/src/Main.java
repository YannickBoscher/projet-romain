import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Double Result;
        String operation ="/";
        double numberOne = 5;
        double numberTwo = 0;
        switch (operation) {
            case "+":
                Result = numberOne + numberTwo;
                break;
            case "-":
                Result = numberOne - numberTwo;
                break;
            case "*":
                Result = numberOne * numberTwo;
                break;
            case "/":
                if (numberTwo ==0){
                    Result = null;
                }
                else {
                    Result = numberOne / numberTwo;
                }
                break;
            default:
                Result = null;
        }
        System.out.println(Result);







        //String[] words = new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"};
        //String testWord= "java";
        String[] words = new String[]{"zqdrhpviqslik","karpscdigdvucfr"};
        String testWord= "rkacypviuburk";
        int difference;
        int retenu =-1;
        String wordRetenu="";

      for (int i = 0; i< words.length; i++){

          difference = compareWord(words[i], testWord);

        if (retenu < 0){
            retenu = difference;
            wordRetenu = words[i];
        }
        else {
            if (retenu > difference){
                retenu = difference;
                wordRetenu = words[i];
            }
        }
    }
        System.out.println("mot retenu" + wordRetenu);
}

public static int  compareWord (String word, String testWord){

        List<Character> charWord = new ArrayList<>();
        for (int j=0;j< word.length();j++){
        charWord.add(word.charAt(j));
        }
        List<Character> charWord2 = new ArrayList<>();
            for (int j=0;j< testWord.length();j++){
            charWord2.add(testWord.charAt(j));
        }
        int difference = 0;
        char testChar;
        if (word.length() >= testWord.length()){
             Iterator it2=charWord2.iterator();
             while (it2.hasNext()){
                 testChar = (char) it2.next();
                 Iterator it=charWord.iterator();
                 Boolean trouve=false;
                 while (it.hasNext()){
                     if(it.next().equals(testChar)){
                         trouve=true;
                         it.remove();
                         break;
                     }
                 }
                 if(trouve==false){
                      difference++;
                 }
             }
            difference +=charWord.size();
        }
        if (testWord.length() > word.length()){
             Iterator it=charWord.iterator();
             while (it.hasNext()){
                Iterator it2=charWord2.iterator();
                Boolean trouve=false;
                testChar= (char) it.next();
                while (it2.hasNext()){
                    if(it2.next().equals(testChar)){
                        trouve=true;
                        it2.remove();
                        break;
                    }
                }
                if(trouve==false){
                    difference++;
                }
            }
            difference +=charWord2.size();
        }

        return difference;
}
}
