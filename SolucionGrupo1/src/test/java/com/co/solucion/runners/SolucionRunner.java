package com.co.solucion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/solucion.feature",
        glue = "com.co.solucion.stepsdefinitions",
        snippets = SnippetType.CAMELCASE)
public class SolucionRunner {
}
