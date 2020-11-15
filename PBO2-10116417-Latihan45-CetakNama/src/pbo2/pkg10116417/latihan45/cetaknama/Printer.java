/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan45.cetaknama;

/**
 *
 * @author Akmal
 */
class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {

//        Scanner scan = new Scanner(System.in);
//        Printer objP = new Printer();
        System.out.println("Nama Anda : " + nama);

    }

    public void cetak(int jmlCetak, String nama) {
        int i = 1;
        while (i <= jmlCetak) {

            System.out.println(i + ". " + nama);

            i++;
        }

    }
    
}
