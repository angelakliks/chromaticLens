package com.example.chromaticlens;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.SurfaceHolder;


public class Camera extends Object{
    //checks for camera in device
    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            return true;
        } else {
            return false;
        }
    }

    //instance of the Camera obj
    public static Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }

    private static Camera open() {
        //Fill
        return xCamera;
    }

    public final void release (){
        //Fill
    }


    public void setPreviewDisplay(SurfaceHolder mHolder) {

        //Fill
    }

    public void startPreview() {
        //Fill
    }

    public void stopPreview() {
        //Fill
    }
}
