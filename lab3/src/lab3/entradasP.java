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

    public entradasP() {
        this("","");
    }

    public entradasP(String name, String province) {
        this.name = name;
        this.province = province;
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

    @Override
    public String toString() {
        return "entradasP{" + "name=" + name + ", province=" + province + '}';
    }
    public abstract int ingresos();
     
    
    
}
