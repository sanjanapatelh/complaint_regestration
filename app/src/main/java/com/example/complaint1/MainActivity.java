package com.example.complaint1;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    Button citizen1,admin1,detective1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        citizen1=(Button)findViewById(R.id.citizen);
        admin1=(Button)findViewById(R.id.admin);
        detective1=(Button)findViewById(R.id.detective);
        admin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startadmin=new Intent(MainActivity.this, LoginAdminActivity.class);
                startActivity(startadmin);
            }
        });



    }
}
