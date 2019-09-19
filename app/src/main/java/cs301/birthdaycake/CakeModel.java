package cs301.birthdaycake;

public class CakeModel{
    // init public variables
    public boolean litCandles = true;
    public int numCandles = 2;
    public boolean frosted = true;
    public boolean hasCandles = true;

    public float  x;
    public float y;


    // constructor
    public CakeModel(){

    }

    public void blowCandles(){
        litCandles = false;
    }

    public boolean getBlow(){
        return litCandles;
    }

    public void deleteCandles(){
        hasCandles = false;
    }

    public void candlesBack(){
        hasCandles = true;
    }

    public boolean getHasCandles(){
        return hasCandles;
    }

    public int getNumCandles(){
        return numCandles;
    }

    public void setNumCandles(int num){
        numCandles = num;
    }

    public void setXY(float numX, float numY)
    {
        x=numX;
        y=numY;
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }
}
