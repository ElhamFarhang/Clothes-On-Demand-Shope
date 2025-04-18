package org.example.clothesondemandshopelham.View;

import org.example.clothesondemandshopelham.OrderObserver.*;
import org.example.clothesondemandshopelham.Command.*;
import org.example.clothesondemandshopelham.ProductDetails.*;
import org.example.clothesondemandshopelham.ProductBuilder.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import org.example.clothesondemandshopelham.OrderService.OrderService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WebShop extends Application {
    private String priceStr;
    private ProductBuilder builder = new ProductBuilder();
    private Product product = new Product();
    private DesignProduct pipeline = new DesignProduct();
    private Pants pants = new Pants();
    private TShirt tShirt = new TShirt();
    private Skirt skirt = new Skirt();
    private List<Product> orderList = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane anchorPane=new AnchorPane();
        anchorPane.setPrefSize(400,600);
        AnchorPane anchorPaneReceipt=new AnchorPane();
        anchorPaneReceipt.setPrefSize(690,400);
        Label labelReceipt= new Label("Receipt");
        labelReceipt.setFont(new Font("Cambria Bold",12));
        labelReceipt.setLayoutX(20);
        labelReceipt.setLayoutY(30);
        Button buttonClose= new Button("Close");
        buttonClose.setPrefSize(180,30);
        buttonClose.setLayoutX(255);
        buttonClose.setLayoutY(330);
        anchorPaneReceipt.getChildren().addAll(labelReceipt,buttonClose);
        Scene receiptScene= new Scene(anchorPaneReceipt);

        Label labelCustomer= new Label("Customers Name:");
        labelCustomer.setFont(new Font("Cambria Bold",12));
        labelCustomer.setLayoutX(20);
        labelCustomer.setLayoutY(30);

        TextField textFieldName= new TextField();
        textFieldName.setPromptText("Name");
        textFieldName.setLayoutX(135);
        textFieldName.setLayoutY(27);

        Label labelEmail= new Label("Customers email:");
        labelEmail.setFont(new Font("Cambria Bold",12));
        labelEmail.setLayoutX(20);
        labelEmail.setLayoutY(70);

        TextField textFieldEmail= new TextField();
        textFieldEmail.setPromptText("email");
        textFieldEmail.setLayoutX(135);
        textFieldEmail.setLayoutY(67);

        Label labelAddress= new Label("Customers Address:");
        labelAddress.setFont(new Font("Cambria Bold",12));
        labelAddress.setLayoutX(20);
        labelAddress.setLayoutY(110);

        TextField textFieldAddress = new TextField();
        textFieldAddress.setPromptText("Address");
        textFieldAddress.setLayoutX(135);
        textFieldAddress.setLayoutY(108);

        ComboBox<String> comboBoxCloths =new ComboBox<>();
        comboBoxCloths.setPrefSize(100,23);
        comboBoxCloths.setPromptText("Cloths");
        comboBoxCloths.setLayoutX(20);
        comboBoxCloths.setLayoutY(150);
        comboBoxCloths.getItems().addAll(ProductName.Pants.name(),ProductName.TShirt.name(),ProductName.Skirt.name());

        ComboBox<String> comboBoxSize =new ComboBox<>();
        comboBoxSize.setPrefSize(100,23);
        comboBoxSize.setPromptText("Size");
        comboBoxSize.setLayoutX(20);
        comboBoxSize.setLayoutY(190);
        comboBoxSize.getItems().addAll(Size.Small.name(), Size.Medium.name(), Size.Large.name());

        ComboBox<String> comboBoxMaterial =new ComboBox<>();
        comboBoxMaterial.setPrefSize(100,23);
        comboBoxMaterial.setPromptText("Material");
        comboBoxMaterial.setLayoutX(130);
        comboBoxMaterial.setLayoutY(190);
        comboBoxMaterial.getItems().addAll(Material.Cotton.name(),Material.Linen.name(),Material.Polyester.name());

        ComboBox<String> comboBoxColor =new ComboBox<>();
        comboBoxColor.setPrefSize(100,23);
        comboBoxColor.setPromptText("Color");
        comboBoxColor.setLayoutX(240);
        comboBoxColor.setLayoutY(190);
        comboBoxColor.getItems().addAll(Color.White.name(),Color.Black.name(),Color.Blue.name());

        ComboBox<String> comboBoxFit =new ComboBox<>();
        comboBoxFit.setPrefSize(100,23);
        comboBoxFit.setPromptText("Fit");
        comboBoxFit.setLayoutX(20);
        comboBoxFit.setLayoutY(230);
        comboBoxFit.getItems().addAll(Fit.Slim.name(),Fit.Cargo.name());
        comboBoxFit.setDisable(true);

        ComboBox<String> comboBoxLength=new ComboBox<>();
        comboBoxLength.setPrefSize(100,23);
        comboBoxLength.setPromptText("Length");
        comboBoxLength.setLayoutX(130);
        comboBoxLength.setLayoutY(230);
        comboBoxLength.getItems().addAll(Length.Long.name(),Length.Short.name());
        comboBoxLength.setDisable(true);

        ComboBox<String> comboBoxSleeves=new ComboBox<>();
        comboBoxSleeves.setPrefSize(100,23);
        comboBoxSleeves.setPromptText("Sleeve");
        comboBoxSleeves.setLayoutX(20);
        comboBoxSleeves.setLayoutY(270);
        comboBoxSleeves.getItems().addAll(Sleeves.LongSleeve.name(),Sleeves.ShortSleeve.name());
        comboBoxSleeves.setDisable(true);

        ComboBox<String> comboBoxNeck=new ComboBox<>();
        comboBoxNeck.setPrefSize(100,23);
        comboBoxNeck.setPromptText("Neck");
        comboBoxNeck.setLayoutX(130);
        comboBoxNeck.setLayoutY(270);
        comboBoxNeck.getItems().addAll(Neck.VNeck.name(),Neck.RoundNeck.name());
        comboBoxNeck.setDisable(true);

        ComboBox<String> comboBoxWaistline=new ComboBox<>();
        comboBoxWaistline.setPrefSize(100,23);
        comboBoxWaistline.setPromptText("Waistline");
        comboBoxWaistline.setLayoutX(20);
        comboBoxWaistline.setLayoutY(310);
        comboBoxWaistline.getItems().addAll(Waistline.Slim.name(),Waistline.Straight.name());
        comboBoxWaistline.setDisable(true);

        ComboBox<String> comboBoxPattern=new ComboBox<>();
        comboBoxPattern.setPrefSize(100,23);
        comboBoxPattern.setPromptText("Pattern");
        comboBoxPattern.setLayoutX(130);
        comboBoxPattern.setLayoutY(310);
        comboBoxPattern.getItems().addAll(Pattern.Floral.name(),Pattern.Plain.name());
        comboBoxPattern.setDisable(true);

        Button buttonSelect = new Button("Select");
        buttonSelect.setPrefSize(100,23);
        buttonSelect.setLayoutX(20);
        buttonSelect.setLayoutY(350);

        Label labelPrice= new Label("Price");
        labelPrice.setFont(new Font("Cambria Bold",12));
        labelPrice.setLayoutX(130);
        labelPrice.setLayoutY(355);

        Button buttonOrder= new Button("Order");
        buttonOrder.setPrefSize(100,23);
        buttonOrder.setLayoutX(20);
        buttonOrder.setLayoutY(510);
        buttonOrder.setDisable(true);

        comboBoxCloths.setOnAction(e->{
            if(comboBoxCloths.getValue().equals("Pants")) {
                comboBoxFit.setDisable(false);
                comboBoxLength.setDisable(false);
                comboBoxSleeves.setDisable(true);
                comboBoxNeck.setDisable(true);
                comboBoxPattern.setDisable(true);
                comboBoxWaistline.setDisable(true);
            }else if (comboBoxCloths.getValue().equals("TShirt")) {
                comboBoxSleeves.setDisable(false);
                comboBoxNeck.setDisable(false);
                comboBoxFit.setDisable(true);
                comboBoxLength.setDisable(true);
                comboBoxPattern.setDisable(true);
                comboBoxWaistline.setDisable(true);
            }else if (comboBoxCloths.getValue().equals("Skirt")) {
                comboBoxFit.setDisable(true);
                comboBoxLength.setDisable(true);
                comboBoxSleeves.setDisable(true);
                comboBoxNeck.setDisable(true);
                comboBoxPattern.setDisable(false);
                comboBoxWaistline.setDisable(false);
            }
        });

        TextArea textArea=new TextArea();
        textArea.setPrefSize(380,100);
        textArea.setLayoutX(10);
        textArea.setLayoutY(390);

        buttonSelect.setOnAction(e-> {
            try{
                if (comboBoxCloths.getValue().equals("Pants")) {
                    Pants pants1 = builder
                            .setId(pants.getId())
                            .setProductName(comboBoxCloths.getValue())
                            .setSize(comboBoxSize.getValue())
                            .setMaterial(comboBoxMaterial.getValue())
                            .setColor(comboBoxColor.getValue())
                            .setPrice(pants.getPrice())
                            .buildPants();
                    product = pants1;
                    pipeline.addCommand(new SetFitCommand(comboBoxFit.getValue()));
                    pipeline.addCommand(new SetLengthCommand(comboBoxLength.getValue()));
                    textArea.appendText("\n" + pipeline.execute(product));
                    pipeline.clear();
                }
                else if (comboBoxCloths.getValue().equals("TShirt")) {
                    TShirt tShirt1 = builder
                            .setId(tShirt.getId())
                            .setProductName(comboBoxCloths.getValue())
                            .setSize(comboBoxSize.getValue())
                            .setMaterial(comboBoxMaterial.getValue())
                            .setColor(comboBoxColor.getValue())
                            .setPrice(tShirt.getPrice())
                            .buildTShirt();
                    product = tShirt1;
                    pipeline.addCommand(new SetSleevesCommand(comboBoxSleeves.getValue()));
                    pipeline.addCommand(new SetNeckCommand(comboBoxNeck.getValue()));
                    textArea.appendText("\n" + pipeline.execute(product));
                    pipeline.clear();
                }
                else if (comboBoxCloths.getValue().equals("Skirt")) {
                    Skirt skirt1 = builder
                            .setId(skirt.getId())
                            .setProductName(comboBoxCloths.getValue())
                            .setSize(comboBoxSize.getValue())
                            .setMaterial(comboBoxMaterial.getValue())
                            .setColor(comboBoxColor.getValue())
                            .setPrice(skirt.getPrice())
                            .buildSkirt();
                    product = skirt1;
                    pipeline.addCommand(new SetWaistlineCommand(comboBoxWaistline.getValue()));
                    pipeline.addCommand(new SetPatternCommand(comboBoxPattern.getValue()));
                    textArea.appendText("\n" + pipeline.execute(product));
                    pipeline.clear();

                }
                priceStr = String.valueOf(product.getPrice());
                labelPrice.setText(priceStr);
                orderList.add(product);

        } catch (Exception ex) {
                System.out.println("Choose a product please!");
            }
            buttonOrder.setDisable(false);
            });

        buttonOrder.setOnAction(e->{
                Random random = new Random();
                int cusID = random.nextInt(1000);
                int orderId = random.nextInt(1000);
                Customer customer = new Customer(cusID, textFieldName.getText(), textFieldAddress.getText(), textFieldEmail.getText());
                CEO ceo = new CEO();
                Order order = new Order();
                order.addPropertyChangeListener(ceo);
                order.setId(orderId);
                order.setCustomer(customer);
                order.setProducts(orderList);

            OrderService.getInstance().sendOrder(order);
            labelReceipt.setText(OrderService.getInstance().sendReceipt(order,customer));
            orderList.clear();
            primaryStage.setScene(receiptScene);
        });

        anchorPane.getChildren().addAll(textArea,labelCustomer, textFieldName,labelEmail, textFieldEmail, labelAddress, textFieldAddress);
        anchorPane.getChildren().addAll(comboBoxCloths, comboBoxSize, comboBoxMaterial, comboBoxColor, comboBoxFit, comboBoxLength, comboBoxSleeves, comboBoxNeck, comboBoxWaistline, comboBoxPattern, labelPrice, buttonSelect, buttonOrder);
        Scene homeScene=new Scene(anchorPane);
        primaryStage.setScene(homeScene);
        primaryStage.show();

        buttonClose.setOnAction(e->{
            textFieldName.clear();
            textFieldAddress.clear();
            textFieldEmail.clear();
            textArea.clear();
            primaryStage.setScene(homeScene);
            buttonOrder.setDisable(true);
        });
    }
}
