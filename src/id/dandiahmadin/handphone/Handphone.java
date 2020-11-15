/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.handphone;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class Handphone yang merupakan superclass
 */
public class Handphone {
    protected String manufacture, operatingSystem, model;
    protected int harga;
    
    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct() {
        System.out.println("Manufaktur : ".concat(manufacture));
        System.out.println("OS : ".concat(operatingSystem));
        System.out.println("Model : ".concat(model));
        System.out.println("Harga : " + harga);
    }
}
