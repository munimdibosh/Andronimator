package com.dibosh.labs.android.animationstudio.com.dibosh.labs.android.animationstudio.utilities;

import java.awt.*;

/**
 * Created by sankalpo on 4/24/14.
 */
public class Helpers {

    /**
     * Returns current screen size of the display. In case of multi-display system it returns the
     * screen size for default one.
     * @return
     */
    public static Dimension getEffectiveScreenSize(){
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();
        return new Dimension(width,height);
    }

    /**
     * Returns a preferrable window size for the application
     * @return
     */
    public static Dimension getPreferrableWindowSize(){
        int margin = 100;
        Dimension size = getEffectiveScreenSize();
        float aspect = size.width/(size.height*1.0f);
        int newHeight = size.height-margin;
        int newWidth = (int)(newHeight*aspect);
//        log(Helpers.class,String.format("display width:%d,height:%d :: window width:%d,height:%d :: aspect:%f",size.width,size.height,newWidth,newHeight,aspect));
        return new Dimension(newWidth,newHeight);
    }

    public static void log(Object sender,String log){
        System.out.println("Class:"+sender.getClass().getSimpleName());
        System.out.println("Log:"+log);
    }

}
