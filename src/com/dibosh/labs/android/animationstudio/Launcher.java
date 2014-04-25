package com.dibosh.labs.android.animationstudio;

import com.dibosh.labs.android.animationstudio.com.dibosh.labs.android.animationstudio.customviews.FrameWithMenu;
import com.dibosh.labs.android.animationstudio.com.dibosh.labs.android.animationstudio.windows.MainWindow;
import org.pushingpixels.substance.api.skin.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by sankalpo on 4/20/14.
 */
public class Launcher {

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new SubstanceGraphiteLookAndFeel());
                } catch (Exception e) {
                    System.out.println("Substance Graphite failed to initialize");
                }

                JMenu fileMenu = new JMenu("File");
                fileMenu.setMnemonic('F');

                JMenuItem exitCommand = new JMenuItem("Exit");
                exitCommand.setMnemonic('E');
                exitCommand.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });

                fileMenu.add(exitCommand);

                JFrame frame = new JFrame("Andronimator™");
                frame.setContentPane(new MainWindow().getContentPane());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();

//                frame.getJMenuBar().add(fileMenu);

                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });

    }
}
