package com.jhbli.menu_eunhye;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoticeActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice1);
        setTitle("개인정보 수정");

        Button btnAddress = (Button)findViewById(R.id.btnAddress);

        btnAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NoticeActivity1.this, NoticeActivity2.class);
                startActivity(intent);
            }
        });

    }
}
