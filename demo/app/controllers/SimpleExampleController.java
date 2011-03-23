package controllers;

import featureflags.Feature;
import play.mvc.Controller;

public class SimpleExampleController extends Controller {

    @Feature("simpleExample")
    public static void showPage() {
        String featureName = "simpleExample";
        render("featureEnabled.html", featureName);
    }
}
