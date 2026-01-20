import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int correct = 0;
        int error = 0;

        while((correct < 3) && (error < 3)) {
            String sonnet = "Two households, both alike in dignity, In fair Verona, where we lay our scene, From ancient grudge break to new mutiny, Where civil blood makes civil hands unclean. From forth the fatal loins of these two foes A pair of star-cross’d lovers take their life; Whose misadventured piteous overthrows Do with their death bury their parents’ strife. The fearful passage of their death-mark’d love, And the continuance of their parents’ rage, Which, but their children’s end, nought could remove, Is now the two hours’ traffic of our stage; The which if you with patient ears attend, What here shall miss, our toil shall strive to mend.";
            String[] sonnetWords = sonnet.split(" ");
            int randomWordIndex = (int) (Math.random() * sonnetWords.length);
            String randomWord = sonnetWords[randomWordIndex];
            String randomWordNoPunctuation = randomWord.replaceAll("[^a-zA-Z]", "");
            for(int i = 0; i < (randomWordIndex); i++){
                System.out.print(sonnetWords[i] + " ");
            }
            for(int i = 0; i < (randomWordNoPunctuation.length()); i++){
                System.out.print("_");
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("Next word: ");
            String userNextWord = scanner.next();

            if(userNextWord.equals(randomWord)){
                System.out.println("correct");
                correct += 1;
            } else{
                System.out.println("error");
                error += 1;
            }
        }
        if(correct == 3) {
            System.out.println("Game over you got 3 correct and " + error + " incorrect");
        }
        if(error == 3){
            System.out.println("Game over you got 3 incorrect and " + correct + " correct");
        }
    }
}
