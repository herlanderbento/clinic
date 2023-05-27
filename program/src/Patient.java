public class Patient {

  private int id;
  private String name;
  private String bi;
  private int age;
  private String state;
  private Health service;

  public Patient(
    int id,
    String name,
    String bi,
    int age,
    String state,
    Health service
  ) {
    this.id = id;
    this.name = name;
    this.bi = bi;
    this.age = age;
    this.state = state;
    this.service = service;
  }

  public double calculateServiceCost() {
    return service.calculateCost();
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBi() {
    return bi;
  }

  public void setBi(String bi) {
    this.bi = bi;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String toString() {
    return (
      "Patient [id=" +
      id +
      ", nome=" +
      name +
      ", bi=" +
      bi +
      ", idade=" +
      age +
      ", estado=" +
      state +
      ", servicos=" +
      service.getName() +
      ", custo=" +
      calculateServiceCost() +
      "]"
    );
  }
}
