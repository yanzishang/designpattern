package com.pattern.abstactfactory;

import com.pattern.model.Provider;
import com.pattern.model.Sender;
import com.pattern.model.SmsSender;

/**
 * Created by yanzishang on 05/09/2017.
 */
public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
