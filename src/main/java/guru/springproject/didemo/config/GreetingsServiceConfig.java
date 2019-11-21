package guru.springproject.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources (
        {
                @PropertySource("classpath:fakedatasource.properties"),
                @PropertySource("classpath:fakejmssource.properties")
        })
public class GreetingsServiceConfig {
    @Value("${guru.springproject.user}")
    private String user;
    @Value("${guru.springproject.password}")
    private String password;
    @Value("${guru.springproject.url}")
    private String url;
    @Value("${guru.springproject.jms.user}")
    private String jmsUser;
    @Value("${guru.springproject.jms.password}")
    private String jmsPassword;
    @Value("${guru.springproject.jms.url}")
    private String jmsUrl;
    @Autowired
    Environment env;

    @Bean
    FakeDataSourceModel fakeDataSourceModel() {
        FakeDataSourceModel fakeDataSourceModel = new FakeDataSourceModel();
        fakeDataSourceModel.setUsername(env.getProperty("USER"));
        fakeDataSourceModel.setPassword(password);
        fakeDataSourceModel.setUrl(url);
        return fakeDataSourceModel;
    }

    @Bean
    FakeJMSModel fakeJMSModel() {
        FakeJMSModel fakeJMSModel = new FakeJMSModel();
        fakeJMSModel.setPassword(jmsPassword);
        fakeJMSModel.setUrl(jmsUrl);
        fakeJMSModel.setUsername(jmsUser);
        return fakeJMSModel;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
