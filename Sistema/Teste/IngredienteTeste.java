package Sistema.Teste;

import Sistema.Controller.IngredienteController;
import Sistema.Model.Ingrediente;

public class IngredienteTeste {
    public static void main(String[] args) {
        IngredienteController ingredienteController = new IngredienteController();

        // Teste de criação de ingrediente
        ingredienteController.criarIngrediente("Queijo");
        ingredienteController.criarIngrediente("Presunto");

        // Teste de leitura de ingrediente
        System.out.println("===== Ler Ingrediente =====");
        Ingrediente ingrediente1 = ingredienteController.lerIngrediente("Queijo");
        Ingrediente ingrediente2 = ingredienteController.lerIngrediente("Presunto");
        exibirIngrediente(ingrediente1);
        exibirIngrediente(ingrediente2);

        // Teste de atualização de ingrediente
        ingredienteController.atualizarIngrediente("Queijo", "Queijo Mussarela");

        // Teste de leitura após atualização
        System.out.println("===== Ler Ingrediente após atualização =====");
        ingrediente1 = ingredienteController.lerIngrediente("Queijo Mussarela");
        exibirIngrediente(ingrediente1);

        // Teste de exclusão de ingrediente
        ingredienteController.deletarIngrediente("Presunto");

        // Teste de leitura após exclusão
        System.out.println("===== Ler Ingrediente após exclusão =====");
        ingrediente2 = ingredienteController.lerIngrediente("Presunto");
        exibirIngrediente(ingrediente2);
    }

    private static void exibirIngrediente(Ingrediente ingrediente) {
        if (ingrediente != null) {
            System.out.println("Nome: " + ingrediente.getNome());
        } else {
            System.out.println("Ingrediente não encontrado.");
        }
        System.out.println();
    }
}
