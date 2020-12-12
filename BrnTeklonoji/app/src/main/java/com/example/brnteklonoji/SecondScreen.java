package com.example.brnteklonoji;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SecondScreen extends AppCompatActivity {

    ListView listView;
    List<IcerikModel> list;
    IcerikAdapter adapter;

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == R.id.hakkimizda){
            Intent intent = new Intent(SecondScreen.this, Hakkimizda.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        }else if (item.getItemId() == R.id.iletisim){
            Intent intent = new Intent(SecondScreen.this,Iletisim.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        initialize();
        fillList();
    }


    public void initialize(){
        listView = findViewById(R.id.listView);
    }

    public void fillList(){
        list = new ArrayList<>();
        IcerikModel icerik1 = new IcerikModel(R.drawable.bir,"BRN TEKNOLOJİ firması olarak yeni nesil tezgahlarımızla sizlere talaşlı imalat hizmeti sunuyoruz. Mevcut olan üretim altyapımız ile zamanında teslim ve memnuniyet garantisi sunuyoruz.","Talaşlı İmalat");
        IcerikModel icerik2 = new IcerikModel(R.drawable.iki,"BRN Teknoloji, medikal sektörde sahip olduğu bir çok patent ve tecrübeli mühendisleri ile operasyonlarınızı geliştirirken ihtiyacınız olan en kritik noktalarda çözüm ortağınız olmayı hedefliyor.", "AR & GE Hizmetleri");

        list.add(icerik1);
        list.add(icerik2);

        adapter = new IcerikAdapter(list,this);
        listView.setAdapter(adapter);
        }
    }


