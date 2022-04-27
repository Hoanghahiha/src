package JavaFX_1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DemoController {
    public Text result;
    public Text errMsg;
    public TextField name;
    public TextField price;
    public TextField donVi;
    public TextField soLuong;

    public void submit(){
        try{
            Product p = new Product(name.getText(),
                    Integer.parseInt(donVi.getText()),Integer.parseInt(price.getText()),Integer.parseInt(soLuong.getText()));
            Main2.productList.add(p);
            Parent root = FXMLLoader.load(getClass().getResource("listp.fxml"));
            Main2.rootStage.setScene(new Scene(root,800,600));

            errMsg.setVisible(false);
        }catch (Exception e){
            errMsg.setText(e.getMessage());
            errMsg.setVisible(true);
        }

    }


}
