public class WordPair {

    public WordPair(String first, String second) {

    }

    public String getFirst() {

    }

    public String getSecond() {

    }
}


public class WordPairList {

    private ArrayList<WordPair> allPairs; 

    public WordPairList(String[] words) {
        
        for(int i=0; i < words.length; i++) {

            for(int j=i+1; j < words.length; j++) {

                // TODO: YOU HAVE TO DO the NEW keyword
                allPairs.add(WordPair(words[i], words[j]))
            }
        }
    }

    public int numMatches() {
        for(int i=0; i < allPairs.size(); i++ ){
            int ctr = 0;
            WordPair element1 = allPairs.get(i);
            
            if(element1.getFirst() == element1.getSecond()) {
                ctr++;
            }
        
        }
        return ctr;
    }
}