package com.jhbli.menu_eunhye;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.jhbli.menu_eunhye.fragments.FragmentAttend;
import com.jhbli.menu_eunhye.fragments.FragmentBus;
import com.jhbli.menu_eunhye.fragments.FragmentCall;
import com.jhbli.menu_eunhye.fragments.FragmentNotice;
import com.jhbli.menu_eunhye.fragments.FragmentSettings;

public class MainActivity extends AppCompatActivity {//implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    static String[] menus = {"등원관리","셔틀버스 조회","센터연결","설정","공지사항"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("골든벨");

        FragmentNotice fragmentNotice = new FragmentNotice();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, fragmentNotice)
                .addToBackStack(null)
                .commit();

        toolbar =(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initNavigationDrawer();
        customAdapter();
    }

    public void initNavigationDrawer(){
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        //navigationView.setNavigationItemSelectedListener(this);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        //서랍을 열고 닫는 기능을 가진 토글 버튼
        //ActionBarDrawerToggle = new ActionBarDrawerToggle(this, 서랍레이아웃, "열기문자", "닫기문자");
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close){
            @Override
            public void onDrawerClosed(View v){
                super.onDrawerClosed(v);
            }

            @Override
            public void onDrawerOpened(View v) {
                super.onDrawerOpened(v);
            }
        };
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    public void customAdapter(){
        ListView navlist = (ListView)findViewById(R.id.list);
        NavigationListAdapter adapter = new NavigationListAdapter(this,menus);
        navlist.setAdapter(adapter);

        navlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String selectedMenu = menus[i];

                switch (selectedMenu) {
                    case "등원관리":
                        FragmentAttend fragmentAttend = new FragmentAttend();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, fragmentAttend)
                                .addToBackStack(null)
                                .commit();
                        drawerLayout.closeDrawers();
                        break;
                    case "셔틀버스 조회":
                        FragmentBus fragmentBus = new FragmentBus();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, fragmentBus)
                                .addToBackStack(null)
                                .commit();
                        drawerLayout.closeDrawers();
                        break;
                    case "센터연결":
                        FragmentCall fragmentCall = new FragmentCall();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, fragmentCall)
                                .addToBackStack(null)
                                .commit();
                        drawerLayout.closeDrawers();
                        break;
                    case "설정":
                        FragmentSettings fragmentSettings = new FragmentSettings();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, fragmentSettings)
                                .addToBackStack(null)
                                .commit();
                        drawerLayout.closeDrawers();
                        break;
                    case "공지사항":
                        FragmentNotice fragmentNotice = new FragmentNotice();
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.content_frame, fragmentNotice)
                                .addToBackStack(null)
                                .commit();
                        drawerLayout.closeDrawers();
                        break;
                }
                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
            }
        });
    }

    @Override
    public void onBackPressed() {
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

/*
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.nav_attend:
                FragmentAttend fragmentAttend = new FragmentAttend();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, fragmentAttend)
                        .addToBackStack(null)
                        .commit();
                drawerLayout.closeDrawers();
                break;
            case R.id.nav_bus:
                FragmentBus fragmentBus = new FragmentBus();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, fragmentBus)
                        .addToBackStack(null)
                        .commit();
                drawerLayout.closeDrawers();
                break;
            case R.id.nav_call:
                FragmentCall fragmentCall = new FragmentCall();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, fragmentCall)
                        .addToBackStack(null)
                        .commit();
                drawerLayout.closeDrawers();
                break;
            case R.id.nav_setting:
                FragmentSettings fragmentSettings = new FragmentSettings();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, fragmentSettings)
                        .addToBackStack(null)
                        .commit();
                drawerLayout.closeDrawers();
                break;
            case R.id.nav_notice:
                FragmentNotice fragmentNotice = new FragmentNotice();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.content_frame, fragmentNotice)
                        .addToBackStack(null)
                        .commit();
                drawerLayout.closeDrawers();
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }*/
}
