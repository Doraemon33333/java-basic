package day10;

public class Player {
    String position;
    private String name;
    private double value;


    public Player(String name, String position, double value) {
        this.name = name;
        this.value = value;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getPosition() {
        return position;
    }
}
