package projectPSC;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import projectPSC.resources.getInformation;

public class projectPSCApplication extends Application<projectPSCConfiguration> {

    public static void main(final String[] args) throws Exception {
        new projectPSCApplication().run(args);
    }

    @Override
    public String getName() {
        return "projectPSC";
    }

    @Override
    public void initialize(final Bootstrap<projectPSCConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final projectPSCConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new getInformation());
    }

}
