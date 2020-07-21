package social.bitbucket;

import org.keycloak.broker.oidc.OAuth2IdentityProviderConfig;
import org.keycloak.broker.provider.AbstractIdentityProviderFactory;
import org.keycloak.broker.social.SocialIdentityProviderFactory;
import org.keycloak.models.IdentityProviderModel;
import org.keycloak.models.KeycloakSession;

public class BitbucketIdentityProviderFactory extends AbstractIdentityProviderFactory<BitbucketIdentityProvider> implements SocialIdentityProviderFactory<BitbucketIdentityProvider> {

    public static final String PROVIDER_ID = "bitbucket-server";

    @Override
    public String getName() {
        return "BitBucket Server";
    }

    @Override
    public BitbucketIdentityProvider create(KeycloakSession session, IdentityProviderModel model) {
        return new BitbucketIdentityProvider(session, new OAuth2IdentityProviderConfig(model));
    }

    @Override
    public OAuth2IdentityProviderConfig createConfig() {
        return new OAuth2IdentityProviderConfig();
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }
}
