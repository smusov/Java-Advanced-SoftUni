package CatLady;

public abstract class Cat {
    private String name;
    private double specificCat;

    public Cat(String name, double specificCat) {
        this.name = name;
        this.specificCat = specificCat;
    }

    public String getName() {
        return name;
    }

    public double getSpecificCat() {
        return specificCat;
    }
}
