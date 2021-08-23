package com.geektech.myhomeworkapplication3recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCountry;
    CountryAdapter adapter;
    ArrayList<Country> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createList();
        initRecycler();

    }

    private void initRecycler() {
        rvCountry = findViewById(R.id.rv_country_list);
        adapter = new CountryAdapter();
        adapter.setList(createList());
        rvCountry.setAdapter(adapter);
    }

    private ArrayList<Country> createList() {
        list = new ArrayList<>();
        list.add(new Country("Германия", "Берлин", R.drawable.bg_de));
        list.add(new Country("Австралия", "Канберра", R.drawable.bg_au));
        list.add(new Country("Беларусь", "Минск", R.drawable.bg_by));
        list.add(new Country("Канада", "Оттава", R.drawable.bg_ca));
        list.add(new Country("Куба", "Гавана", R.drawable.bg_cu));
        list.add(new Country("Испания", "Мадрид", R.drawable.bg_es));
        list.add(new Country("Франция", "Париж", R.drawable.bg_fr));
        list.add(new Country("Великобритания", "Лондон", R.drawable.bg_gb));
        list.add(new Country("Хорватия", "Загреб", R.drawable.bg_hr));
        list.add(new Country("Индия", "Нью-Дели", R.drawable.bg_in));
        list.add(new Country("Италия", "Рим", R.drawable.bg_it));
        list.add(new Country("Япония", "Токио", R.drawable.bg_jp));
        list.add(new Country("США", "Нью-Йорк", R.drawable.bg_us));
        list.add(new Country("Кыргызстан", "Бишкек", R.drawable.bg_kg));
        list.add(new Country("Южная Корея", "Сеул", R.drawable.bg_kr));
        list.add(new Country("Казахстан", "Нурсултан", R.drawable.bg_kz));
        list.add(new Country("Россия", "Москва", R.drawable.bg_ru));
        list.add(new Country("Турция", "Стамбул", R.drawable.bg_tr));



        return list;
    }
}