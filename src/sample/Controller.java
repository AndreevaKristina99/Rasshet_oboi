package sample;

import Model.Proem;
import Model.Raschet_plo;
import Model.Room;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;



public class Controller {
    public TextField proem_dlina;
    public TextField dlina;
    public TextField shirina;
    public Button resultat;
    public TextField visota;
    public TextField proem_shirina;
    public TextField razm_rulon2;
    public TextField razm_rulon1;
    public TextField rezult_kol;
    public ArrayList<Proem> items=new ArrayList<>();
    public ListView otobrazhenie_res;
    public Button hghghhgh;
    double dl;
    double sh;
    double vis;
    double proem_dl;
    double proem_sh;
    double razmer_dl;
    double razmer_sh;
    double rezProem;
    Proem pr;
     Room room;
     Raschet_plo plo;
    double rez;
    public void m_dlina(ActionEvent actionEvent) {
    }

    public void m_shirirna(ActionEvent actionEvent) {
    }

    public void m_proem_dlina(ActionEvent actionEvent) {
    }

    public void m_proem_shirina(ActionEvent actionEvent) {
    }

    public void m_resultat(ActionEvent actionEvent) {

        try {

    dl = Double.parseDouble(dlina.getText());
    sh = Double.parseDouble(shirina.getText());
    vis = Double.parseDouble(visota.getText());
            if (dl<0 && sh<0 && vis<0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Ошибка!");
                alert.setHeaderText(null);
                alert.setContentText("не верный ввод!введенное значение меньше 0");
                alert.showAndWait();
            }
    razmer_dl = Double.parseDouble(razm_rulon1.getText());
    razmer_sh = Double.parseDouble(razm_rulon2.getText());
    room = new Room(dl, sh, vis);
    rez = room.result();
    plo = new Raschet_plo(razmer_dl, razmer_sh);

    rezult_kol.setText(plo.itog_res(rez, rezProem) + "");
    //кол-во рулонов
    }
    catch (NumberFormatException e )
    {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    alert.setTitle("Ошибка!");
    alert.setHeaderText(null);
    alert.setContentText("не верный ввод!");
    alert.showAndWait();
    System.out.println("неверный ввод");
}

    }

    public void m_rulon_shirina(ActionEvent actionEvent) {
    }

    public void m_rulon(ActionEvent actionEvent) {
    }

    public void kolichestvo(ActionEvent actionEvent) {
    }

    public void add_proem(ActionEvent actionEvent) {
        try {

            proem_dl = Double.parseDouble(proem_dlina.getText());
            proem_sh = Double.parseDouble(proem_shirina.getText());
if(proem_sh<0 && proem_dl<0)
{
    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    alert.setTitle("Ошибка!");
    alert.setHeaderText(null);
    alert.setContentText("не верный ввод! Значение меньше 0");

    alert.showAndWait();
}
            pr = new Proem(proem_dl, proem_sh);
            items.add(pr);
            otobrazhenie_res.getItems().add(pr);
            rezProem= pr.res();

            proem_dlina.setText("");
            proem_shirina.setText("");
        }
        catch (NumberFormatException e)
        {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Ошибка!");
            alert.setHeaderText(null);
            alert.setContentText("не верный ввод!");

            alert.showAndWait();
            System.out.println("не верный ввод!!");
        }
    }

    public void m_visota(ActionEvent actionEvent) {

    }

    public void m_otobrazhenie(ListView.EditEvent editEvent) {
    }

    public void m_del(ActionEvent actionEvent) {
int index=otobrazhenie_res.getSelectionModel().getSelectedIndex();
        items.remove(index);
otobrazhenie_res.getItems().remove(index);
    }

    public void gfg3(ActionEvent actionEvent) {
    }
}
