package gr.teohaik.solids;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Solid s1 = new Cone(150, 2, 4);
        Solid s2 = new Cone(24, 0.5, 0.9);
        Solid s3 = new Cylinder(50, 1, 3.45);
        Solid s4 = new Cylinder(41, 0.998, 1.258);


        Collection<Solid> solids = new ArrayList<>();
        solids.add(s1);
        solids.add(s2);
        solids.add(s3);
        solids.add(s4);

        for(Solid s : solids){
            System.out.println(s);
            double v = s.calculateArea();
            System.out.println("Area = "+v);
        }

        for(Paintable p : solids){
            p.paint(150,210,36);
        }

    }
}
