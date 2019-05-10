package com.fisnail;

import com.google.common.eventbus.Subscribe;

public class Teacher {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void observerGPer(Object object) {
        GPer gper = (GPer) object;
        System.out.println("尊敬的" + this.name + ",您有一个新问题待解答:来源-" + gper.getName() + ",提问人:" + gper.getQuestion().getAskUser() + ",提问内容:" + gper.getQuestion().getAskContent());
    }
}
