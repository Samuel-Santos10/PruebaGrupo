package com.ugb.pruebagrupo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tbhConversor = (TabHost)findViewById(R.id.tbhConversores);
        tbhConversor.setup();

        tbhConversor.addTab(tbhConversor.newTabSpec("Monedas").setContent(R.id.tabMoneda).setIndicator("MONEDAS"));



    }
}