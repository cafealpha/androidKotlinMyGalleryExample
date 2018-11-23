package com.example.hi.mygallery

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getAllPhotos() {
        //모든 사진 정보 가져오기
        var cursor = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
            null,
            null,
            null,
            MediaStore.Images.ImageColumns.DATE_TAKEN + " DESC")
    }


}


