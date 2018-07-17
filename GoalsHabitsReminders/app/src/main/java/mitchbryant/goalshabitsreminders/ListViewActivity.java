package mitchbryant.goalshabitsreminders;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;

public class ListViewActivity extends ListActivity
{
    String[] listItems={"alpha", "beta", "gamma", "delta", "epsilon"};
    boolean[] listImages={true, true, true, true, false};



    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        setListAdapter(new ImageAdapter(this, R.layout.activity_test, R.id.text1, R.id.image1, listItems, listImages ));


    }
}