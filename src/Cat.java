/**
 * Created by joacim on 2017-09-30.
 */
public class Cat extends Animal {

    public Cat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String getAnimalType() {
        return "Katten";
    }

    @Override
    public int getFoodWeight() {
        return getWeigth()/150;
    }

    @Override
    public String getTypeOfFood() {
        return "kattfoder";
    }
}
