package com.example.kelasbsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.kelasbsqlite.database.DBController;
import com.google.android.material.textfield.TextInputEditText;

public class edit_teman extends AppCompatActivity {
    TextInputEditText Nama, Telepon;
    Button Save;
    String nma, tlp, id;
    DBController controller = new DBController(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_teman);
    }
}