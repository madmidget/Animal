/**
 * Created by joacim on 2017-09-30.
 */
public class Dog extends Animal {

    public Dog(String name, int weigth) {
        super(name,weigth);

    }

    @Override
    public String getAnimalType() {
        return "Hunden";
    }

    @Override
    public int getFoodWeight() {
        return getWeigth()/100;
    }

    @Override
    public String getTypeOfFood() {
        return "Hundfoder";
    }
}
