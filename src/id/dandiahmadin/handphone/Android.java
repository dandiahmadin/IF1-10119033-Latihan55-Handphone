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
 * Deskripsi Program : Program ini berisi class Android yang merupakan subclass dari class Handphone (superclass)
 */

public class Android extends Handphone {
    private String keyStore;

    public Android(String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    
}
