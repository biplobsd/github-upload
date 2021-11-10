/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangman;

import java.util.Random;

/**
 *
 * @author newGen
 */
public class RandomWord {

    private String[] word = {"The", "Word", "For", "Today", "is", "a", "free", "daily", "devotional", "written", "by", "Irish", "Christian", "pastor", "Bob", "Gass", "and", "published", "around", "the", "world", "by", "United", "Christian", "Broadcasters", "Over", "million", "copies", "are", "distributed", "quarterly", "worldwide"};
    private String chosenWord;
    private char[] characters;
    Random random = new Random();

    public RandomWord() {
        chosenWord = word[random.nextInt(word.length)];
        characters = new char[chosenWord.length()];
    }

    public String toString() {
        StringBuilder text = new StringBuilder();

//        characters[1] = 'b';
        for (char pice : characters) {
            text.append(pice == '\u0000' ? "_" : pice).append(' ');
        }

        return text.toString();
    }
    
    public boolean isComplete(){
        
        for(char c: characters){
            if(c=='\u0000'){
                return false;
            }
        }
        return true;
    }
        
    public boolean addGuess(char c) {
        
        for(int x=0;x<characters.length;x++){
            if(chosenWord.charAt(x) == c){
                characters[x] = c;
                return true;
            }
        }
        return false;
    }
}
