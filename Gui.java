package SimpleDownloader;


import javax.swing.*;
import java.awt.*;


public class Gui extends JFrame {

    JPanel contentPane;
    JButton buttonDownloader;
    JTextField url;
    JLabel label;

    public Gui(){


        setTitle("Downloader");
        setResizable(false);
        setSize(220, 60);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());


        label = new JLabel("Insert URL");
        contentPane.add(label, BorderLayout.NORTH);

        url = new JTextField(10);
        contentPane.add(url, BorderLayout.CENTER);

        buttonDownloader = new JButton("Download");
        contentPane.add(buttonDownloader, BorderLayout.SOUTH);

        add(contentPane);
        setVisible(true);

    }
}
