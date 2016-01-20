package com.babic.app.dagger.components;

import com.babic.app.dagger.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent extends ApplicationComponentInjects, ApplicationComponentExposes {

}
