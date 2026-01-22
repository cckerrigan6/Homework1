import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String shakespeareSonnet = "Two households, both alike in dignity, In fair Verona, where we lay our scene, From ancient grudge break to new mutiny, Where civil blood makes civil hands unclean. From forth the fatal loins of these two foes A pair of star-cross’d lovers take their life; Whose misadventured piteous overthrows Do with their death bury their parents’ strife. The fearful passage of their death-mark’d love, And the continuance of their parents’ rage, Which, but their children’s end, nought could remove, Is now the two hours’ traffic of our stage; The which if you with patient ears attend, What here shall miss, our toil shall strive to mend.";

        Sonnet sonnet = new Sonnet(shakespeareSonnet);
        Scanner scanner = new Scanner(System.in);

        //get the sonnet, ask for user input, and check input while the game is running
        while(!sonnet.isGameOver()){
            System.out.println(sonnet.getSonnet());

            System.out.println("Next word: ");
            String userNextWord = scanner.next();

            if(sonnet.checkWord(userNextWord)){
                System.out.println("correct");
            } else{
                System.out.println("error");
            }
        }
        System.out.println("Game Over");
        System.out.println("Correct: " + sonnet.getCorrect());
        System.out.println("Incorrect: " + sonnet.getError());
    }
}
