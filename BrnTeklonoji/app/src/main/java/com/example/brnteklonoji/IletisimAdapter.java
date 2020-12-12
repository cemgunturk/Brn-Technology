package com.example.brnteklonoji;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class IletisimAdapter extends BaseAdapter {

    List<IletisimModel> list;
    Context context;

    public IletisimAdapter(List<IletisimModel> list, Context context) {
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

        View view = LayoutInflater.from(context).inflate(R.layout.iletisimlist,parent,false);

        ImageView imageView = view.findViewById(R.id.icon);
        TextView textView = view.findViewById(R.id.iletisimText);

        imageView.setImageResource(list.get(position).getIconId());
        textView.setText(list.get(position).getBilgi());

        return view;
    }
}
