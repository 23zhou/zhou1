package com.example.viewnews.usermodel;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.viewnews.R;
import com.example.viewnews.tools.BaseActivity;
import org.litepal.LitePal;
import java.util.ArrayList;
import java.util.List;

public class UserFavoriteActivity extends BaseActivity {

    private ListView favoriteNewsList;
    
    private Toolbar favoriteToolbar;
    private String userIdNumber;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_favorite);
        userIdNumber = getIntent().getStringExtra("user_love_id");
        System.out.println("收藏：当前用户的id为" + userIdNumber);
        favoriteNewsList = findViewById(R.id.favorite_newsList);
        favoriteToolbar = findViewById(R.id.userFavorite_toolbar);
        favoriteToolbar.setTitle("产品商城");
        setSupportActionBar(favoriteToolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeAsUpIndicator(R.drawable.ic_return_left);
        }
    }

    // 初始化数据


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                UserFavoriteActivity.this.finish();
                break;
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case 4:
                if(resultCode == RESULT_OK) {

                    System.out.println("奥里给！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
                }
                break;
        }
    }
}