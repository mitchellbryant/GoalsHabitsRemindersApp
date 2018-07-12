//Created by Mitchell Bryant 07/10/2018
package mitchbryant.goalshabitsreminders;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class CustomActivity extends AppCompatActivity {

    private ToggleButton dailyButton;
    private ToggleButton weeklyButton;
    private ToggleButton monthlyButton;
    private ToggleButton sunday;
    private ToggleButton monday;
    private ToggleButton tuesday;
    private ToggleButton wednesday;
    private ToggleButton thursday;
    private ToggleButton friday;
    private ToggleButton saturday;
    private ToggleButton one;
    private ToggleButton two;
    private ToggleButton three;
    private ToggleButton four;
    private ToggleButton five;
    private ToggleButton six;
    private ToggleButton begin;
    private ToggleButton middle;
    private ToggleButton end;
    private ToggleButton entire;
    private View daily;
    private View weekly;
    private View monthly;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_custom);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout_add);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        dailyButton = findViewById(R.id.toggleButtonDaily);
        weeklyButton = findViewById(R.id.toggleButtonWeekly);
        monthlyButton = findViewById(R.id.toggleButtonMonthly);
        daily = findViewById(R.id.layoutDaily);
        weekly = findViewById(R.id.layoutWeekly);
        monthly = findViewById(R.id.layoutMonthly);
        sunday = findViewById(R.id.toggleButtonSunday);
        monday = findViewById(R.id.toggleButtonMonday);
        tuesday = findViewById(R.id.toggleButtonTuesday);
        wednesday = findViewById(R.id.toggleButtonWednesday);
        thursday = findViewById(R.id.toggleButtonThursday);
        friday = findViewById(R.id.toggleButtonFriday);
        saturday = findViewById(R.id.toggleButtonSaturday);
        one = findViewById(R.id.toggleButton1Day);
        two = findViewById(R.id.toggleButton2Days);
        three = findViewById(R.id.toggleButton3Days);
        four = findViewById(R.id.toggleButton4Days);
        five = findViewById(R.id.toggleButton5Days);
        six = findViewById(R.id.toggleButton6Days);
        begin = findViewById(R.id.toggleButtonMonthBegin);
        middle = findViewById(R.id.toggleButtonMonthMiddle);
        end = findViewById(R.id.toggleButtonMonthEnd);
        entire = findViewById(R.id.toggleButtonMonthEntire);

        dailyButton.setChecked(true);
        dailyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                monthly.setVisibility(View.INVISIBLE);
                monthlyButton.setChecked(false);
                weekly.setVisibility(View.INVISIBLE);
                weeklyButton.setChecked(false);
                daily.setVisibility((View.VISIBLE));
                if(!dailyButton.isChecked()){
                    dailyButton.setChecked(true);
                }
            }
        });
        weeklyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                daily.setVisibility(View.INVISIBLE);
                dailyButton.setChecked(false);
                monthly.setVisibility(View.INVISIBLE);
                monthlyButton.setChecked(false);
                weekly.setVisibility(View.VISIBLE);
                if(!weeklyButton.isChecked()){
                    weeklyButton.setChecked(true);
                }
            }
        });
        monthlyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                daily.setVisibility(View.INVISIBLE);
                dailyButton.setChecked(false);
                weekly.setVisibility(View.INVISIBLE);
                weeklyButton.setChecked(false);
                monthly.setVisibility(View.VISIBLE);
                if(!monthlyButton.isChecked()){
                    monthlyButton.setChecked(true);
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            private ToggleButton[] days = {two, three, four, five, six};
            @Override
            public void onClick(View view) {
                for (int i=0; i<days.length; i++){
                    days[i].setChecked(false);
                }
                if(!one.isChecked()){
                    one.setChecked(true);
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            private ToggleButton[] days = {one, three, four, five, six};
            @Override
            public void onClick(View view) {
                for (int i=0; i<days.length; i++){
                    days[i].setChecked(false);
                }
                if(!two.isChecked()){
                    two.setChecked(true);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            private ToggleButton[] days = {one, two, four, five, six};
            @Override
            public void onClick(View view) {
                for (int i=0; i<days.length; i++){
                    days[i].setChecked(false);
                }
                if(!three.isChecked()){
                    three.setChecked(true);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            private ToggleButton[] days = {one, two, three, five, six};
            @Override
            public void onClick(View view) {
                for (int i=0; i<days.length; i++){
                    days[i].setChecked(false);
                }
                if(!four.isChecked()){
                    four.setChecked(true);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            private ToggleButton[] days = {one, two, three, four, six};
            @Override
            public void onClick(View view) {
                for (int i=0; i<days.length; i++){
                    days[i].setChecked(false);
                }
                if(!five.isChecked()){
                    five.setChecked(true);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            private ToggleButton[] days = {one,two, three, four, five};
            @Override
            public void onClick(View view) {
                for (int i=0; i<days.length; i++){
                    days[i].setChecked(false);
                }
                if(!six.isChecked()){
                    six.setChecked(true);
                }
            }
        });
    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.saveGoal:
//                Intent intent = new Intent(this, AddActivity.class);
//                this.startActivity(intent);
//                return true;
//
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.save_goal, menu);
        return true;

    }

}
