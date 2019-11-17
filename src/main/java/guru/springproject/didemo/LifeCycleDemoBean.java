package guru.springproject.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean set in the factory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name set:"+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties set in bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Bean set in application context");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construction of the bean");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre destroy method of the bean");
    }

    void beforeInit() {
        System.out.println("Before initialisation of the bean");
    }

    void afterInit() {
        System.out.println("After initialisation of the bean");
    }
}
