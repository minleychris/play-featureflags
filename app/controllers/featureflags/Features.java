package controllers.featureflags;

import models.featureflags.Feature;
import play.mvc.Controller;

import java.util.List;

public class Features extends Controller {

    public static void list() {
        List<Feature> features = Feature.findAll();
        render(features);
    }

    public static void flip(Long id) {
        Feature feature = Feature.findById(id);
        feature.enabled = !feature.enabled;
        feature.save();
        list();
    }


}
