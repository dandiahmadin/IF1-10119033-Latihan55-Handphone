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
 * Deskripsi Program : Program ini berisi informasi Handphone dengan pendekatan object oriented dan 
 * penerapan konsep pewarisan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Android samsung = new Android("Samsung", "Android", "Grand", 3000000);
        samsung.setKeyStore("234ibfd3840fo");
        samsung.displayProduct();
        System.out.println("Android Key Stone : ".concat(samsung.getKeyStore() + "\n"));
        
        BlackBerry bb = new BlackBerry("BlackBerry", "RIM", "Curve", 2000000);
        bb.setPinBB("BHS249");
        bb.displayProduct();
        System.out.println("PIN : ".concat(bb.getPinBB() + "\n"));
        
        WindowsPhone nokia = new WindowsPhone("Nokia", "Win 8", "Lumia ", 1000000);
        nokia.setWpKeyStore("UUUQIJWORJ");
        nokia.displayProduct();
        System.out.println("WP Key Store : ".concat(nokia.getWpKeyStore() + "\n"));
    }
    
}
