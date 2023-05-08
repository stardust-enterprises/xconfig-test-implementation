package enterprises.stardust.xconfig.testimpl.middleend;

import enterprises.stardust.xconfig.ServiceFacingConfiguration;
import enterprises.stardust.xconfig.middleend.MiddleEnd;
import enterprises.stardust.xconfig.middleend.Node;

import java.util.Collection;

public enum AnnotationsBasedMiddleEnd implements MiddleEnd {
    INSTANCE;

    @Override
    public Collection<Node> getNodes(ServiceFacingConfiguration serviceFacingConfiguration) {
        return null;
    }
}
