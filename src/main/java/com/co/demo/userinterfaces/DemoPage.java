package com.co.demo.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoPage {

    public static final Target TXT_FIELD = Target.the("").located(By.id("com.example.misionticsemana1:id/relative_radioMasculino"));
    public static final Target BTN_CHANGESELECTOR = Target.the("").locatedBy("//button[@id='Submit']");

}
