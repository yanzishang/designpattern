package com.pattern.abstactfactory;

import com.pattern.model.MailSender;
import com.pattern.model.Provider;
import com.pattern.model.Sender;

/**
 * Created by yanzishang on 05/09/2017.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
