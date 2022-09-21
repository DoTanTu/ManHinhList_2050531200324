package com.example.demolistview_2050531200324;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvFood;
    ArrayList<Food> arrayFood;
    FoodAdapter foodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Mapping();

        foodAdapter = new FoodAdapter(this, R.layout.item_food,arrayFood);
        lvFood.setAdapter(foodAdapter);


}
    public void Mapping(){
        lvFood = (ListView) findViewById(R.id.list_view_food);
        arrayFood = new ArrayList<>();

        arrayFood.add(new Food("Thịt kho tẩm bột","Hương vị truyền thống...","6$",R.drawable.mon1,"+","-"));
        arrayFood.add(new Food("Bún đậu mắm tôm","Đặc sắc hương vị...","2$",R.drawable.mon2,"+","-"));
        arrayFood.add(new Food("Mỳ chiên trứng gà","Buổi sáng nhẹ nhàng...","4$",R.drawable.upla,"+","-"));
        arrayFood.add(new Food("Bánh mỳ kẹp","Loại bột đặc biệt...","3$",R.drawable.hampeger,"+","-"));
        arrayFood.add(new Food("Bánh mỳ ăn nhẹ","Hương thơm độc lạ...","2$",R.drawable.banhmi,"+","-"));
        arrayFood.add(new Food("Đồ ăn tổng hợp","Buổi sáng đầy đủ...","9$",R.drawable.an_sang_tong_hop,"+","-"));
        arrayFood.add(new Food("Bánh mỳ kẹp thịt ","Dai dòn cực tuyệt...","4$",R.drawable.banh_kep_thit,"+","-"));
        arrayFood.add(new Food("Tôm alaska kho tàu","Ngon , bổ, rẻ...","6$",R.drawable.tom_tau_alaska,"+","-"));

        lvFood.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "ban co muon xoa ko", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    public void ItemClick(){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, DetailActivity.class);
        startActivity(intent);


    }
}