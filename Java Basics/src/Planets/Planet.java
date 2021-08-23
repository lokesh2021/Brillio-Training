package Planets;

enum Planets {
    MON("moon", "white"), TUE("mars", "red"), WED("mercury", "green"), THU("jupiter", "yellow"),
    FRI("venus", "white"),SAT("saturn", "blue/ black"), SUN("sun", "red");

    String name;
    String color;

    Planets(String name, String color) {
        this.name = name;
        this.color = color;
    }


}