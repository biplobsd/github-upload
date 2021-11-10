/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman;

import java.util.Scanner;

/**
 *
 * @author newGen
 */
public class Hangman {

    private boolean running = true;
    private RandomWord word = new RandomWord();
    private Scanner sc = new Scanner(System.in);
    private int limit = 3;
    private char lastInput;

    public void run() {
        do {
            displayWord();
            getUserInput();
            checkUserInput();
        } while (running);
    }

    public void displayWord() {
        System.out.println(word);
    }

    private void getUserInput() {
        System.out.print("Enter a guess character: ");
        lastInput = sc.nextLine().charAt(0);
       

    }

    public void checkUserInput() {
        
        if (!word.addGuess(lastInput)) {
            limit--;
        }
        
        if (limit == 0) {
            running = false;
            System.out.println("You lost!");
        } else {
            if (word.isComplete()) {
                System.out.println("You did it!");
            } else {
                System.out.println("You have remining try: " + limit);
            }
        }

    }

    public void close() {
        sc.close();
    }

}
