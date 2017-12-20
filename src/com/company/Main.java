package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {


        //fout = beleír
        //fin = kiolvas
        // változó neveket fell kell cserélni, hogy melyik fusson
                                    // példányíosítás kezdete
        FileOutputStream fout = null;
        FileInputStream fin = null;
                                    // példányosítás vége
                                                                    // try ÁG kezdete
        try {
                                // fájl hely megadás kezdete
            fout = new FileOutputStream("/home/java1/Asztal/text.txt");
            fin = new FileInputStream("/home/java1/Asztal/kosztolanyi_dezso_hajnali_reszegseg.txt");
                                // fájl hely megadás vége
                                        // hozzáírás kezdete
          //  String s = "Hello World!";
          //  fout.read(s.getBytes());
                                        // hozzáírás vége
                                        //kiíratás kezdete
            int i;
            while ((i = fin.read()) !=-1) {
                System.out.print((char)i);
                //hozzáírja a i-edik charactert az új fájba
                fout.write(i);
            }
                                        //kiíratás vége
                                                                    // try ÁG vége
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {             //fájl lezárás mindig finalllyba van, ez mindig lefut
                                // if ág azért hogy ne legyen nullPointer hiba
            if (fin != null && fout !=null) {
                try {
                    fin.close();
                    fout.close();
                } catch (IOException e) {
                    //ez ugyanaz mint a sima System.err
                    e.printStackTrace();
                }
            }
        }



    }




}
