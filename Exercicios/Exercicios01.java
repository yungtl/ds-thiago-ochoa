import java.util.Scanner;

public class Exercicios01 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();
        
        System.out.print("Digite o valor que recebe por hora: ");
        double valorPorHora = scanner.nextDouble();
        
        System.out.print("Digite o número de filhos com idade inferior a 14 anos: ");
        int numeroDeFilhos = scanner.nextInt();
        
        System.out.print("Digite a idade do funcionário: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite o tempo de serviço do funcionário (em anos): ");
        int tempoDeServico = scanner.nextInt();
        
        System.out.print("Digite o valor do salário família por filho: ");
        double salarioFamiliaPorFilho = scanner.nextDouble();
        
    
        double salarioBruto = horasTrabalhadas * valorPorHora;
        double descontoINPS = salarioBruto * 0.085;
        double salarioFamilia = numeroDeFilhos * salarioFamiliaPorFilho;
        

        double ir = 0;
        if (salarioBruto > 1500) {
            ir = salarioBruto * 0.15;
        } else if (salarioBruto >= 500) {
            ir = salarioBruto * 0.08;
        }
        
    
        double adic = 0;
        if (idade > 40) {
            adic += salarioBruto * 0.02;
        }
        if (tempoDeServico > 15) {
            adic += salarioBruto * 0.035;
        } else if (tempoDeServico > 5 && idade > 30) {
            adic += salarioBruto * 0.015;
        }
    
    
        double totalDescontos = descontoINPS + ir;
        double salarioLiquido = salarioBruto - totalDescontos + salarioFamilia + adic;
        
        
        System.out.println("\nResumo do Funcionário: " + nome);
        System.out.println("Número do Funcionário: 001"); 
        System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Total de Descontos (INPS + IR): R$ %.2f%n", totalDescontos);
        System.out.printf("Adicional: R$ %.2f%n", adic);
        System.out.printf("Salário Família: R$ %.2f%n", salarioFamilia);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
        
        
        scanner.close();
    }
}
