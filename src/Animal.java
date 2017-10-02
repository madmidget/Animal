/**
 * Created by joacim on 2017-09-30.
 */
public abstract class Animal implements IAnimal { // Superklass

    protected String name; // Instansvaribler
    protected int weigth;



    Animal(String name, int weigth) {
        this.name = name; // Det namnet = instansvariabelnamnet
        this.weigth = weigth;
    }

    public String getName() { // Hämta namnetmetod
        return name;
    }

    public int getWeigth() {
        return weigth;
    }

}

