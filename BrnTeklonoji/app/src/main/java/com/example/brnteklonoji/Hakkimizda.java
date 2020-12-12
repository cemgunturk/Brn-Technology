package com.example.brnteklonoji;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Hakkimizda extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu3,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.faaliyetler){
            Intent intent = new Intent(Hakkimizda.this, SecondScreen.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        }else if (item.getItemId() == R.id.iletisim){
            Intent intent = new Intent(Hakkimizda.this,Iletisim.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkimizda);
    }
}
