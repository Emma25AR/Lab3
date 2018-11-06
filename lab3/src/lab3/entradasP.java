/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Victor
 */
public abstract class entradasP {
    private String name;
    private String province;

    public entradasP(String name, String province, int extranjero, int nacional) {
        this.name = name;
        this.province = province;
        this.extranjero = extranjero;
        this.nacional=nacional;
    }
    private int extranjero;
    private int nacional;

    public entradasP() {
        this("","",6000,5000);
   
    }

    @Override
    public String toString() {
        return "entradasP{" + "name=" + name + ", province=" + province + ", extranjero=" + extranjero + ", nacional=" + nacional + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getExtranjero() {
        return extranjero;
    }

    public void setExtranjero(int extranjero) {
        this.extranjero = extranjero;
    }

    public int getNacional() {
        return nacional;
    }

    public void setNacional(int nacional) {
        this.nacional = nacional;
    }
    public abstract int ingresos();
     
    
    
}
