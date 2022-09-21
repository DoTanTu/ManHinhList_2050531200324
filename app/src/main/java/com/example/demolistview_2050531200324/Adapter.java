package com.example.demolistview_2050531200324;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class Adapter extends BaseAdapter {

    private Activity activity;
    private String[] items;

    public Adapter(Activity activity, String[] items){
        this.activity = activity;
        this.items = items;

    }
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();
        view = inflater.inflate(R.layout.activity_item, null);
        TextView tvName = (TextView) view.findViewById(R.id.tv_name);
        tvName.setText(items[i]);
        return view;
    }
}
