package com.nhancv.training.di;

import org.greenrobot.eventbus.EventBus;

import dagger.Component;

/**
 * Created by nhancao on 5/29/17.
 */

@AppScope
@Component(modules = AppModule.class)
public interface AppComponent {
    EventBus bus();
}
