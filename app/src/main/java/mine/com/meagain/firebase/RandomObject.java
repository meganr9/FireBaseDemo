package mine.com.meagain.firebase;

/**
 * Created by macbook on 4/3/17.
 */

public class RandomObject {
    private String name, flavor, color;

    public RandomObject() {
    }

    public RandomObject(String name, String flavor, String color) {
        this.name = name;
        this.flavor = flavor;
        this.color = color;
    }

    @Override
    public String toString() {
        return "RandomObject{" +
                "name='" + name + '\'' +
                ", flavor='" + flavor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
