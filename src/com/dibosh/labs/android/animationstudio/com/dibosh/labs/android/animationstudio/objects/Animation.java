package com.dibosh.labs.android.animationstudio.com.dibosh.labs.android.animationstudio.objects;

/**
 * Created by sankalpo on 4/23/14.
 */
public class Animation {
    /**The following part will be needed in later versions**/
    public static String VAL_INT="intType";
    public static String VAL_FLOAT="floatType";
    /**Denotes the interpolation/changing value type:int/float**/
    String valueType;
    /*********************/

    public final static int RESTART = 1;
    public final static int REVERSE = 2;


    /**The duration of the animation[milliseconds]**/
    int duration;
    /**The time should be elapsed before the animation starts actually[milliseconds]**/
    int startOffset;
    /**How many times the animation should be repeated**/
    int repeat_count;
    /**RESTART/REVERSE**/
    int repeat_mode;

}
