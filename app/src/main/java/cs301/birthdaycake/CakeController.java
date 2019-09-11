package cs301.birthdaycake;

public class CakeController {
    // init private object
    private CakeView newView;
    private CakeModel newModel;
    // constructor
    public CakeController(CakeView view){
        newView = view;
        newModel = view.getModel();
    }
}
