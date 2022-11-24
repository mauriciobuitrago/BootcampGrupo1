package com.co.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SolucionPage {
    public static final Target TXT_INPUT = Target.the("campo para escrbir")
            .locatedBy("//input[@id='my-text-id']");

    public static final Target TXT_PASSWORD = Target.the("Campo para escribir la contaseña")
            .locatedBy("//input[@type='password']");

    public static final Target TXT_TAREA = Target.the("Campo para escribir Tarea")
            .locatedBy("//textarea[@name='my-textarea']");

    public static final Target TXT_DISABLED = Target.the("Campo Disabled")
            .locatedBy("//input[@name='my-disabled']");

    public static final Target BTN_RADIO_BUTON = Target.the("click de radio boton")
            .locatedBy("//input[@id='my-radio-1']");

    public static final Target TXT_READONLY = Target.the("Campo de Readonly ")
            .locatedBy("//input[@name='my-readonly']");

    public static final Target TXT_DROPDOWN = Target.the("Dropdown para seleccion(selec)")
            .locatedBy("//select[@name='my-select']");

    public static final Target TXT_DROPDOWN_DATALIST = Target.the("Dropdown para seleccion(input)")
            .locatedBy("//input[@name='my-datalist']");

    public static final Target TXT_SUBIR_ARCHIVO  = Target.the("campo para  subir archivo")
            .locatedBy("//input[@name='my-file']");

    public static final Target TXT_CHEKED_UNO = Target.the("click para seleccionar checked")
            .locatedBy("//input[@id='my-check-1']");

    public static final Target TXT_CHEKED_DEFAUL = Target.the("click para seleccionar checked default")
            .locatedBy("//input[@id='my-check-2']");

    public static final Target TXT_COLOR = Target.the("click para abrir los colores")
            .locatedBy("//input[@name='my-colors']");

    public static final Target BTN_RADIO_DEFAUL = Target.the("click para boton default")
            .locatedBy("//input[@id='my-radio-2']");

    public static final Target TXT_DATE_PICKER = Target.the("click para seleccionar una fecha")
            .locatedBy("//input[@name='my-date']");

    public static final Target TXT_EXAMPLE = Target.the("click mover el mouse en la barra")
            .locatedBy("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");

    public static final Target TXT_ASERCION = Target.the("Asercion para verificar formulario enviado")
            .locatedBy("//*[text()='Form submitted']");



    public static final Target BTN_ENVIAR = Target.the("click para enviar el proyecto")
            .locatedBy("//button[@type='submit']");
}
