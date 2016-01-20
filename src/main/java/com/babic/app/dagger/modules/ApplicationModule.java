package com.babic.app.dagger.modules;

import com.babic.app.app.Application;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

@Module
public final class ApplicationModule {

    private final Application application;

    public ApplicationModule(final Application application) {
        this.application = application;
    }

    @Provides
    public Application provideApplication() {
        return application;
    }

    @Provides
    public Gson gson() {
        return new Gson();
    }

    @Provides
    @Singleton
    public RestAdapter provideRestAdapter() {
        return new RestAdapter.Builder().setEndpoint("http://google.com").build();
    }

    public interface Exposes {

        Application application();

        Gson gson();

    }

}
