public class Main {

  // Crie um programa capaz de calcular os serviços prestador de uma determinada clínica. Na programação orientada objeto que apreendeu umas técnicas que facilitam o processo de desenvolvimento como por exemplo herança, agregação de objetos, polimorfismo . Desenhe a classe Saúde(metodo diagnostico) e as suas derivadas ( saúde  preventiva e corretiva ; ) , e a classe paciente ( objeto que será manipulado )
  //     Saúde preventiva 35%
  //  Saúde corretiva 12,8%
  public static void main(String[] args) {
    System.out.println("Hello world!");
    PreventiveHealth preventiveHealth = new PreventiveHealth(
      "Paludismo",
      4000.0,
      5
    );
    CorrectiveHealth correctiveHealth = new CorrectiveHealth(
      "Tratamento dos olhos",
      4000.0,
      10
    );

    Patient patient1 = new Patient(
      1,
      "Marcos",
      "009290LA045",
      30,
      "Grave",
      preventiveHealth
    );

    Patient patient = new Patient(
      1,
      "Marcos",
      "009290LA045",
      30,
      "Grave",
      correctiveHealth
    );

    System.out.println(patient1);
    System.out.println(patient);
  }
}
