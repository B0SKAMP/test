import java.nio.file.Path;

/**
 * some nonsense here
 */
public class Main {

    /**
     * this will run the analysis
     * @param args config path
     */
    public static void main(String[] args) {
        if(args.length != 1) {
            System.err.println("one arg needed: the job folder");
            System.exit(1);
        }
        String token = System.getenv("FDP_LOCAL_TOKEN");
        if(token == null) {
            System.err.println("need FDP_LOCAL_TOKEN environment variable.");
            System.exit(2);
        }
        Path jobdir = Path.of(args[0]);
        Path config = jobdir.resolve("config.yaml");
        Path script = jobdir.resolve("script.sh");

        Analysis a = new Analysis();
        a.run(config, script, token);
    }

}
