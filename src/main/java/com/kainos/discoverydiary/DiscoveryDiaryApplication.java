package com.kainos.discoverydiary;

import com.kainos.discoverydiary.config.DiscoveryDiaryConfiguration;
import com.kainos.discoverydiary.resources.BookResource;
import com.kainos.discoverydiary.resources.HomeResource;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;

public class DiscoveryDiaryApplication extends Application<DiscoveryDiaryConfiguration> {
    @Override
    public void initialize(Bootstrap<DiscoveryDiaryConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<DiscoveryDiaryConfiguration>());
        bootstrap.addBundle(new AssetsBundle("/assets", "/assets"));
        bootstrap.addBundle(new MultiPartBundle());
    }

    public void run(DiscoveryDiaryConfiguration discoveryDiaryConfiguration, Environment environment) throws Exception {
        final HomeResource homeResource = new HomeResource();
        final BookResource bookResource = new BookResource(new BookDataStore());

        environment.jersey().register(homeResource);
        environment.jersey().register(bookResource);
    }

    public static void main(String[] args) throws Exception {
        new DiscoveryDiaryApplication().run(args);
    }
}
