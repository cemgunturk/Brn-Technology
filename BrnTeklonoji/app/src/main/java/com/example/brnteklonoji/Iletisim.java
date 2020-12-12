package com.example.brnteklonoji;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Iletisim extends AppCompatActivity {

    ListView listView;
    List<IletisimModel> list;
    IletisimAdapter adapter;
    Button button;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu2,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.hakkimizda){
            Intent intent = new Intent(Iletisim.this, Hakkimizda.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        }else if (item.getItemId() == R.id.faaliyetler){
            Intent intent = new Intent(Iletisim.this,SecondScreen.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iletisim);

        initialize();
        fillList();
    }


    public void initialize(){
        listView = findViewById(R.id.iletisimList);
        button = findViewById(R.id.gonderButton);
    }

    public void fillList(){
        list = new ArrayList<>();
        IletisimModel a1 = new IletisimModel(R.drawable.konum,"10032. Sk. NO: 2, 35865 İtob Osb / Menderes / İzmir");
        IletisimModel a2 = new IletisimModel(R.drawable.phone,"+90 232 799 0463");
        IletisimModel a3 = new IletisimModel(R.drawable.ik,"İnsan Kaynakları : +90 555 099 0218");
        IletisimModel a4 = new IletisimModel(R.drawable.bid,"Teklif Almak İçin : +90 541 915 8500");
        IletisimModel a5 = new IletisimModel(R.drawable.mail,"info@brntechnology.com");
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        adapter = new IletisimAdapter(list,this);
        listView.setAdapter(adapter);

    }

    public void goToSecond(View view) {
        /*
        Intent intent = new Intent(Iletisim.this, SecondScreen.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        Toast.makeText(getApplicationContext(),"Mesajınız İletilmiştir.",Toast.LENGTH_LONG).show();*/

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Mesajınız İletilecek.");
        alert.setMessage("Mesajınız Gönderilecektir. Onaylıyor Musunuz?");
        alert.setNegativeButton("Hayır!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(),"İşleminize Devam Edebilirsiniz.",Toast.LENGTH_LONG).show();
            }
        });
        alert.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Iletisim.this, SecondScreen.class);
                startActivity(intent);
                overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
                Toast.makeText(getApplicationContext(),"Mesajınız İletilmiştir.",Toast.LENGTH_LONG).show();
            }
        });

        alert.show();

    }

}
