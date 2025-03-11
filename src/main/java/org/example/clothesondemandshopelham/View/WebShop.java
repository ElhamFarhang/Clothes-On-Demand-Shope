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

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WebShop extends Application {
    private double price = 0;
    private String priceStr;
    private ProductBuilder builder = new ProductBuilder();
    private Product product = new Product();
    private Pants pants = new Pants();
    private TShirt tShirt = new TShirt();
    private Skirt skirt = new Skirt();
    private List<Product> orderList = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        AnchorPane anchorPane=new AnchorPane();
        anchorPane.setPrefSize(400,600);

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

        buttonSelect.setOnAction(e->{
            if(comboBoxCloths.getValue().equals("Pants")) {
                Pants product1 = builder
                        .setId(pants.getId())
                        .setProductName(comboBoxCloths.getValue())
                        .setSize(comboBoxSize.getValue())
                        .setMaterial(comboBoxMaterial.getValue())
                        .setColor(comboBoxColor.getValue())
                        .setPrice(pants.getPrice())
                        .buildPants(comboBoxFit.getValue(),comboBoxLength.getValue());
                product=product1;
                product.setDetail1(product1.getFit());
                product.setDetail2(product1.getLength());
                textArea.appendText(product1.toString());
                DesignPants decorateCommand= new DesignPants(product1);
                textArea.appendText("\n"+decorateCommand.designProduct());

            }else if (comboBoxCloths.getValue().equals("TShirt")) {
                TShirt product2 = builder
                        .setId(tShirt.getId())
                        .setProductName(comboBoxCloths.getValue())
                        .setSize(comboBoxSize.getValue())
                        .setMaterial(comboBoxMaterial.getValue())
                        .setColor(comboBoxColor.getValue())
                        .setPrice(tShirt.getPrice())
                        .buildTShirt(comboBoxSleeves.getValue(),comboBoxNeck.getValue());
                product=product2;
                product.setDetail1(product2.getSleeves());
                product.setDetail2(product2.getNeck());
                textArea.appendText(product2.toString());
                DesignTShirt decorateCommand= new DesignTShirt(product2);
                textArea.appendText("\n"+decorateCommand.designProduct());

            }else if (comboBoxCloths.getValue().equals("Skirt")) {
                Skirt product3 = builder
                        .setId(skirt.getId())
                        .setProductName(comboBoxCloths.getValue())
                        .setSize(comboBoxSize.getValue())
                        .setMaterial(comboBoxMaterial.getValue())
                        .setColor(comboBoxColor.getValue())
                        .setPrice(skirt.getPrice())
                        .buildSkirt(comboBoxWaistline.getValue(),comboBoxPattern.getValue());
                product=product3;
                product.setDetail1(product3.getWaistline());
                product.setDetail2(product3.getPattern());
                textArea.appendText(product3.toString());
                DesignSkirt decorateCommand= new DesignSkirt(product3);
                textArea.appendText("\n"+decorateCommand.designProduct());
            }
            priceStr=String.valueOf(product.getPrice());
            labelPrice.setText(priceStr);
            orderList.add(product);
            buttonOrder.setDisable(false);
        });

        buttonOrder.setOnAction(e->{
            Random random = new Random();
            int cusID = random.nextInt(1000);
            int orderId= random.nextInt(1000);
            Customer customer = new Customer(cusID,textFieldName.getText(),textFieldAddress.getText(),textFieldEmail.getText());
            CEO ceo = new CEO();
            Order order = new Order();
            order.addPropertyChangeListener(ceo);
            order.setId(orderId);
            order.setCustomer(customer);
            order.setProducts(orderList);
            Receipt receipt = new Receipt(customer,order);
            receipt.printReceipt();
//            System.out.println(order.toString());
        });

        anchorPane.getChildren().addAll(textArea,labelCustomer, textFieldName,labelEmail, textFieldEmail, labelAddress, textFieldAddress);
        anchorPane.getChildren().addAll(comboBoxCloths, comboBoxSize, comboBoxMaterial, comboBoxColor, comboBoxFit, comboBoxLength, comboBoxSleeves, comboBoxNeck, comboBoxWaistline, comboBoxPattern, labelPrice, buttonSelect, buttonOrder);
        Scene scene=new Scene(anchorPane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
