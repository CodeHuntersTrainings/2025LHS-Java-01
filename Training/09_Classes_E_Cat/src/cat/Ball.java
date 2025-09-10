package cat;

public class Ball {
    private String color = "green";

    public void bite() {
        color = "red";
    }

    public String getColor() {
        return color;
    }
}
