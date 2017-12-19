package com.debam.androidlearning;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Debam on 12/19/17.
 */

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvUsername)TextView tvUsername;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        ButterKnife.bind(MainActivity.this);

        String username = getIntent().getStringExtra("username");

        tvUsername.setText(username);
    }
}
