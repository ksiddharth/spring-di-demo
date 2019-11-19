package guru.springproject.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:spring-custom.properties")
public class GreetingsServiceConfig {
    @Value("${guru.springproject.user}")
    private String user;
    @Value("${guru.springproject.password}")
    private String password;
    @Value("${guru.springproject.url}")
    private String url;

    @Bean
    FakeDataSourceModel fakeDataSourceModel() {
        FakeDataSourceModel fakeDataSourceModel = new FakeDataSourceModel();
        fakeDataSourceModel.setUsername(user);
        fakeDataSourceModel.setPassword(password);
        fakeDataSourceModel.setUrl(url);
        return fakeDataSourceModel;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
