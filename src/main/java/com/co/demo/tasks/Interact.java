package com.co.demo.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.devtools.idealized.Javascript;

import static com.co.demo.userinterfaces.DemoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Interact implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    WaitUntil.the(TXT_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(TXT_FIELD)
                    );
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static Interact on() {
        return Instrumented.instanceOf(Interact.class).withProperties();
    }
}
