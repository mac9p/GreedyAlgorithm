package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double liczba;
        List<Double> listaSkladnikow = new LinkedList<>();
        liczba = scanner.nextInt();

        metodazachlanna(liczba,listaSkladnikow);
        System.out.println(listaSkladnikow);

    }

    private static void metodazachlanna(double liczba,List<Double> lista) {
        if (Math.sqrt(liczba)%1==0){
            lista.add(Math.sqrt(liczba));
            return;
        }
        double a = (int)Math.sqrt(liczba);
        while (liczba > 0) {
            if (a*a<=liczba){
                liczba -= a*a;
                lista.add(a);
            }else
                a--;
            }
    }
    }
