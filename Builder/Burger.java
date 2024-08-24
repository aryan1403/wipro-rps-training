package Builder;

public abstract class Burger implements Item {

    @Override
    public abstract float price();

    @Override
    public Packing packing() {
        return new Wrapper();
    }
    
}
