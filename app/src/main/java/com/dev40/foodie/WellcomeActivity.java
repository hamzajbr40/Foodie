package com.dev40.foodie;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Button;
import android.support.v4.view.GestureDetectorCompat;
import android.view.MotionEvent;

public class WellcomeActivity extends Activity {

    private GestureDetectorCompat gestureObject;
  //  private Button button;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);

        gestureObject = new GestureDetectorCompat(this,new LearnGesture());  // a interact between the user and the screen ex: swip the screen
        //here learnGesture is class file

        Button loginButton = (Button) findViewById(R.id.login_Activity_btn);
        Button signUpButton = (Button) findViewById(R.id.signup_btn);
    }
    public void login(View view){
        intent = new Intent(this, LoginActivity.class);
        // a connection between 2 activities
        startActivity(intent);
    }
    public void signUp(View view) {
        intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    class LearnGesture extends GestureDetector.SimpleOnGestureListener{
        // A convenience class to extend when you only want to listen for a subset of all the gestures
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

        //onFling: is that the user lifts his finger in the end of the movement (that is the reason for what onFling is called one time).
        /*      e1 	MotionEvent: The first down motion event that started the fling.

                e2 	MotionEvent: The move motion event that triggered the current onFling.

                velocityX 	float: The velocity of this fling measured in pixels per second along the x axis.

                velocityY 	float: The velocity of this fling measured in pixels per second along the y axis. */

             if (e2.getX()<e1.getX()){
                Intent intent = new Intent(WellcomeActivity.this,Category_Activity.class);
                finish();
                startActivity(intent);

             }

            return true;
        }
    }
}