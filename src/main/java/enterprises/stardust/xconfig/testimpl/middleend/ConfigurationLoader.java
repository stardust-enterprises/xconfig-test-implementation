package enterprises.stardust.xconfig.testimpl.middleend;

import enterprises.stardust.xconfig.middleend.Node;
import enterprises.stardust.xconfig.testimpl.Configuration;
import enterprises.stardust.xconfig.testimpl.middleend.annotation.*;
import enterprises.stardust.xconfig.testimpl.middleend.annotation.Number;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ConfigurationLoader {
    private static Collection<Node> createNodeGraph(Class<?> configurationClass) {
        List<Node> nodes = new ArrayList<>();
        for (Field field : configurationClass.getFields()) {
            if (Modifier.isTransient(field.getModifiers())) {
                continue;
            }

            // create Node
            if (field.isAnnotationPresent(Text.class)) {
                // TODO
            } else if (field.isAnnotationPresent(Checkbox.class)) {
                // TODO
            } else if (field.isAnnotationPresent(Number.class)) {
                // TODO
            } else if (field.isAnnotationPresent(Decimal.class)) {
            } else {
                throw new IllegalStateException("Unknown annotation on field " + field);
            }
        }
        return nodes;
    }

    public static <T> T load(InputStream stream, Class<T> configurationClass) {
    }

    public static void save(Configuration configuration, OutputStream newOutputStream) {
    }
}
