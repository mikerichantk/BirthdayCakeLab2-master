package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

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
        Button blow = (Button)findViewById(R.id.buttonBlow);
        blow.setOnClickListener(myCakeController);
        Switch candles = (Switch)findViewById(R.id.switchCandles);
        candles.setOnCheckedChangeListener(myCakeController);
        SeekBar seekBar = (SeekBar)findViewById(R.id.seekbarCandles);
        seekBar.setOnSeekBarChangeListener(myCakeController);
        myCakeView.setOnTouchListener(myCakeController);
    }
    public void goodbye(View button) {
        Log.i("theInfoTag", "Goodbye");
    }
}
