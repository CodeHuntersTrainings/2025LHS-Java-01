package alien;

public class Alien {
    private String type;

    //public Alien() {
    //    this.type = "Z";
    //}

    //super()
    public Alien(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void speak() {
        //System.out.println("I am an alien of type: " + type);
        System.out.printf("I am an alien of type [ %s ] \n", type);
    }
}
