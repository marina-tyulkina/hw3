package homework3;

import java.util.ArrayList;


public class Box <T extends Fruit> {

    private ArrayList<T> fruitsList;
    //public List<T> getList();
    public Box(ArrayList<T> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public Box() {
        this.fruitsList = new ArrayList<T>();
    }


    public ArrayList<T> getFruitsList() {
        return fruitsList;
    }

    public void setFruitsList(ArrayList<T> fruitsList) {
        this.fruitsList = fruitsList;
    }

    public float getWeight() {
        float commonWeight = fruitsList.size() * fruitsList.get(0).getWeight();
        if (commonWeight <= 0) {
            return fruitsList.size();
        } else {
            return fruitsList.size() * fruitsList.get(0).getWeight();
        }
    }
    public boolean compare(Box<?> otherBox) {
        return getWeight() == otherBox.getWeight();
    }

    public void add1(T apple) {
        if (apple != null)
            fruitsList.add(apple);
    }



    public ArrayList<T> getList() {
        return fruitsList;
    }

    public void moveAt(Box<T> boxOrange2)
    {
        boxOrange2.getList().addAll(fruitsList);
        fruitsList.clear();
    }
}