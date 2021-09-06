package adudecalledleo.javachecker;

import javax.swing.*;

public final class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ignored) { }

        String arch = System.getProperty("os.arch");
        String version = System.getProperty("java.version");
        String vendor = System.getProperty("java.vendor");

        JOptionPane.showMessageDialog(null,
                "Seems like your Java Runtime Environment (JRE) is installed correctly!\n" +
                        "Architecture: " + arch + "\n" +
                        "Version: " + version + "\n" +
                        "Vendor: " + vendor,
                "Hello from Java!", JOptionPane.INFORMATION_MESSAGE);
    }
}
