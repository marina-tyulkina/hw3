package homework3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChangeArrays <T>
{
    ArrayList<String> objects;


    public ChangeArrays(ArrayList<String> objects)
    {
        this.objects = objects;
    }

        public <T> void changeArrays()
        {
            System.out.println("volume object" +this.objects.size());
             int n =this.objects.size();
            for (int i = 0; i < n/2; i++)
            {
                String temp  = (String)this.objects.get(n-i-1);

                this.objects.set(n-i-1, this.objects.get(i));
                this.objects.set(i, (String)temp);
            }
            for(String obj : this.objects){

                System.out.println(obj);
            }
            System.out.println("job ok" +this.objects.size());

//            String temp  = (String)this.objects.get(0);
//            this.objects.set(0, this.objects.get(1));
//            this.objects.set(1, (String)temp);


//            for (int i = 0; i < this.objects.size(); i++) {
//                System.out.println(this.objects.get(i));
//
//            }


        }

//         public static void main(String[] args)
//         {
//             ArrayList <String> objects = new ArrayList<String>();
//             objects.add("1");
//             objects.add("2");
//             objects.add("3");
//             objects.add("4");
//             objects.add("5");
//             objects.add("6");
//             objects.add("7");
//             objects.add("8");
//             objects.add("9");
//             objects.add("10");
//             objects.add("11");
//             objects.add("12");
//
//
//             ChangeArrays changeArrays = new ChangeArrays(objects);
//             changeArrays.changeArrays();
//
//         }

}


