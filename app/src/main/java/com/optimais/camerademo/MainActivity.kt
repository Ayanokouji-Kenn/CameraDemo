package com.optimais.camerademo

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Camera
import android.hardware.camera2.CameraManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.service.media.CameraPrewarmService
import android.support.v4.content.ContextCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED) {
            val cameraService = getSystemService(Context.CAMERA_SERVICE) as CameraManager
            val cameraIdList = cameraService.cameraIdList
            val cameraCharacteristics = cameraService.getCameraCharacteristics(cameraIdList.first())

        }
    }
}
