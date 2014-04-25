package com.dibosh.labs.android.animationstudio.com.dibosh.labs.android.animationstudio.windows;

import com.dibosh.labs.android.animationstudio.com.dibosh.labs.android.animationstudio.customviews.PreviewView;
import com.dibosh.labs.android.animationstudio.com.dibosh.labs.android.animationstudio.utilities.Helpers;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by sankalpo on 4/20/14.
 */
public class MainWindow {
    private JPanel container;
    private JPanel rightPane;
    private JPanel leftPane;
    private JTree outlineTree;
    private JScrollPane previewPane;

    Dimension size;
    Dimension minSize;

    public MainWindow(){
        size = Helpers.getPreferrableWindowSize();
        int width = size.width;
        int height = size.height;
        int minHeight = height/2;
        float aspect_ratio = width/height*1.0f;
        minSize = new Dimension((int)(minHeight*aspect_ratio),minHeight);
        container.setPreferredSize(size);
        container.setSize(size);
        container.setMinimumSize(minSize);

        PreviewView previewView = new PreviewView();
        previewPane.setMaximumSize(previewView.getMaximumSize());
        previewPane.setViewportView(previewView);
        previewPane.setBorder(new TitledBorder(previewView.getDimTitle()));
    }

    public  JPanel getContentPane(){

        return container;
    }
}
