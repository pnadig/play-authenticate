import static org.fest.assertions.Assertions.assertThat;

import java.util.Map;

import com.feth.play.module.pa.PlayAuthenticate;
import com.feth.play.module.pa.providers.oauth2.facebook.FacebookAuthProvider;

public class FacebookOAuth2PopupTest extends FacebookOAuth2Test {

    protected void amendConfiguration(final Map<String, String> additionalConfiguration) {
        super.amendConfiguration(additionalConfiguration);
        additionalConfiguration.put(constructSettingKey(FacebookAuthProvider.SettingKeys.DISPLAY), "popup");
    }

    @Override
    protected void checkLoginLayout() {
        assertThat(browser.find("[name='display']").getValue()).isEqualTo("popup");
    }
}
