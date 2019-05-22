/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Conversor {

    public int BinADec(String text) {
        int num = Integer.parseInt(text, 2);
        return num;
    }

    public String DecABin(String text){
        int num = Integer.parseInt(text);
        String bin = Integer.toBinaryString(num);
        return bin;
    }
}
