Homework 1: Sonnet Assignment
1/23/26
Casey Kerrigan

This program entry point will be the Main class.

This program is given a specific sonnet. It writes the sonnet and stops at a random word, writing a series of underscores instead that match the length of the random word.
The program prompts the user for the next word and then indicates whether that guess was correct or incorrect.
The program continues to run until the user gets three words correct or incorrect.

Pseudocode for Sonnet.java:
    initialize variables
    generate constructor
    generate getters
    randomizes an index within the range of the length of the sonnet (in words) using math.random()
    use a for loop to write out the sonnet until you reach the random word
    use another for loop to write underscores, where the total number equals the length of the random word
    check if the user input = the random word, if so update correct variable. If not, update the error variable
    run that program until the game is over (either the correct or error variable is equal to 3)

Tests:
checkGetSonnetIsNotNull() : checks that getSonnet() returns a non-null value
testCheckWordCorrect(): checks if the user input is correct
testCheckWordIncorrect(): checks if the user input is incorrect
testIsGameOverThreeCorrect(): checks that the game is over after three correct guesses
testIsGameOverThreeIncorrect(): checks that the game is over after three incorrect guesses
