package com.zendo.zzz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class TopAdCategoryActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_ad);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_top_ad, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SubAdCategoryActivity.class);
        String subCategory = "Beauty";
        switch(v.getId()){

            case R.id.imageButton:
                subCategory = "Cat1";
                break;
            case R.id.imageButton2:
                subCategory = "Cat2";
                break;
            case R.id.imageButton3:
                subCategory = "Cat3";
                break;
            case R.id.imageButton4:
                subCategory = "Cat4";
                break;
        }
        intent.putExtra("category", subCategory);
        startActivity(intent);
    }
}
