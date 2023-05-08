package enterprises.stardust.xconfig.testimpl.backend;

import enterprises.stardust.xconfig.ServiceFacingConfiguration;
import enterprises.stardust.xconfig.backend.Backend;

import java.util.Collection;

public class PropertiesBackend implements Backend {
    @Override
    public void save(ServiceFacingConfiguration serviceFacingConfiguration) {

    }

    @Override
    public ServiceFacingConfiguration load(String s) {
        return null;
    }

    @Override
    public void loadAll() {

    }

    @Override
    public Collection<ServiceFacingConfiguration> all() {
        return null;
    }
}
