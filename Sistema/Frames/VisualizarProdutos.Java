/*
import Sistema.Model.Produto;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Sistema.Controller.*;

import javax.swing.text.html.ListView;

public class VisualizarProdutos extends Application {

    private ProdutoController produtoController;
    private ObservableList<Produto> produtosObservableList;
    private ListView<Produto> produtosListView;

    @Override
    public void start(Stage primaryStage) {
        produtoController = new ProdutoController();

        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(10);

        produtosObservableList = FXCollections.observableArrayList(produtoController.getProdutos());

        produtosListView = new ListView<>(produtosObservableList);
        root.getChildren().add(produtosListView);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Produtos Registrados");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
 */