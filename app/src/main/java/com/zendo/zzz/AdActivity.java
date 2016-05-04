package com.zendo.zzz;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.zendo.zzz.objects.Ad;
import com.zendo.zzz.objects.Fixtures;

import java.util.List;


public class AdActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();
        /**
         * Here, we will in the ideal case get the ad from the database. Just pass IDs around, not
         * objects.
         */
        String adId = extras.getString("adId", "nothing");
        Fixtures fixtures = new Fixtures();
        Ad ad = fixtures.getExampleAds().get(0);
        setContentFromAd(ad);
        setContentView(R.layout.activity_ad);
    }

    private void setContentFromAd(Ad ad) {
        TextView adTitle = (TextView)findViewById(R.id.adTitleTextView);
        adTitle.setText(ad.getSubCategory());
        TextView adDescription = (TextView)findViewById(R.id.descriptionTextView);
        adDescription.setText(ad.getDescription());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ad, menu);
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
}
