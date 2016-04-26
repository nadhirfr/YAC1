package com.example.fachrul.yac1;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;
    String[] No_anggota;
    String[] Nama;
    String[] Umur;
    int [] Foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_main);
        No_anggota = new String[] {"1","2","3","4","5","6","7","8","9","10"};

        Nama = new String[] {"China","India","United States","Indonesia","Brazil", "Pakistan","Nigeria","Bangladesh",
                             "Rusia","Japan"};
        Umur = new String[] {"10 tahun", "20 tahun", "30 tahun","4 tahun","79 tahun", "9 tahun","8 tahun",
                             "90 tahun", "12 tahun","90 tahun"};
        Foto = new int[] {R.drawable.china, R.drawable.india, R.drawable.unitedstates,R.drawable.indonesia,
                          R.drawable.brazil, R.drawable.pakistan, R.drawable.nigeria, R.drawable.bangladesh,
                          R.drawable.russia, R.drawable.japan};
        viewPager = (ViewPager) findViewById(R.id.pager);
        adapter = new ViewPagerAdapter(MainActivity.this, No_anggota,Nama,Umur,Foto);
        viewPager.setAdapter(adapter);
    }

}
