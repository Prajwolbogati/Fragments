package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragments.fragments.Firstfragment;
import com.example.fragments.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
    private Button btnfragment;
    private Boolean status = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfragment = findViewById(R.id.btnfragment);


        btnfragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                if (status){
                    Firstfragment firstfragment = new Firstfragment();
                    fragmentTransaction.replace(R.id.fragmentcontainer,firstfragment);
                    fragmentTransaction.commit();
                    btnfragment.setText("Load second fragment");
                    status = false;
                } else {
                    SecondFragment secondFragment = new SecondFragment();
                    fragmentTransaction.replace(R.id.fragmentcontainer,secondFragment);
                    fragmentTransaction.commit();
                    btnfragment.setText("Load first fragment");
                    status = true;
                }
            }
        });
    }
}
