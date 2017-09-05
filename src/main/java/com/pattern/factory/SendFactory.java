package com.pattern.factory;

import com.pattern.model.MailSender;
import com.pattern.model.Sender;
import com.pattern.model.SmsSender;

/**
 * 工厂模式
 */
public class SendFactory {

    /**
     * 工厂模式方法
     * 
     * @param className 类名
     * @return 具体的对象
     */
    public Sender getInstance(String className) {
        if ("sms".equals(className)) {
            return new SmsSender();
        } else if ("mail".equals(className)) {
            return new MailSender();
        } else {
            System.out.println("请输入正确的类名");
            return null;
        }
    }

    /**
     * 多个工厂方法
     * 
     * @return MailSender对象
     */
    public Sender produceMail() {
        return new MailSender();
    }

    /**
     * 多个工厂方法
     * 
     * @return SmsSender对象
     */
    public Sender produceSms() {
        return new SmsSender();
    }

    /**
     * 静态工厂,只是将上面的两个方法设为静态的
     * @return MailSender对象
     */
    public static Sender mail() {
        return new MailSender();
    }

    /**
     * 静态工厂,只是将上面的两个方法设为静态的
     * @return SmsSender对象
     */
    public static Sender sms() {
        return new SmsSender();
    }

}
