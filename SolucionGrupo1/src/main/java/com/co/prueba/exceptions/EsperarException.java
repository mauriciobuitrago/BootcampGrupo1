package com.co.prueba.exceptions;

public class EsperarException {

    int espera;

    public EsperarException(int espera) {
        this.espera = espera;
        tiempoError();
    }

    private void tiempoError() {
        try {
            Thread.sleep(espera);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static EsperarException esperarError(int espera) {
        return new EsperarException(espera);
    }
}

