package enterprises.stardust.xconfig.testimpl;

import enterprises.stardust.xconfig.frontend.Frontend;
import enterprises.stardust.xconfig.testimpl.frontend.SwingFrontend;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Configuration configuration = Configuration.load(
                Paths.get("configuration.properties")
        );

        new SwingFrontend(configuration);
    }
}
