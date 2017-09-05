package com.pattern.builder;

import java.util.ArrayList;
import java.util.List;

import com.pattern.model.MailSender;
import com.pattern.model.Sender;
import com.pattern.model.SmsSender;

/**
 * 建造者模式
 */
public class Builder {

    private List<Sender> list = new ArrayList<>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }

    public int getListSize() {
        return list.size();
    }
}
