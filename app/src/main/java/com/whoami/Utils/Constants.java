package com.whoami.Utils;

import android.os.Environment;

/**
 * Created by akshay on 1/1/18.
 */

public class Constants {
    public final static int PICK_IMAGE_GALLERY = 201;
    public final static int TAKE_IMAGE = 202;
    public final static int REQUEST_CAMERA_PERMISSION = 101;
    public final static int START_ADD_ACTIVITY = 102;
    public final static int QUALITY = 75; // For images Bitmaps
    public final static String image_download_dir= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) +"/image.jpg";
    public final static String person_group_id = "mnc-person-group-id";
    public final static String face_list_id = "iitbhu-facelistid";
    public final static String FACE = "face";
    public final static String FILE_URI = "file_uri";

}
