/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

public class Tradutor {

    private String simbolos[];
    private char letras[];

//    public String traduzLeetSpeakLetra(String letra){
//        String traducao="palavra nao encotrda no dicionario";
//        Letra l = new Letra();
//        ArrayList<String> letraL = d.getArrayLetra();
//        ArrayList<String> simboloL = d.getArraySimbolo();
//        for (int i = 0; i < letraL.size(); i++) {
//            if(letraL.get(i).equals(letra)){
//                int indice = i;
//                i=letraL.size();
//                traducao = simboloL.get(indice);
//            }
//        }
//        return traducao;
//    }
//    public String traduzLeetSpeakSimbolo(String simbolo){
//        String traducao="palavra nao encotrda no dicionario";
//        Dicionario d = new Dicionario();
//        ArrayList<String> letraL = d.getArrayLetra();
//        ArrayList<String> simboloL = d.getArraySimbolo();
//        for (int i = 0; i < simboloL.size(); i++) {
//            if(simboloL.get(i).equals(simbolo)){
//                int indice = i;
//                i=simboloL.size();
//                traducao = simboloL.get(indice);
//            }
//        }
//        return traducao;
//    }
    public String[] getSimbolo() {
        return simbolos;
    }

    public void setSimbolo(String[] simbolos) {
        this.simbolos = simbolos;
    }

    public char[] getLetra() {
        return letras;
    }

    public void setLetra(char[] letras) {
        this.letras = letras;
    }

    //letra para leet
    public String traduzirLetraLeet(String s) {
        char l[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
        this.setLetra(l);
        String simb[] = {"4", "8", "(", ")", "3", "|=", "6", "#", "!", "u|", "|<", "1", "(T)", "~", "0", "|*", "(,)", "|2", "5", "7", "μ", "√", "VV", "><", "¥", "2", " "};
        this.setSimbolo(simb);
        String msg = "";

        for (int j = 0; j < s.toLowerCase().length(); j++) {
            for (int k = 0; k < 27; k++) {
                if (s.toLowerCase().charAt(j)== letras[k]) {
                    msg += " " + simbolos[k];
                }
            }
        }
        return msg;
    }

    //leet para letra
    public String traduzirLeetLetra(String s) {
        char l[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
        this.setLetra(l);
        String simb[] = {"4", "8", "(", ")", "3", "|=", "6", "#", "!", "u|", "|<", "1", "(T)", "~", "0", "|*", "(,)", "|2", "5", "7", "μ", "√", "VV", "><", "¥", "2", " "};
        this.setSimbolo(simb);
        String a = "";
        String b = "";
        String msg = "";
        for (int i = 0; i < s.length(); i++) {
            for (int k = 0; k < simbolos.length; k++) {
                if (simbolos[k].equalsIgnoreCase(s)) {
                    a+= " " + letras[k];
                    a=a.toUpperCase();
                    b+= " " + letras[k];
                    msg += a+", "+b;
                }
            }
        }
        return msg;
    }
    public static void main(String[] args) {
        Tradutor t = new Tradutor();
    }
//    public String converte(char a[], int tam) {
//        String invert = "";
//        char l[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
//        this.setLetra(l);
//        String simb[] = {"4", "8", "(", ")", "3", "|=", "6", "#", "!", "u|", "|<", "1", "(T)", "~", "0", "|*", "(,)", "|2", "5", "7", "μ", "√", "VV", "><", "¥", "2", " "};
//        this.setSimbolo(simb);
//        for (int i = 0; i < a.length; i++) {
//            invert += a[i] + "";
//        }
//        if (tam <= 0) {
//            return invert;
//        } else {
//            invert += a[tam];
//            return converte(a, tam - 1);
//        }
//    }
}
