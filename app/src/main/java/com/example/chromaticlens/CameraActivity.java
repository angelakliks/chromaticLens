package com.example.chromaticlens;

import static com.example.chromaticlens.Camera.getCameraInstance;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class CameraActivity extends Activity {

        private Camera mCamera;
        private Camera.CameraPreview mPreview;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);

            // Create an instance of Camera
            mCamera = getCameraInstance();

            // Create our Preview view and set it as the content of our activity.
            mPreview = new CameraPreview(this, mCamera);
            FrameLayout preview = (FrameLayout) findViewById(R.id.camera_preview);
            preview.addView(mPreview);

    }

}
