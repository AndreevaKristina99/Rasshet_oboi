package Model;

import static java.lang.Math.ceil;

public class Raschet_plo {
double razm_dl;
double razm_sh;
double dlina_room;
double shirirna_room;
double visota_room;
double dlina_proem;
double visota_proem;
    double result;
    double rez;
double rez_p;
    public double getRazm_dl() {
        return razm_dl;
    }

    public void setRazm_dl(double razm_dl) {
        this.razm_dl = razm_dl;
    }

    public double getRazm_sh() {
        return razm_sh;
    }

    public void setRazm_sh(double razm_sh) {
        this.razm_sh = razm_sh;
    }

    public double getDlina_room() {
        return dlina_room;
    }

    public void setDlina_room(double dlina_room) {
        this.dlina_room = dlina_room;
    }

    public double getShirirna_room() {
        return shirirna_room;
    }

    public void setShirirna_room(double shirirna_room) {
        this.shirirna_room = shirirna_room;
    }

    public double getVisota_room() {
        return visota_room;
    }

    public void setVisota_room(double visota_room) {
        this.visota_room = visota_room;
    }

    public double getDlina_proem() {
        return dlina_proem;
    }

    public void setDlina_proem(double dlina_proem) {
        this.dlina_proem = dlina_proem;
    }

    public double getVisota_proem() {
        return visota_proem;
    }

    public void setVisota_proem(double visota_proem) {
        this.visota_proem = visota_proem;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Proem getPr() {
        return pr;
    }

    public void setPr(Proem pr) {
        this.pr = pr;
    }

    public Raschet_plo(double razm_dl, double razm_sh ) {
        this.razm_dl = razm_dl;
        this.razm_sh = razm_sh;
        //        //rez площадь комнаты
    }
    Room room;
    Proem pr;

    public  double itog_res(double rezK,double rezP)
    {

       result=(rezK-rezP)/(razm_dl*razm_sh);// итоговый расчет кол-ва рулонов

        return  ceil(result);
    }

}
