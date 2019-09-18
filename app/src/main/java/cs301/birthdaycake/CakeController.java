package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    // init private object
    private CakeView newView;
    private CakeModel newModel;
    // constructor
    public CakeController(CakeView view){
        newView = view;
        newModel = view.getModel();

    }

    @Override
    public void onClick(View v){
        Log.d("click proof", "click");
        newModel.blowCandles();
        newView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
        if(!isChecked){
            newModel.deleteCandles();
        }
        else{
            newModel.candlesBack();
        }
        newView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
        newModel.setNumCandles(progress);
        newView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar){

    }

    @Override public void onStopTrackingTouch(SeekBar seekBar){

    }
    public boolean onTouch(View v, MotionEvent event){

        float x = event.getX();
        float y = event.getY();
        newModel.setXY(x,y);

        v.invalidate();
        return true;
    }
}
