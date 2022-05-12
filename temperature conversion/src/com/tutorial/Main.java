package com.tutorial;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String suhuA, suhuB, ck;
        double C, R, F, K;
        double celcius = 0;
        double reamur = 0;
        double fahrenheit = 0;
        double kelvin = 0;
        double nilai = 0;
        double hasil_konversi;
        int loop;

        Scanner input = new Scanner(System.in);
        ArrayList history = new ArrayList();

        loop = 0;
        do {
        System.out.println("masukkan suhu yang ingin di konversi : ");
        suhuA = input.nextLine();
        System.out.println("akan dikonversikan ke : ");
        suhuB = input.nextLine();
        System.out.println("masukkan nilai suhu " + suhuA + " : ");
        nilai = input.nextDouble();

        if (suhuA.equals("celcius")) {
            R = nilai * 8;
            F = nilai * 9 / 5 + 32;
            K = nilai + 273;

            if (suhuB.equals("reamur")) {
                hasil_konversi = R;
            } else if (suhuB.equals("fahrenheit")) {
                hasil_konversi = F;
            } else if (suhuB.equals("kelvin")) {
                hasil_konversi = K;
            } else if (suhuB.equals("celcius")) {
                hasil_konversi = nilai;
            } else {
                hasil_konversi = 0;
            }
        } else if (suhuA.equals("reamur")) {
            C = nilai / 0.8;
            F = nilai * 9 / 5 + 32;
            K = (nilai / 0.8) + 273;

            if (suhuB.equals("celcius")) {
                hasil_konversi = C;
            } else if (suhuB.equals("fahrenheit")) {
                hasil_konversi = F;
            } else if (suhuB.equals("kelvin")) {
                hasil_konversi = K;
            } else if (suhuB.equals("reamur")) {
                hasil_konversi = nilai;
            } else {
                hasil_konversi = 0;
            }
        } else if (suhuA.equals("fahrenheit")) {
            C = (nilai - 32) * 5 / 9;
            R = (nilai - 32) * 4 / 9;
            K = (nilai / 0.8) + 273;

            if (suhuB.equals("celcius")) {
                hasil_konversi = C;
            } else if (suhuB.equals("fahrenheit")) {
                hasil_konversi = nilai;
            } else if (suhuB.equals("kelvin")) {
                hasil_konversi = K;
            } else if (suhuB.equals("reamur")) {
                hasil_konversi = R;
            } else {
                hasil_konversi = 0;
            }
        } else if (suhuA.equals("kelvin")) {
            C = nilai - 273;
            F = (nilai - 273) * 9 / 5 + 32;
            R = (nilai - 273) + 8;

            if (suhuB.equals("celcius")) {
                hasil_konversi = C;
            } else if (suhuB.equals("fahrenheit")) {
                hasil_konversi = F;
            } else if (suhuB.equals("kelvin")) {
                hasil_konversi = nilai;
            } else if (suhuB.equals("reamur")) {
                hasil_konversi = R;
            } else {
                hasil_konversi = 0;
            }
        } else {
            hasil_konversi = 0;
        }
        history.add(hasil_konversi); //menambah ke indeks
        System.out.println("konversi suhu dari " + suhuA + " ke " + suhuB + " adalah " + hasil_konversi);

        input = new Scanner(System.in);
        System.out.println("ingin mencari konversi suhu lain ? (Y/T)");
        ck = input.nextLine();

        if (ck.equals("Y")) {

        } else {
            loop++;
        }
        System.out.println(); //untuk spasi
        } while (loop < 1 );
        System.out.println();
        System.out.println("History hasil konversi");

        System.out.println(history);
        for (int i = 0; i < history.size(); i += 4){
            System.out.println("konversi suhu dari " +history.get(i+2)+ history.get(i)+ " ke "+ history.get(i+1)+ " adalah " + history.get(i+3) + history.get(i+1));
        }


    }
}
