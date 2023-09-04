package com.techmania.implementingtopappbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {

    MaterialToolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);

        toolbar.setOverflowIcon(AppCompatResources.getDrawable(this,R.drawable.baseline_more_vert_24));

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Navigation icon is clicked",Toast.LENGTH_SHORT).show();

            }
        });

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId() == R.id.share){
                    Toast.makeText(getApplicationContext(),"Share icon is clicked",Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.edit){
                    Toast.makeText(getApplicationContext(),"Edit icon is clicked",Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.settings){
                    Toast.makeText(getApplicationContext(),"Settings is clicked",Toast.LENGTH_SHORT).show();
                }else if (item.getItemId() == R.id.signOut){
                    Toast.makeText(getApplicationContext(),"Sign out is clicked",Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });

    }
}