package com.example.demolistview_2050531200324;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends BaseAdapter{

    private Context context;
    private int layout;
    private List<Food> foodList;

    public FoodAdapter() {
    }

    public FoodAdapter(Context context, int layout, List<Food> foodList) {
        this.context = context;
        this.layout = layout;
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        
        ImageView imgHinh;
        TextView txtName, txtInformation, txtPrice;

    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) view.findViewById(R.id.textView_view);
            holder.txtInformation = (TextView) view.findViewById(R.id.textView_information);
            holder.txtPrice = (TextView) view.findViewById(R.id.textView_price);
            holder.imgHinh = (ImageView) view.findViewById(R.id.image_view);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();

        }


        Food food = foodList.get(i);
        holder.txtName.setText(food.getName());
        holder.txtInformation.setText(food.getInformation());
        holder.txtPrice.setText(food.getPrice());
        holder.imgHinh.setImageResource(food.getImages());

        return view;
    }
}
