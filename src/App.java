import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joacim on 2017-09-29.
 */
public class App {

    public static void main(String[] arg){




        List<IAnimal> animals = new ArrayList<IAnimal>();
        animals.add(new Dog("Sixten", 5000));
        animals.add(new Dog("Dogge", 10000));
        animals.add(new Snake("Hypno", 1000));
        animals.add(new Cat("Venus", 5000));

        String s = JOptionPane.showInputDialog("Vilket djur ska få mat?");

        for(IAnimal animal : animals) {
            if (s.equalsIgnoreCase(animal.getName()))
            System.out.println(animal.getAnimalType() + " " + animal.getName() +
                    " ska ha " + animal.getFoodWeight() + " gram " + animal.getTypeOfFood());

        }
    }
}
