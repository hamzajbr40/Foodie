package com.dev40.foodie;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WellcomeActivity extends Activity {

    private Button button;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        Button skipButton = (Button) findViewById(R.id.skip_btn);
        Button loginButton = (Button) findViewById(R.id.login_Activity_btn);
        Button signUpButton = (Button) findViewById(R.id.signup_btn);

    }

    public void login(View view){
        intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void skip(View view) {
        intent = new Intent(this, Category_Activity.class);
        startActivity(intent);
    }
    public void signUp(View view) {
        intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}
