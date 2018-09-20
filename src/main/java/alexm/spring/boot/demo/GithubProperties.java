package alexm.spring.boot.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Pattern;

/**
 * @author AlexM
 */

@ConfigurationProperties("github")
@Validated
public class GithubProperties {

    /**
     * Github API token ("user:sampletoken")
     */
    @Pattern(regexp = "\\w+:\\w+")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}