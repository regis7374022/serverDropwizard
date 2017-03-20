package server;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import server.resources.BuyingResource;

/**
 * Created by Рома on 20.03.2017.
 */
public class ServerApplication extends Application<ServerConfiguration> {

    public static void main(String[] args) throws Exception {
        new ServerApplication().run(args);
    }

    public void run(ServerConfiguration configuration, Environment environment) throws Exception {

        final BuyingResource buyingResource = new BuyingResource();
        environment.jersey().register(buyingResource);
    }
}
