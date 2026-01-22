public class Sonnet {
   //initialize variables
    String sonnet;
    String[] sonnetWords;
    int correct;
    int error;
    int randomWordIndex;
    String randomWord;

    //constructor
    public Sonnet(String sonnet) {
        this.sonnet = sonnet;
        this.sonnetWords = sonnet.split(" ");
        this.correct = 0;
        this.error = 0;
    }

   //getters
    public int getCorrect() {
        return correct;
    }
    public int getError() {
        return error;
    }

    //randomizes an index within the range of the length of the sonnet (in # of words)
    public int randomWordIndex(){
        return (int) (Math.random() * sonnetWords.length);
    }

    //writes the sonnet stopping at a random word and then writes a series of underscores instead
    public String getSonnet(){
        randomWordIndex = randomWordIndex();
        randomWord = sonnetWords[randomWordIndex];
        String randomWordNoPunctuation = randomWord.replaceAll("[^a-zA-Z]", "");
        String partialSonnet = "";
        for(int i = 0; i < (randomWordIndex); i++){
            partialSonnet += sonnetWords[i] + " ";
        }
        for(int i = 0; i < (randomWordNoPunctuation.length()); i++){
            partialSonnet += "_";
        }
        return partialSonnet;
    }

    //check to see if the user input matches the random word, while updating the correct and error variables
    public boolean checkWord(String userNextWord){
        String correctWord = randomWord.replaceAll("[^a-zA-Z]", "");
        if(userNextWord.equals(correctWord)){
            correct += 1;
            return true;
        }else{
            error += 1;
            return false;
        }
    }

    //ends the game when either the correct or error variable is 3
    public boolean isGameOver(){
        return correct == 3 || error == 3;
    }
}
