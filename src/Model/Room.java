package Model;

public class Room {
    public  double dlina_r;
    public double shirina_r;
    public  double visota_r;
    public  double dlina;
    public  double shirina;
    public double res;
    Proem pr;
    public Room(double dlina,double shirina,double visota)
    {
this.dlina_r=dlina;
this.shirina_r=shirina;
this.visota_r=visota;
    }

    public double getShirina() {
        return shirina_r;
    }

    public double getVisota() {
        return visota_r;
    }

    public double getDlina() {
        return dlina_r;
    }

    public void setDlina(double dlina) {
        this.dlina_r = dlina;
    }

    public void setShirina(double shirina) {
        this.shirina_r = shirina;
    }

    public void setVisota(double visota) {
        this.visota_r = visota;
    }
    public double result()
    {
      //расчет комнаты
        res=2*(dlina_r*visota_r+visota_r*shirina_r);
        System.out.println(dlina_r);
        return res;

    }
}
