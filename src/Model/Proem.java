package Model;

import sun.util.locale.provider.SPILocaleProviderAdapter;

import java.util.Scanner;

public class Proem {
    public  double dlina;
    public  double shirina;
    double pl_res;
double rez_p;
    public double getDlina() {
        return dlina;
    }

    public void setDlina(double dlina) {
        this.dlina = dlina;
    }

    public double getShirina() {
        return shirina;
    }

    public void setShirina(double shirina) {
        this.shirina = shirina;
    }

    public double getPl_res() {
        return pl_res;
    }

    public void setPl_res(double pl_res) {
        this.pl_res = pl_res;
    }

    public Proem(double dlina, double shirina) {
        this.dlina = dlina;
        this.shirina = shirina;

    }



    public String toString(){
        pl_res =dlina*shirina;
        System.out.println(pl_res+"jnj");
        return "Длина" + dlina+"ширина"+shirina;

    }

public double res()
{
    // расчет проемов
   //System.out.println(shirina+"jnj");
 pl_res =dlina*shirina;
    System.out.println(pl_res+"!!!!!!!!!!");
    return pl_res;

}
}

