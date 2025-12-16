package com.lab1.laboratorio1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Random;

public class Juego {
    @GetMapping(value="/jugar")
    public String jugar(@RequestParam("fila1") Integer fila1,
                        @RequestParam("columna1") Integer columna1,
                        @RequestParam("fila2") Integer fila2,
                        @RequestParam("columna2") Integer columna2) {

        char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        Random random = new Random();

        int indiceAleatorio = random.nextInt(letras.length);
        char letraAleatoria = letras[indiceAleatorio];

        ArrayList<ArrayList<String>> matriz = new ArrayList<>();


        int filas = matriz.toArray().length;
        int columnas = matriz.size()/filas;

        for(int i = 0; i < filas; i++){

            ArrayList<String> elementos_i = new ArrayList<>();
            ArrayList<String> elementos_j = new ArrayList<>();

            for(int j = 0; j < columnas; j++){
                ArrayList<String> elementos_k = new ArrayList<>();
                elementos_k.add(String.valueOf(letraAleatoria));
                elementos_j = elementos_k;
            }

            elementos_i.add(String.valueOf(elementos_j));

            matriz.add(elementos_i);
        }

        return "redirect:pupiletras/jugar";
    }
}
