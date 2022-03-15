package us.dontcareabout.ccddcho.basic.Issue_44;

class Meals {
    private static final int breakfast = 35;
    private static final int lunch = 85;
    private static final int dinner = 90;

    Meals() {
        System.out.println(breakfast + lunch + dinner);
    }

    Meals(String k){

        if(k == "free") {
            System.out.println("Meals are free!");
        }
    }
}