package enterprises.stardust.xconfig.testimpl.frontend;

import enterprises.stardust.xconfig.frontend.Frontend;
import lombok.Data;

import javax.swing.*;

public @Data class SwingFrontend implements Frontend {
    public void show() {
        System.out.println("SwingFrontend.show()");

        JFrame frame = new JFrame("SwingFrontend");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        fill(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private void fill(JPanel panel) {
        System.out.println("SwingFrontend.fill()");

    }
}
