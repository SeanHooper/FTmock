package com.zendo.zzz;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText userName = (EditText)findViewById(R.id.editText_name);
        final EditText password = (EditText)findViewById(R.id.editText_password);

        Button enterButton = (Button)findViewById(R.id.button_login);
        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userString = userName.getText().toString();
                String passString = password.getText().toString();
                Intent intent = new Intent(getApplicationContext(), TopAdCategoryActivity.class);
                intent.putExtra("userName", userString);
                intent.putExtra("password", passString);
            }
        });
    }

}