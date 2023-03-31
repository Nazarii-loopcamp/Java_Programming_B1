package day23_multidimensional_arrays;

import java.util.Arrays;

public class AWS {

    public static void main(String[] args) {

        String server = "Amazon";
        String zones = "us-east1, us-west1, us-north1, us-south1";

        String[] zonesArr = zones.split(", ");
        // System.out.println(Arrays.toString(zonesArr));

        for (int i = 0; i < zonesArr.length; i++) {
//            System.out.println(zonesArr[i]);
            System.out.println(server + " is being deployes to the environment " + zonesArr[i]);
       }
            System.out.println("===========================");
            for (String eachEnv : zonesArr) {
                System.out.println(server + " is being deployed to the environment " + eachEnv);
            }

        }
    }

