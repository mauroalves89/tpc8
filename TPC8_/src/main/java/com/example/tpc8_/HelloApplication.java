package com.example.tpc8_;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();


        Text texto = new Text("TPC 8");
        texto.setFont(Font.font("Arial", FontWeight.BOLD, 42));
        texto.setFill(Color.GREEN);
        texto.setLayoutX(50);
        texto.setLayoutY(50);


        Rectangle retangulo = new Rectangle(100, 150, 100, 100);
        retangulo.setFill(Color.BLUE);
        retangulo.setStroke(Color.BLACK);
        retangulo.setStrokeWidth(3);


        Line linha = new Line(670, 100, 300, 100);
        linha.setStroke(Color.RED);
        linha.setLayoutX(-150);
        linha.setLayoutY(150);
        linha.setRotate(45);


        Polygon triangulo = new Polygon(400, 150, 500, 250, 300, 250);
        triangulo.setFill(Color.YELLOW);
        triangulo.setStroke(Color.YELLOW);


        double X = -((530 - 200) / 2.0);
        double Y = -((200 - 500) / 2.0);
        triangulo.setTranslateX(X);
        triangulo.setTranslateY(Y);


        Circle circulo = new Circle(100, 500, 50);
        circulo.setFill(Color.ORANGE);

        double PosicaoX = 390;
        double PosicaoY = 430;
        circulo.setCenterX(PosicaoX);
        circulo.setCenterY(PosicaoY);

        Image imagem = new Image("C:/Users/Mauro/IdeaProjects/TPC8_/uta.png");
        ImageView imageView = new ImageView(imagem);
        imageView.setLayoutX(50);
        imageView.setLayoutY(450);

        root.getChildren().addAll(texto, linha, triangulo, retangulo,circulo, imageView);

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TPC8");
        primaryStage.show();
        scene.setFill(Color.CYAN);

    }
}