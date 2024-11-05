import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("rock","red");
        Cat cat1 = new Cat(23);
        Cat cat12 = new Cat("good","black");

        Cat[] array = new Cat[3];
        array[0] = cat;
        array[1] = cat1;
        array[2] = cat12;

        for (Cat cat2 : array) {
            System.out.println(cat2.name+"\n"+ cat2.color+"\n"+cat2.age);
        }
    }
}