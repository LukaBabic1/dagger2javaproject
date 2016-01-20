package com.babic.app.dagger;

import com.babic.app.app.Application;
import com.babic.app.dagger.components.ApplicationComponent;
import com.babic.app.dagger.components.DaggerApplicationComponent;
import com.babic.app.dagger.modules.ApplicationModule;

public final class ComponentFactory {

    private ComponentFactory() {
        throw new AssertionError("Can't create instances of ComponentFactory");
    }

    public static ApplicationComponent createMainComponent(final Application application) {
        return DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(application)).build();
    }

}
