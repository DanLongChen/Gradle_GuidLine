package com.chiron;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.chiron.mylibrary.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person person = new Person();
    }
}