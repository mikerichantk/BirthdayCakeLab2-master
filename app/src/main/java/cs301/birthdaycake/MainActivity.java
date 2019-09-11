package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        // find ID for cakeView object
        CakeView myCakeView = findViewById(R.id.cakeview);
        // init CakeController
        CakeController myCakeController = new CakeController(myCakeView);
    }
    public void goodbye(View button) {
        Log.i("theInfoTag", "Goodbye");
    }
}
