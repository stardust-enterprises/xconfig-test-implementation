package enterprises.stardust.xconfig.testimpl;

import enterprises.stardust.xconfig.testimpl.middleend.ConfigurationLoader;
import enterprises.stardust.xconfig.testimpl.middleend.annotation.Checkbox;
import enterprises.stardust.xconfig.testimpl.middleend.annotation.Decimal;
import enterprises.stardust.xconfig.testimpl.middleend.annotation.Number;
import enterprises.stardust.xconfig.testimpl.middleend.annotation.Text;
import lombok.*;

import java.awt.Color;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public @Data class Configuration {
    @Text
    private String message;
    @Number(min = 0, max = 100)
    private int number;
    @Decimal(min = 0, max = 1, step = 0.01f)
    private float decimal;
    @Checkbox
    private boolean flag;

//    private Color color;
//    private String[] array;
//    private List<String> list;
//    private Map<String, String> map;
//    private CompositeObject compositeObject;
//    private Type type;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    transient Path saveTo;

    @SneakyThrows
    public static Configuration load(Path path) {
        Configuration configuration = ConfigurationLoader.load(Files.newInputStream(path), Configuration.class);
        assert configuration != null;

        configuration.saveTo = path;
        return configuration;
    }

    @SneakyThrows
    public void save() {
        ConfigurationLoader.save(this, Files.newOutputStream(saveTo));
    }

//    static @Data class CompositeObject {
//        private final int number;
//        private final String message;
//    }

//    enum Type {
//        ONE, TWO, THREE
//    }
}
