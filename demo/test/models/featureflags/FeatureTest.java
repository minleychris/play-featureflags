package models.featureflags;

import org.junit.Test;
import play.test.UnitTest;

public class FeatureTest extends UnitTest {

    @Test
    public void newFeatureIsDisabledByDefault() {
        Feature feature = new Feature("someFeatureName");
        assertFalse(feature.enabled);
    }
    
}
