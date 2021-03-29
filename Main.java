package homework3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)

    {

            ArrayList<String> objects = new ArrayList<String>();
            objects.add("1");
            objects.add("2");
            objects.add("3");
            objects.add("4");
            objects.add("5");
            objects.add("6");
            objects.add("7");
            objects.add("8");
            objects.add("9");
            objects.add("10");
            objects.add("11");
            objects.add("12");


            ChangeArrays changeArrays = new ChangeArrays(objects);
            changeArrays.changeArrays();

            ////////////////////////////////////////////////////////////////////////////////////

            Apple apple = new Apple();
            Orange orange = new Orange();

            Box<Apple> boxApple = new Box();
            Box<Orange> boxOrange = new Box();
            Box<Orange> boxOrange2 = new Box();
            boxApple.add1(new Apple());
            boxApple.add1(new Apple());
            boxOrange.add1(new Orange());
            boxOrange.add1(new Orange());

            System.out.println("Вес orangeBox и appleBox: " + boxApple.compare(boxOrange));

            //
            boxOrange.moveAt(boxOrange2);
            System.out.println("В новой коробке вес " + boxOrange2.getWeight());

    }

}
