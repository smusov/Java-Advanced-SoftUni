package CatLady;

public class Siamese extends Cat {

    public Siamese(String name, double specificCat) {
        super(name, specificCat);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",getClass().getName().substring(getClass().getName().indexOf(".")+1),getName(),getSpecificCat());
    }
}
