/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nursery.rhymes;

/**
 *
 * @author mlarrubia
 */
public class NurseryRhymes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        farm("cow", "moo");
        farm("duck", "quack");
        // TODO: add another animal to the farm here
        monkeys(10);
        monkeys(9);

        hickory_dickory(1);
        hickory_dickory(2);
        hickory_dickory(3);
        
        frogs(3);
        frogs(2);

        // TODO: call your new methods here ( you must write them first! ) 
    }

    public static void farm(String animal, String sound) {
        // TODO: write your code here

        System.out.println("Old MacDonald had a farm\n"
                + "e-i-e-i-o\n"
                + "And on that farm he had a " + animal + "\n"
                + "e-ie-i-o \n"
                + "With a " + sound + " " + sound + " " + "here \n"
                + "And a " + sound + " " + sound + " " + "there \n"
                + "Here a" + " " + sound + " " + "There a" + " " + sound + "\n"
                + "Everywhere a" + " " + sound + " " + sound + "\n"
                + "Old Macdonald had a farm \n" + "e-i-e-i-o"
        );

        System.out.println("--------------------------------------------");
    }

    public static void monkeys(int number) {
        // TODO: write your code here
        System.out.println(number + " " + "little monkeys jumping on the bed \n"
                + "One fell off and bumped his head \n "
                + "Mama called the doctor and the doctor said \n"
                + "No more monkeys jumping on the bed"
        );

        System.out.println("----------------------------------------------");
    }

    public static void hickory_dickory(int time) {
        // TODO: write your code here
        System.out.println("Hickory Dickory dock \n "
                + " The mouse ran up the clock \n "
                + "The clock struck" + " " + time + "\n"
                + "The mouse ran down \n "
                + "Hickory Dickory dock");

        System.out.println("-------------------------------------------------");
    }

    public static void frogs (int num) {
        System.out.println(num + " " + "little speckled frogs \n"
                + "sitting on a speckled log \n"
                + "eating the most delicious bugs \n"
                + "yum , yum \n"
                + "one jumped in the pool \n"
                + "where it is nice and cool \n"
                + "now there are " + --num + 
                " " + "little speckled frogs \n " + 
                "ribbit , ribbit");
    }

}
