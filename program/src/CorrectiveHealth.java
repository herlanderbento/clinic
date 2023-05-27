public class CorrectiveHealth extends Health {

  private int numberOfConsultations;

  public CorrectiveHealth(String name, double cost, int numberOfConsultations) {
    super(name, cost);
    this.numberOfConsultations = numberOfConsultations;
  }

  @Override
  public double calculateCost() {
    return cost * 0.128;
  }

  @Override
  public void diagnostic(double value) {
    double taxa = value * 0.035;
    System.out.println("Taxa" + taxa);
    double total = taxa + value;
    System.out.println("Valor total" + total);
  }

  public int getNumberOfConsultations() {
    return numberOfConsultations;
  }
}
