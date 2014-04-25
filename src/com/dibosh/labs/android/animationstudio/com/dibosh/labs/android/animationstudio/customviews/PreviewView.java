package com.dibosh.labs.android.animationstudio.com.dibosh.labs.android.animationstudio.customviews;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: abdul munim dibosh
 * Date: 4/19/14
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class PreviewView extends JPanel {

    private BufferedImage img;
    private Rectangle portrait_device;
    private Rectangle landscape_device;
    private Rectangle orientation_button;

    private Rectangle object;
    Dimension window_size = new Dimension(600,600);
    int round_arc_dim = 3;
    boolean isPortraitMode = true;
    public PreviewView(){
//        initImage();
        portrait_device = new Rectangle(320,480);
        landscape_device = new Rectangle(480,320);

        portrait_device.x = (int)(window_size.getWidth()/2 - portrait_device.getWidth()/2);
        portrait_device.y = (int)(window_size.getHeight()/2 - portrait_device.getHeight()/2);

        landscape_device.x = (int)(window_size.getWidth()/2 - landscape_device.getWidth()/2);
        landscape_device.y = (int)(window_size.getHeight()/2 - landscape_device.getHeight()/2);

        object = new Rectangle(0,0,32,32);

        orientation_button = new Rectangle(window_size.width-50,window_size.height-50,100,32);

        setMinimumSize(window_size);
        setPreferredSize(window_size);
        setSize(window_size);

    }


    public String getDimTitle(){
        if(isPortraitMode)return "Preview(320*480)";
        else return "Preview(480*320)";
    }

    private void initImage() {
        try {
            BufferedInputStream bis = new BufferedInputStream(getClass().getResourceAsStream("/mobile.png"));
            img= ImageIO.read(bis);
            Dimension size = new Dimension(img.getWidth(), img.getHeight());
            setPreferredSize(size);
            setMinimumSize(size);
            setMaximumSize(size);
            setSize(size);
            setLayout(null);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.drawImage(img,0,0,null);
        g.setColor(Color.lightGray);
        if(isPortraitMode){
            g.drawRoundRect(portrait_device.x, portrait_device.y, portrait_device.width, portrait_device.height, round_arc_dim, round_arc_dim);
            object.x = (int)(portrait_device.x+portrait_device.getWidth()/2-object.getWidth()/2);
            object.y = (int)(portrait_device.y+portrait_device.getHeight()/2-object.getHeight()/2);
        }else{
            g.drawRoundRect(landscape_device.x, landscape_device.y, landscape_device.width, landscape_device.height, round_arc_dim, round_arc_dim);
            object.x = (int)(landscape_device.x+landscape_device.getWidth()/2-object.getWidth()/2);
            object.y = (int)(landscape_device.x+landscape_device.getHeight()/2-object.getHeight()/2);
        }

        g.setColor(Color.red);
        g.fillRect(object.x,object.y,object.width,object.height);

    }

}
