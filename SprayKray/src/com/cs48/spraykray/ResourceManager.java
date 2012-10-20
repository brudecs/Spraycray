package com.cs48.spraykray;

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class ResourceManager {

	//Game mode flags to be used with load() method
	public static final int MENU_MODE = 1001;
	public static final int SCROLL_MODE = 1002;
	public static final int TAG_MODE = 1003;
	
	//Image set flags to be used with getImageSet() method
	public static final int FOO_FORWARD_WALK = 2001;
	public static final int FOO_UP_WALK = 2002;
	public static final int FOO_DOWN_WALK = 2003;
	public static final int BACKGROUND = 2004;
	public static final int TAG_01 = 2005;
	public static final int TAG_02 = 2006;
	public static final int TAG_03 = 2007;
	public static final int TAG_04 = 2008;
	public static final int TAG_05 = 2009;
	public static final int TAG_06 = 2010;
	
	
	//Image sets
	private ArrayList<Bitmap> foo_forward_walk_image_set;
	private ArrayList<Bitmap> foo_up_walk_image_set;
	private ArrayList<Bitmap> foo_down_walk_image_set;
	private ArrayList<Bitmap> background_image_set;
	private ArrayList<Bitmap> tag01_image_set;
	private ArrayList<Bitmap> tag02_image_set;
	private ArrayList<Bitmap> tag03_image_set;
	private ArrayList<Bitmap> tag04_image_set;
	private ArrayList<Bitmap> tag05_image_set;
	private ArrayList<Bitmap> tag06_image_set;
	
	
	//Images
	private Bitmap foo_forward_walk_image_01;
	private Bitmap foo_forward_walk_image_02;
	private Bitmap foo_forward_walk_image_03;
	private Bitmap foo_forward_walk_image_04;
	private Bitmap foo_forward_walk_image_05;
	private Bitmap foo_forward_walk_image_06;
	private Bitmap foo_forward_walk_image_07;
	private Bitmap foo_forward_walk_image_08;
	private Bitmap foo_forward_walk_image_09;
	private Bitmap foo_forward_walk_image_10;
	private Bitmap foo_forward_walk_image_11;
	private Bitmap foo_forward_walk_image_12;
	private Bitmap foo_forward_walk_image_13;
	private Bitmap foo_forward_walk_image_14;
	private Bitmap foo_forward_walk_image_15;
	private Bitmap foo_forward_walk_image_16;
	private Bitmap foo_forward_walk_image_17;
	private Bitmap foo_forward_walk_image_18;
	private Bitmap foo_forward_walk_image_19;
	private Bitmap foo_forward_walk_image_20;
	private Bitmap foo_forward_walk_image_21;
	private Bitmap foo_forward_walk_image_22;
	private Bitmap foo_forward_walk_image_23;
	private Bitmap foo_forward_walk_image_24;
	
	
	//Constructor
	ResourceManager(){
		
		
		
	}
	
	
	/**
	 * This method loads and instantiates a single resource set. The set is
	 * specified by an flag constant int.
	 * 
	 * @param flag - flag indicating resource set to load and instantiate
	 * @return boolean returns true if load sucessful, else returns false
	 */
	boolean load(Context context, int flag){
		switch(flag){
		case 1001:
			initializeMenuObjects(context);
			return true;
		case 1002:
			initializeScrollObjects(context);
			return true;
		case 1003:
			initializeTagObjects(context);
			return true;
	    default:
	    	return false;	
		}		
	}
	
	/**
	 * This method returns an ArrayList of Bitmap objects. Image sets can be
	 * source images for a single animation or a group of like images. The
	 * image set to be returned is selected by passing in the appropriate flag
	 * value. See list of flags for this class.
	 * 
	 * @param flag constant denoting the image set to be returned.
	 * @return ArrayList<Bitmap>
	 */
	ArrayList<Bitmap> getImageSet(int flag){
		switch(flag){
		case 2001:
			return foo_forward_walk_image_set;
		case 2002:
			return foo_up_walk_image_set;
		case 2003:
			return foo_down_walk_image_set;
		case 2004:
			return background_image_set;
		case 2005:
			return tag01_image_set;
		case 2006:
			return tag02_image_set;
		case 2007:
			return tag03_image_set;
		case 2008:
			return tag04_image_set;
		case 2009:
			return tag05_image_set;
		case 2010:
			return tag06_image_set;
		default:
			return null;
		}	
	}
	
	private void initializeMenuObjects(Context context){
		
		
		
	}
	
	private void initializeScrollObjects(Context context){
		foo_forward_walk_image_01 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0001);
		foo_forward_walk_image_02 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0002);
		foo_forward_walk_image_03 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0003);
		foo_forward_walk_image_04 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0004);
		foo_forward_walk_image_05 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0005);
		foo_forward_walk_image_06 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0006);
		foo_forward_walk_image_07 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0007);
		foo_forward_walk_image_08 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0008);
		foo_forward_walk_image_09 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0009);
		foo_forward_walk_image_10 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0010);
		foo_forward_walk_image_11 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0011);
		foo_forward_walk_image_12 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0012);
		foo_forward_walk_image_13 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0013);
		foo_forward_walk_image_14 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0014);
		foo_forward_walk_image_15 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0015);
		foo_forward_walk_image_16 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0016);
		foo_forward_walk_image_17 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0017);
		foo_forward_walk_image_18 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0018);
		foo_forward_walk_image_19 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0019);
		foo_forward_walk_image_20 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0020);
		foo_forward_walk_image_21 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0021);
		foo_forward_walk_image_22 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0022);
		foo_forward_walk_image_23 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0023);
		foo_forward_walk_image_24 = BitmapFactory.decodeResource(context.getResources(), R.drawable.foo_walk_forward0024);

		foo_forward_walk_image_set = new ArrayList<Bitmap>(24);
		foo_forward_walk_image_set.add(0, foo_forward_walk_image_01);
		foo_forward_walk_image_set.add(1, foo_forward_walk_image_02);
		foo_forward_walk_image_set.add(2, foo_forward_walk_image_03);
		foo_forward_walk_image_set.add(3, foo_forward_walk_image_04);
		foo_forward_walk_image_set.add(4, foo_forward_walk_image_05);
		foo_forward_walk_image_set.add(5, foo_forward_walk_image_06);
		foo_forward_walk_image_set.add(6, foo_forward_walk_image_07);
		foo_forward_walk_image_set.add(7, foo_forward_walk_image_08);
		foo_forward_walk_image_set.add(8, foo_forward_walk_image_09);
		foo_forward_walk_image_set.add(9, foo_forward_walk_image_10);
		foo_forward_walk_image_set.add(10, foo_forward_walk_image_11);
		foo_forward_walk_image_set.add(11, foo_forward_walk_image_12);
		foo_forward_walk_image_set.add(12, foo_forward_walk_image_13);
		foo_forward_walk_image_set.add(13, foo_forward_walk_image_14);
		foo_forward_walk_image_set.add(14, foo_forward_walk_image_15);
		foo_forward_walk_image_set.add(15, foo_forward_walk_image_16);
		foo_forward_walk_image_set.add(16, foo_forward_walk_image_17);
		foo_forward_walk_image_set.add(17, foo_forward_walk_image_18);
		foo_forward_walk_image_set.add(18, foo_forward_walk_image_19);
		foo_forward_walk_image_set.add(19, foo_forward_walk_image_20);
		foo_forward_walk_image_set.add(20, foo_forward_walk_image_21);
		foo_forward_walk_image_set.add(21, foo_forward_walk_image_22);
		foo_forward_walk_image_set.add(22, foo_forward_walk_image_23);
		foo_forward_walk_image_set.add(23, foo_forward_walk_image_24);
		
	}
	
	private void initializeTagObjects(Context context){
		
		
		
	}
	
}
