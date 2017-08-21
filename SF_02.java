import javax.swing.*;
import java.awt.*;

public class SF_02 {
    private JFrame frame;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        System.out.print("I rule everything!/n");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SF_02 window = new SF_02();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /**
     * Create the application.
     */
    public SF_02() {
        initialize();
    }
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox comboBox = new JComboBox();
        frame.getContentPane().add(comboBox, BorderLayout.CENTER);
    }

}
