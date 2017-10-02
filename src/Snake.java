/**
 * Created by joacim on 2017-10-01.
 */
public class Snake extends Animal{

    public Snake(String name, int weight) {
        super (name, weight);

    }

    @Override
    public String getAnimalType() {
        return "Ormen";
    }

    @Override
    public int getFoodWeight() {
        return 20;
    }

    @Override
    public String getTypeOfFood() {
        return "Ormpellets";
    }
}
