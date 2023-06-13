package Sistema.Teste;

import java.util.Scanner;

import Sistema.Controller.LoginController;

public class PizzaCMD {
    public static void main(String[] args) {
        String nome = "";
        String senha = "";
        Scanner scanner = new Scanner(System.in);
        LoginController loginController = new LoginController();

        while (loginController.login == 0) {
            System.out.println("Bem vindo!");
            System.out.println("Login: ");
            nome = scanner.nextLine();
            System.out.println("Senha: ");
            senha = scanner.nextLine();
            loginController.login = loginController.validaLogin(nome, senha);
        }
          while (loginController.login > 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar pedido");
            System.out.println("2. Mudar status de pedido");
            System.out.println("3. Editar usuário");
            System.out.println("4. Alterar pedido");
            System.out.println("5. Deletar pedido");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Adicionar pedido");
                    break;
                case 2:
                    System.out.println("Mudar status de pedido");
                    break;
                case 3:
                    System.out.println("Editar usuario");
                    break;
                case 4:
                    System.out.println("Alterar pedido");
                    break;
                case 5:
                   System.out.println(" Deletar pedido");
                    break;
                case 0:
                    System.out.println("Sair");
                    loginController.login = 0; 
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        scanner.close();
         }
    }
}
