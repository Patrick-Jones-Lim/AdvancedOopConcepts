package Insurance;
public abstract class Insurance {
    String type;
    double cost;
    public Insurance(String lh)
    {
        type = lh;
        cost = 0;
    }
    public String getType()
    {
        return type;
    }
    public double getCost()
    {
        return cost;
    }
    public abstract void setCost();
    public abstract void display();
}


