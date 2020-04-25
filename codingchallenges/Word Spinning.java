import java.util.ArrayList;
public class SpinWords {

    public String rev(String word) {

        int len = word.length();
        len = len -1;
        
        String rev = "";
        for(int i= len; i >= 0; i--) {
          rev = rev + word.charAt(i); 
        }
        return rev;
    
  } 


  public String spinWords(String sentence) {

        ArrayList<String> words = new ArrayList<String>();

        int len = sentence.length();
        String tempString = ""; 
        for(int i=0; i< len; i++) {
            if(sentence.charAt(i) == ' ') {
                words.add(tempString);
                tempString = "";
            }
            else {
                tempString = tempString + sentence.charAt(i);
            }
        }
        words.add(tempString);
        String returnString = "";
        boolean catcher = false;
        for(String word: words) {
            if(catcher == true) {
                returnString = returnString + " ";
            }
            if(word.length() >= 5) {
                String rev = rev(word);
                returnString = returnString + rev;
            }
            else {
                returnString = returnString + word;
            }
            catcher = true;
        }

        return returnString;


    
  }
}


