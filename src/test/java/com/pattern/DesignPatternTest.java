package com.pattern;

import org.junit.Assert;
import org.junit.Test;

import com.pattern.abstactfactory.SendMailFactory;
import com.pattern.builder.Builder;
import com.pattern.factory.SendFactory;
import com.pattern.model.Provider;
import com.pattern.model.Sender;
import com.pattern.prototype.Prototype;
import com.pattern.singleton.Singleton;

/**
 * Created by yanzishang on 05/09/2017.
 */
public class DesignPatternTest {

    /**
     * 工厂模式测试
     */
    @Test
    public void factoryTest() {
        String className = "mail";
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.getInstance(className);
        sender.send();
    }

    /**
     * 多个工厂方法测试
     */
    @Test
    public void multiFactoryTest() {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produceSms();
        sender.send();
    }

    /**
     * 静态工厂方法测试
     */
    @Test
    public void staticFactoryTest() {
        Sender sender = SendFactory.mail();
        sender.send();
    }

    /**
     * 抽象工厂模式测试
     */
    @Test
    public void abstractFactoryTest() {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }

    /**
     * 单例模式测试
     */
    @Test
    public void singletonTest() {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        Assert.assertTrue(singleton1.equals(singleton2));
    }

    /**
     * 建造者模式测试
     */
    @Test
    public void builderTest() {
        int count = 10;
        Builder builder = new Builder();
        builder.produceMailSender(count);
        Assert.assertTrue(count == builder.getListSize());
    }

    /**
     * 原型模式测试
     */
    @Test
    public void prototypeTest() {
        Prototype prototype = new Prototype();
        prototype.setType("prototype");
        Prototype clonePrototype = (Prototype) prototype.clone();
        Assert.assertTrue(prototype.getType().equals(clonePrototype.getType()));
    }

}
