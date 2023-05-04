package day37_a_abstraction.exercise;

public class Running extends  Exercise{

    public Running(String name) {
        super(name);
    }
    public void performExercise() {
        System.out.println("Running for fun");
    }

    public int getCaloriesBurned (int minutes) {
        return minutes * 5;
    }

    //    @Override
//    public void test(){
//        System.out.println("opt2");
//    }

}
