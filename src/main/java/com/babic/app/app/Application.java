package com.babic.app.app;

import com.babic.app.dagger.ComponentFactory;
import com.babic.app.dagger.components.ApplicationComponent;
import com.babic.app.dagger.network.SimpleApi;
import com.google.gson.Gson;

import javax.inject.Inject;

import retrofit.RestAdapter;

public class Application {

    private static Application INSTANCE;

    public static void main(String args[]) {
        INSTANCE = new Application();
        INSTANCE.onCreate();
    }

    public static Application getInstance() {
        return INSTANCE;
    }

    private ApplicationComponent applicationComponent;

    @Inject
    protected Gson gson;

    @Inject
    protected RestAdapter restAdapter;

    public void onCreate() {
        daggerInject();
        final SimpleApi simpleApi = restAdapter.create(SimpleApi.class);
    }

    private void daggerInject() {
        applicationComponent = ComponentFactory.createMainComponent(this);
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
