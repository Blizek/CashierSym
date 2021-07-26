package controller;

import features.*;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import routings.PaymentMain;
import routings.SetPaymentMethodScreen;
import variables.Code;
import variables.ListOfProducts;
import variables.Total;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CashierController {
    public static MainController mainController;

    @FXML
    TextField field;

    @FXML
    Text sum, codeError;

    @FXML
    ScrollPane scroll;

    @FXML
    AnchorPane scrollPane;

    private String fieldNumbers = "";

    public void setMainController(MainController mainController) { CashierController.mainController = mainController; }

    public void add0(){ fieldNumbers = new UpdateField().update(field, "0", fieldNumbers); }

    public void add1(){ fieldNumbers = new UpdateField().update(field, "1", fieldNumbers); }

    public void add2(){ fieldNumbers = new UpdateField().update(field, "2", fieldNumbers); }

    public void add3(){ fieldNumbers = new UpdateField().update(field, "3", fieldNumbers); }

    public void add4(){ fieldNumbers = new UpdateField().update(field, "4", fieldNumbers); }

    public void add5(){ fieldNumbers = new UpdateField().update(field, "5", fieldNumbers); }

    public void add6(){ fieldNumbers = new UpdateField().update(field, "6", fieldNumbers); }

    public void add7(){ fieldNumbers = new UpdateField().update(field, "7", fieldNumbers); }

    public void add8(){ fieldNumbers = new UpdateField().update(field, "8", fieldNumbers); }

    public void add9(){ fieldNumbers = new UpdateField().update(field, "9", fieldNumbers); }

    public void addPoint(){ fieldNumbers = new UpdateField().update(field, ".", fieldNumbers); }

    public void exitFunction() {System.exit(0);}

    public void backspace() {
        fieldNumbers = new BackspaceFunction().setBackspaceFunction(fieldNumbers, field);
    }

    public void setCode() {
        fieldNumbers = new SetCashierType().setType(field);
    }

    public void setMultiplier() {
        Code.setCode(field.getText());
        fieldNumbers = new SetCashierType().setType(field);
    }

    public void setWeight() {
        Code.setCode(field.getText());
        fieldNumbers = new SetCashierType().setType(field);
    }

    public void add() throws IOException {
        new LoadCodeAndValue().saveData(Code.code, Double.parseDouble(field.getText()));
        LoadProductData.data();
        Code.setCode("");
        fieldNumbers = new SetCashierType().setType(field);
        Total.add(Double.parseDouble(ListOfProducts.purchasedProducts.get(ListOfProducts.purchasedProducts.size() - 1).get(1)));
        loadListOfProducts();
    }

    private void loadListOfProducts() {
        ArrayList<List<String>> products = ListOfProducts.purchasedProducts;
        if (products.size() <= 6) {
            scroll.minHeight(473);
        } else {
            scrollPane.setMinHeight(products.size() * 70 + 20);
            scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
            scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        }

        scrollPane.getChildren().clear();

        int YPosition = 10;
        for (int i = 0; i < products.size(); i++) {
            AnchorPane pane = new AnchorPane();
            pane.setMaxWidth(400);
            pane.setMinWidth(400);
            pane.setMaxHeight(60);
            pane.setMinHeight(60);
            pane.setLayoutX(4);
            pane.setLayoutY(YPosition);
            pane.setStyle("-fx-background-color: #ffffff; -fx-border-color: #000000; -fx-border-width: 5");

            Text info = new Text(14, 34, products.get(i).get(0));
            if (products.get(i).get(0).length() > 22) {
                String newData = ShorterText.shorter(products.get(i).get(0));
                info.setText(newData);
            }
            info.setFont(Font.font("Consolas", 20));
            info.setWrappingWidth(265);
            info.setTextAlignment(TextAlignment.LEFT);

            Text cost = new Text(290, 34, "$" + products.get(i).get(1));
            cost.setFont(Font.font("Consolas", 20));
            cost.setWrappingWidth(100);
            cost.setTextAlignment(TextAlignment.RIGHT);

            pane.getChildren().add(info);
            pane.getChildren().add(cost);

            scrollPane.getChildren().add(pane);
            YPosition += 70;
        }
        UpdateTotal.updateTotalField(sum);
    }

    public void deleteProduct() {
        if (ListOfProducts.purchasedProducts.size() > 0) {
            Total.remove(Double.parseDouble(ListOfProducts.purchasedProducts.get(ListOfProducts.purchasedProducts.size() - 1).get(1)));
            ListOfProducts.purchasedProducts.remove(ListOfProducts.purchasedProducts.size() - 1);
            loadListOfProducts();
        }
    }

    public void print() throws IOException {
        new PaymentMain().runThis();
    }
}
