import org.fairdatapipeline.api.*;

import java.nio.file.Path;

/**
 * this runs the Coderun for the analysis
 */
public class Analysis {
    /**
     * this method will do the running.
     * @param config the config file
     * @param script the script file
     * @param token the authentication token for the local registry
     */
    void run(Path config, Path script, String token) {
        try(Coderun cr = new Coderun(config, script, token)) {

        }
    }
}
