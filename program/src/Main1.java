// // Classe Saude (superclasse)
// abstract class Saude {

//   protected String nome;
//   protected double custo;

//   public Saude(String nome, double custo) {
//     this.nome = nome;
//     this.custo = custo;
//   }

//   public abstract double calcularCusto();
//   public abstract void fazerConsulta()

//   public String getNome() {
//     return nome;
//   }

//   public double getCusto() {
//     return custo;
//   }
// }

// class SaudePreventiva extends Saude {

//   private int numeroExames;

//   public SaudePreventiva(String nome, double custo, int numeroExames) {
//     super(nome, custo);
//     this.numeroExames = numeroExames;
//   }

//   @Override
//   public double fazerConsulta() {
//     System.out.println("Realizando diagnóstico de saúde preventiva: " + nome);
//         System.out.println("Número de exames: " + númeroExames);
//         System.out.println("Custo do serviço: " + calcularCusto());
//   }

//   @Override
//   public double calcularCusto() {
//     return custo * 0.35;
//   }

//   public int getNumeroExames() {
//     return numeroExames;
//   }
// }

// class SaudeCorretiva extends Saude {

//   private int numeroConsultas;

//   public SaudeCorretiva(String nome, double custo, int numeroConsultas) {
//     super(nome, custo);
//     this.numeroConsultas = numeroConsultas;
//   }

//   @Override
//   public double calcularCusto() {
//     return custo * 0.128;
//   }

//   public int getNumeroConsultas() {
//     return numeroConsultas;
//   }
// }

// class Paciente {

//   private int id;
//   private String nome;
//   private String bi;
//   private int idade;
//   private String estado;
//   private Saude servico;

//   public Paciente(
//     int id,
//     String nome,
//     String bi,
//     int idade,
//     String estado,
//     Saude servico
//   ) {
//     this.id = id;
//     this.nome = nome;
//     this.bi = bi;
//     this.idade = idade;
//     this.estado = estado;
//     this.servico = servico;
//   }

//   public double calcularCustoServico() {
//     return servico.calcularCusto();
//   }

//   public int getId() {
//     return id;
//   }

//   public void setId(int id) {
//     this.id = id;
//   }

//   public String getNome() {
//     return nome;
//   }

//   public void setNome(String nome) {
//     this.nome = nome;
//   }

//   public String getBi() {
//     return bi;
//   }

//   public void setBi(String bi) {
//     this.bi = bi;
//   }

//   public int getIdade() {
//     return idade;
//   }

//   public void setIdade(int idade) {
//     this.idade = idade;
//   }

//   public String getEstado() {
//     return estado;
//   }

//   public void setEstado(String estado) {
//     this.estado = estado;
//   }

//   public String toString() {
//     return (
//       "Paciente [id=" +
//       id +
//       ", nome=" +
//       nome +
//       ", bi=" +
//       bi +
//       ", idade=" +
//       idade +
//       ", estado=" +
//       estado +
//       ", servico=" +
//       servico.getNome() +
//       ", custo=" +
//       calcularCustoServico() +
//       "]"
//     );
//   }
// }

// public class Main {

//   public static void main(String[] args) {
//     SaudePreventiva sp = new SaudePreventiva("Check-up Anual", 200.0, 5);
//     SaudeCorretiva sc = new SaudeCorretiva("Tratamento Dentário", 500.0, 10);

//     Paciente paciente1 = new Paciente(
//       1,
//       "João",
//       "123456789",
//       30,
//       "São Paulo",
//       sp
//     );
//     Paciente paciente2 = new Paciente(
//       2,
//       "Maria",
//       "987654321",
//       40,
//       "Rio de Janeiro",
//       sc
//     );

//     System.out.println(paciente1);
//     System.out.println(paciente2);
//   }
// }
