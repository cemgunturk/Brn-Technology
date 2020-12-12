package com.example.brnteklonoji;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class IcerikAdapter extends BaseAdapter {

    List<IcerikModel> list;
    Context context;

    public IcerikAdapter(List<IcerikModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View layout = LayoutInflater.from(context).inflate(R.layout.listlayout,parent,false);

        TextView baslik = layout.findViewById(R.id.baslik);
        ImageView resim = layout.findViewById(R.id.resim);
        TextView icerik = layout.findViewById(R.id.icerik);

        baslik.setText(list.get(position).getBaslik());
        resim.setImageResource(list.get(position).getIcerikResimId());
        icerik.setText(list.get(position).getIcerikAciklama());

        return layout;
    }
}
