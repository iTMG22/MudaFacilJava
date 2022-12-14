package MudaFacilFx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InterfazBuscarMudanzaConductor {

    @FXML
    private Button buscarMudanzaConductorBotonSeleccionar;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaTamanio;

    @FXML
    private TableView<?> buscarMudanzaConductorTabla;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaRecogida;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaDestino;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaPago;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaDia;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaHora;

    @FXML
    private TableColumn<?, ?> buscarMudanzaConductorTablaTipo;

    public void closeConductor(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazMenuConductor.fxml"));
            Parent root = loader.load();

            InterfazMenuConductor controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeWindow());

            Stage myStage = (Stage) this.buscarMudanzaConductorTabla.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @FXML
    void tomarMudanzaSiguiente(ActionEvent event){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/MudaFacilFx/InterfazBuscarExitoso.fxml"));
            Parent root = loader.load();

            InterfazBuscarExitoso controller = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            stage.setOnCloseRequest(e -> controller.closeConductor());

            Stage myStage = (Stage) this.buscarMudanzaConductorBotonSeleccionar.getScene().getWindow();
            myStage.close();

        } catch (IOException e) {
            Logger.getLogger(InterfazMenuCliente.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
