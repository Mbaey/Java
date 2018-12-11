package nwnu.com.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText et_name;
    private CheckBox cbLOL, cbCOD, cbRA, cbCSGO;
    private RadioButton radio_female, radio_marry;
    private DatePicker datePicker;
    private Spinner spinner_city;

    Button submit;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.et_name);
        radio_female = (RadioButton) findViewById(R.id.radio_female);
        radio_marry = (RadioButton) findViewById(R.id.radio_marry);
        cbLOL = (CheckBox) findViewById(R.id.LOL);
        cbCOD = (CheckBox) findViewById(R.id.COD);
        cbRA = (CheckBox) findViewById(R.id.RA);

        datePicker = (DatePicker) findViewById(R.id.dp_birth);
        datePicker.init(2013, 8, 20, null);
        spinner_city = findViewById(R.id.spinner_city);
        submit = findViewById(R.id.btn_submit);


        submit.setOnClickListener(this);

//
//        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
//        viewPager.setAdapter(new MainAdapter(getSupportFragmentManager()));
//        AlphaIndicator alphaIndicator = (AlphaIndicator) findViewById(R.id.alphaIndicator);
//        alphaIndicator.setViewPager(viewPager);
    }

    @Override
    public void onClick(View v) {
        String name = et_name.getText().toString();
        String sex;
        ArrayList<String> likes = new ArrayList<>();
        if(radio_female.isChecked()){
            sex = "女";
        }else{
            sex = "男";
        }
        Log.d(TAG, "onClick: sex is sex is sex is sex is sex is sex is sex is sex is "+sex);

        if(cbLOL.isChecked()){
            likes.add("英雄联盟");
        }
        if(cbCOD.isChecked()){
            likes.add("使命召唤");
        }
        if(cbRA.isChecked()){
            likes.add("红色警戒");
        }
        Log.d(TAG, "onClick: likes is likes is likes is likes is "+ likes);


        String marry;
        if(radio_marry.isChecked()){
            marry = "已婚";
        }else{
            marry = "未婚";
        }
        Log.d(TAG, "onClick: marry marry marry marry marry marry" + marry);

        // 获取一个日历对象，并初始化为当前选中的时间
        Calendar calendar = Calendar.getInstance();
        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int dayOfMonth = datePicker.getDayOfMonth();

        calendar.set(year, month, dayOfMonth);
        SimpleDateFormat format = new SimpleDateFormat(
                "yyyy年MM月dd日  HH:mm");
        String birth = format.format(calendar.getTime());
        Log.d(TAG, "onClick: birth birth birth birth birth birth "+ birth);

       String city =  spinner_city.getSelectedItem().toString();
        Log.d(TAG, "onClick: city city city city city city "+ city);

        Peo peo = new Peo(name, sex, marry, birth, city, likes);
        Toast.makeText(MainActivity.this,
                peo.toString(), Toast.LENGTH_SHORT)
                .show();
//        https://blog.csdn.net/zyc_613/article/details/50232541
//        spinner_city.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                cardNumber = spinner_city.getSelectedItem().toString();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        }
//    };

    }
}
