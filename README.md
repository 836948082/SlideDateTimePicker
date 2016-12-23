# SlideDateTimePicker
# 日期时间选择器组合控件

https://github.com/jjobes/SlideDateTimePicker

![screen_1](https://github.com/836948082/QuantityView/blob/0d31dad8a12e383585c7ad95a60fd89492bfe4c5/image/screen_1.png)
![screen_2](https://github.com/836948082/QuantityView/blob/0d31dad8a12e383585c7ad95a60fd89492bfe4c5/image/screen_2.png)

/**
 * 选择回调
 */
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