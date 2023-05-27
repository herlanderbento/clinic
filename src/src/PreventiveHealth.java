public class PreventiveHealth extends Health {

  private int numberOfExaminations;

  public PreventiveHealth(String name, double cost, int numberOfExaminations) {
    super(name, cost);
    this.numberOfExaminations = numberOfExaminations;
  }

  @Override
  public double calculateCost() {
    return cost * 0.035;
  }

  @Override
  public void diagnostic(double value) {
    double taxa = value * 0.035;
    System.out.println("Taxa" + taxa);
    double total = taxa + value;
    System.out.println("Valor total" + total);
  }

  public int getNumberOfExaminations() {
    return numberOfExaminations;
  }
}
