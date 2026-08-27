package exercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TesteFuncionarios {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // 1. Instanciando o Funcionario
        Funcionario f1 = new Funcionario(
                "Ana Costa", "F001",
                2500.00,
                LocalDate.parse("01/03/2020", dtf)
        );

        // 2. Instanciando o FuncionarioCLT
        FuncionarioCLT f2 = new FuncionarioCLT(
                "Bruno Reis", "C001",
                3000.00,
                LocalDate.parse("10/06/2021", dtf),
                220.00, // VT
                400.00  // VA
        );

        // 3. Instanciando o Gerente
        Gerente f3 = new Gerente(
                "Carla Mendes", "G001",
                8000.00,
                LocalDate.parse("15/01/2018", dtf),
                300.00, // VT
                500.00, // VA
                12,     // Equipe
                20      // 20% de bônus
        );

        // 4. Instanciando o Estagiario
        Estagiario f4 = new Estagiario(
                "Diego Alves", "E001",
                0.0,    // Salário base
                LocalDate.parse("05/08/2024", dtf),
                1500.00,// Bolsa auxílio
                20      // Carga horária semanal
        );
        
        // 5. Instanciando o Gerente
        Gerente f5 = new Diretor(
                "Fernanda Gabriele", "D001",
                8000.00,
                LocalDate.parse("15/01/2008", dtf),
                500.00, // VT
                800.00, // VA
                22,     // Equipe
                25,     // 20% de bônus
                10000   // O lucro
        );

   
        
        System.out.println("=== RELATÓRIO DE FUNCIONÁRIOS ===");
        System.out.println(f1 + "\n");
        System.out.println(f2 + "\n");
        System.out.println(f3 + "\n");
        System.out.println(f4 + "\n");
        System.out.println(f5 + "\n");
    }
}
