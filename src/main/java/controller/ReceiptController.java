package controller;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import routings.SetCashierScreen;
import variables.CashAndChange;
import variables.ListOfProducts;
import variables.Total;
import variables.TypeOfPayment;

import java.util.ArrayList;
import java.util.List;

public class ReceiptController {
    @FXML
    ScrollPane scroll;

    @FXML
    AnchorPane pane;

    public void initialize() {
        loadComponents();
        clearAll();
    }

    private void loadComponents() {
        double YPosition = 220;
        final int X_DESCRIPTION = 14;
        final int X_PRICE = 264;
        final int MAX_DESCRIPTION_WIDTH = 240;
        final int MAX_PRICE_WIDTH = 65;

        ArrayList<List<String>> products = ListOfProducts.purchasedProducts;

        int products_size = products.size();

        scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        for (int i = 0; i < products_size; i++) {
            String description = products.get(i).get(0);
            String price = products.get(i).get(1);

            Text description_text = new Text(X_DESCRIPTION, YPosition, description);
            description_text.setFont(Font.font("Consolas", 12));
            description_text.setWrappingWidth(MAX_DESCRIPTION_WIDTH);
            description_text.setTextAlignment(TextAlignment.LEFT);
            pane.getChildren().add(description_text);

            Text price_text = new Text(X_PRICE, YPosition, '$' + price);
            price_text.setFont(Font.font("Consolas", 12));
            price_text.setWrappingWidth(MAX_PRICE_WIDTH);
            price_text.setTextAlignment(TextAlignment.RIGHT);
            pane.getChildren().add(price_text);

            YPosition += description_text.getBoundsInLocal().getHeight() + 8;
        }
        YPosition += 20;

        Text starsLine = new Text(14, YPosition, "*************************************************");
        starsLine.setFont(Font.font(15));
        pane.getChildren().add(starsLine);

        YPosition += 20;

        Text total_text = new Text(14, YPosition, "Total");
        total_text.setFont(Font.font("Consolas", FontWeight.BOLD, 20));
        pane.getChildren().add(total_text);

        Text total_value = new Text(244, YPosition, '$' + Double.toString(Total.total));
        total_value.setFont(Font.font("Consolas", FontWeight.BOLD, 20));
        total_value.setWrappingWidth(MAX_PRICE_WIDTH + 20);
        total_value.setTextAlignment(TextAlignment.RIGHT);
        pane.getChildren().add(total_value);

        YPosition += 28;

        if (TypeOfPayment.cash) {
            Text cash = new Text(14, YPosition, "Cash");
            cash.setFont(Font.font("Consolas", 15));
            pane.getChildren().add(cash);

            Text cash_value = new Text(264, YPosition, '$' + Double.toString(CashAndChange.cash));
            cash_value.setFont(Font.font("Consolas", 15));
            cash_value.setWrappingWidth(MAX_PRICE_WIDTH);
            cash_value.setTextAlignment(TextAlignment.RIGHT);
            pane.getChildren().add(cash_value);

            YPosition += 23;

            Text change = new Text(14, YPosition, "Change");
            change.setFont(Font.font("Consolas", 15));
            pane.getChildren().add(change);

            Text change_value = new Text(264, YPosition, '$' + Double.toString(CashAndChange.change));
            change_value.setFont(Font.font("Consolas", 15));
            change_value.setWrappingWidth(MAX_PRICE_WIDTH);
            change_value.setTextAlignment(TextAlignment.RIGHT);
            pane.getChildren().add(change_value);
        }
        else if (TypeOfPayment.card) {
            Text card = new Text(14, YPosition, "Card");
            card.setFont(Font.font("Consolas", 15));
            pane.getChildren().add(card);

            Text card_value = new Text(264, YPosition, '$' + Double.toString(Total.total));
            card_value.setFont(Font.font("Consolas", 15));
            card_value.setWrappingWidth(MAX_PRICE_WIDTH);
            card_value.setTextAlignment(TextAlignment.RIGHT);
            pane.getChildren().add(card_value);

            YPosition += 23;

            starsLine = new Text(14, YPosition, "*************************************************");
            starsLine.setFont(Font.font(15));
            pane.getChildren().add(starsLine);

            YPosition += 25;

            Text bank_card = new Text(14, YPosition, "Bank card");
            bank_card.setFont(Font.font("Consolas", 15));
            pane.getChildren().add(bank_card);

            Text bank_card_number = new Text(164, YPosition, "**** **** **** 0000");
            bank_card_number.setFont(Font.font("Consolas", 15));
            bank_card_number.setTextAlignment(TextAlignment.RIGHT);
            bank_card_number.setWrappingWidth(MAX_PRICE_WIDTH + 100);
            pane.getChildren().add(bank_card_number);

            YPosition += 23;

            Text approval_code = new Text(14, YPosition, "Approval Code");
            approval_code.setFont(Font.font("Consolas", 15));
            pane.getChildren().add(approval_code);

            Text code = new Text(234, YPosition, "#123456");
            code.setFont(Font.font("Consolas", 15));
            code.setTextAlignment(TextAlignment.RIGHT);
            code.setWrappingWidth(MAX_PRICE_WIDTH + 30);
            pane.getChildren().add(code);
        }

        YPosition += 23;

        starsLine = new Text(14, YPosition, "*************************************************");
        starsLine.setFont(Font.font(15));
        pane.getChildren().add(starsLine);

        YPosition += 35;

        Text thanks = new Text(122, YPosition, "THANK YOU!");
        thanks.setFont(Font.font("Consolas", FontWeight.BOLD, 20));
        pane.getChildren().add(thanks);

        double receiptHeight = YPosition + 50;

        pane.setMinHeight(receiptHeight);
        if (receiptHeight > 700) {
            scroll.setMinHeight(700);
            scroll.setMinHeight(700);
        } else {
            scroll.setMinHeight(receiptHeight + 5);
            scroll.setMaxHeight(receiptHeight + 5);
            scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        }
    }

    private void clearAll() {
        Total.total = 0.0;

        TypeOfPayment.cash = false;
        TypeOfPayment.card = false;

        ListOfProducts.purchasedProducts.clear();

        new SetCashierScreen().runThis(CashierController.mainController);
    }
}
