package adudecalledleo.javachecker;

import javax.swing.*;

public final class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ignored) { }

        JOptionPane.showMessageDialog(null,
                "Seems like your Java Runtime Environment (JRE) is installed correctly!",
                "Hello from Java!", JOptionPane.INFORMATION_MESSAGE);
    }
}
