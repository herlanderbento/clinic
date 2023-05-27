public abstract class Health {

  protected String name;
  protected double cost;

  public Health(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }

  public abstract double calculateCost();

  public abstract void diagnostic(double value);

  public String getName() {
    return name;
  }

  public double getCost() {
    return cost;
  }
}
