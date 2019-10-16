/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan31.perkenalanmahasiswa;

/**
 * Nama Nama : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan Biodata
 * @author Rama
 */
public class Mahasiswa {

    public String nim;
    public String nama;

    public void perkenalkanDiri(String nim, String nama) {
        System.out.println("Hallo Everyone");
        System.out.printf("My NIM is\t: %s%n", nim);
        System.out.printf("My Name is\t: %s%n%n", nama);
}
}
