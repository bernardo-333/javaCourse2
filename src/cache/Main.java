package cache;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Cadastro> Banco = new ArrayList<>();
        List<Cadastro> Cache = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //Inicio
        while (true) {
            System.out.println("\n---Bem vindo ao Banco de Dados---");
            System.out.println();
            System.out.println("1- Cadastrar Usuario");
            System.out.println("2- Acessar Banco de Dados");
            System.out.println("3- Acessar Cache");
            System.out.println("4- Puxar Dados");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n---Cadastrar Usuario---");
                    System.out.println("\nDigite o nome: ");
                    String nome = sc.next();
                    System.out.println("Digite o email: ");
                    String email = sc.next();
                    System.out.println("Digite o idade: ");
                    int idade = sc.nextInt();
                    System.out.println("Digite o cpf: ");
                    String cpf = sc.next();

                    Banco.add(new Cadastro(nome, email, idade, cpf));
                    break;
                case 2:
                    System.out.println("\n---Banco de Dados---");
                    System.out.println();
                    for (Cadastro b : Banco) {
                        System.out.println(b.toString());
                    }
                    break;
                case 3:
                    System.out.println("\n---Cache---");
                    System.out.println();
                    for (Cadastro b : Cache) {
                        System.out.println(b.toString());
                    }
                    break;
                case 4:
                    System.out.println("\n---Puxar Dados---");
                    System.out.println();

                    boolean encontrado = false;
                    while (!encontrado) {
                        System.out.print("Qual voce quer acessar? (acesse pelo nome): ");
                        String nomee = sc.next();

                        for (Cadastro d : Cache) {
                            if (d.getNome().equals(nomee)) {
                                System.out.println("pessoa encontrada no cache " + d.toString());
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            for (Cadastro c : Banco) {
                                if (c.getNome().equals(nomee)) {
                                    System.out.println("pessoa encontrada no Banco de Dados " + c.toString());
                                    if (Cache.size() >= 10) {
                                        Cache.remove(0);
                                        break;
                                    }
                                    Cache.add(c);
                                    encontrado = true;
                                    break;
                                }
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Não encontrado!");
                            encontrado = true;
                            break;
                        }

                    }
            }
        }
    }
}
