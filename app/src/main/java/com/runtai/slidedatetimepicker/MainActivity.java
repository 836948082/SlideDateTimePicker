package com.runtai.slidedatetimepicker;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.runtai.slidedatetimepickerlibrary.SlideDateTimeListener;
import com.runtai.slidedatetimepickerlibrary.SlideDateTimePicker;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends FragmentActivity {

    private SimpleDateFormat mFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Button mButton;

    private SlideDateTimeListener listener = new SlideDateTimeListener() {
        @Override
        public void onDateTimeSet(Date date) {
            Toast.makeText(MainActivity.this, mFormatter.format(date), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onDateTimeCancel() {
            Toast.makeText(MainActivity.this, "Canceled", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SlideDateTimePicker.Builder(getSupportFragmentManager())
                        .setListener(listener)
                        .setInitialDate(new Date())//设置初始化时间
                        //.setMinDate(minDate)//设置最小日期显示
                        //.setMaxDate(maxDate)//设置最大日期显示
                        .setIs24HourTime(true)//设置是否是24小时置
                        //.setTheme(SlideDateTimePicker.HOLO_DARK)//设置显示的主题光
                        //.setIndicatorColor(Color.parseColor("#990000"))//设置导航线颜色
                        .build()
                        .show();
            }
        });
    }
}
