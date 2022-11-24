package com.co.prueba.utils;

public class Utilidades {

    private String Url="https://bonigarcia.dev/selenium-webdriver-java/web-form.html";

    public String getUrl() {
        return Url;
    }

    public static Utilidades utils(){
        return new Utilidades();
    }

}
