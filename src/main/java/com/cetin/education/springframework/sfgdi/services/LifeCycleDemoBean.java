package com.cetin.education.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author mehmetali.cetin
 * @Date 2022-06-30
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm in the LifeCycleBean Constructor.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The lifecycle has its properties set!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The LifeCycleBean has been terminated");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("## My bean name is "+name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## BeanFactory has been set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The @PostConstruct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The @PreDestroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
