package calculadoraSimplesExecutavel;

import miniprojetosjava.minicalculadorasimples.CalculadoraSimples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculadoraFX extends Application {

    private TextField visor;
    private double primeiroNumero = 0;
    private String operador = "";
    private boolean inicioNovoNumero = true;

    @Override
    public void start(Stage primaryStage) {
        visor = new TextField();
        visor.setEditable(false);
        visor.setAlignment(Pos.CENTER_RIGHT);
        visor.setStyle("-fx-font-size: 18px;");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        String[][] botoes = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"C", "0", "=", "+"}
        };

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                String texto = botoes[linha][coluna];
                Button btn = new Button(texto);
                btn.setPrefSize(50, 50);
                btn.setStyle("-fx-font-size: 14px;");

                btn.setOnAction(e -> processarClique(texto));

                grid.add(btn, coluna, linha);
            }
        }

        VBox layoutPrincipal = new VBox(15);
        layoutPrincipal.setPadding(new Insets(15));
        layoutPrincipal.getChildren().addAll(visor, grid);

        Scene cena = new Scene(layoutPrincipal, 260, 320);

        primaryStage.setTitle("Calculadora");
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    private void processarClique(String valor) {
        if ("0123456789".contains(valor)) {
            if (inicioNovoNumero) {
                visor.setText(valor);
                inicioNovoNumero = false;
            } else {
                visor.appendText(valor);
            }
        } else if ("+-*/".contains(valor)) {
            if (!visor.getText().isEmpty()) {
                primeiroNumero = Double.parseDouble(visor.getText());
                operador = valor;
                inicioNovoNumero = true;
            }
        } else if (valor.equals("=")) {
            if (!visor.getText().isEmpty() && !operador.isEmpty()) {
                double segundoNumero = Double.parseDouble(visor.getText());
                double resultado = 0;

                // Aqui foi meu metodo criado para a calculadora simples
                switch (operador) {
                    case "+" -> resultado = CalculadoraSimples.soma(primeiroNumero, segundoNumero);
                    case "-" -> resultado = CalculadoraSimples.subtracao(primeiroNumero, segundoNumero);
                    case "*" -> resultado = CalculadoraSimples.multiplicacao(primeiroNumero, segundoNumero);
                    case "/" -> {
                        if (segundoNumero != 0) {
                            resultado = CalculadoraSimples.divisao(primeiroNumero, segundoNumero);
                        } else {
                            visor.setText("Erro: Div/0");
                            inicioNovoNumero = true;
                            operador = "";
                            return;
                        }
                    }
                }

                visor.setText(String.valueOf(resultado));
                operador = "";
                inicioNovoNumero = true;
            }
        } else if (valor.equals("C")) {
            visor.setText("");
            primeiroNumero = 0;
            operador = "";
            inicioNovoNumero = true;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}