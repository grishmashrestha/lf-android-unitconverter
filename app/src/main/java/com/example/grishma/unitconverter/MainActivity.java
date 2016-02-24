package com.example.grishma.unitconverter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar) Toolbar toolbar;
    @Bind(R.id.viewpager) ViewPager viewPager;
    @Bind(R.id.sliding_tabs) TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        viewPager.setAdapter(new MainMenuFragmentAdapter(getSupportFragmentManager(),
                MainActivity.this));

        tabLayout.setupWithViewPager(viewPager);
    }

    public void redirectToConversionActivity(View view) {
        TextView tv = (TextView) view.findViewById(R.id.tv_name);
        String selectedConversion = (String) tv.getText();
        Toast.makeText(MainActivity.this, selectedConversion, Toast.LENGTH_SHORT).show();

        switch (selectedConversion) {
            case "Temperature":
                break;
            case "Weight":
                break;
            case "Length":
                break;
            case "Time":
                break;
            default:
                break;
        }

    }
}
