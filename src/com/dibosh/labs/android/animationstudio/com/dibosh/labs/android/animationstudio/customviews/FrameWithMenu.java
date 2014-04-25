package com.dibosh.labs.android.animationstudio.com.dibosh.labs.android.animationstudio.customviews;

import javax.swing.*;

/**
 * Created by sankalpo on 4/23/14.
 */
public class FrameWithMenu extends JFrame{
    JMenuBar menuBar;
    public FrameWithMenu(String title){
        super(title);
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
    }
}
