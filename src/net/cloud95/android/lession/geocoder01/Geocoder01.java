package net.cloud95.android.lession.geocoder01;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import android.app.Activity;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Geocoder01 extends Activity {

    private LocationManager locationManager;
    private MyLocationListener myLocationListener;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info = (TextView) findViewById(R.id.info);
        // 取得LocationManager物件
        locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE); 
        // 建立LocationListener物件
        myLocationListener = new MyLocationListener();
    }

    @Override
    protected void onResume() {
        super.onResume();
        // 執行註冊，設備是GPS，更新位置資訊的間隔時間是一秒與五公尺
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 5, myLocationListener);
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 5, myLocationListener);
    }

    @Override
    protected void onPause() {
        super.onPause();
        // 移除
    }

    private class MyLocationListener implements LocationListener {

        @Override
        public void onLocationChanged(Location location) {
            // 取得經緯度座標
            // 用來儲存回傳地址資料的List物件
            // 建立Geocoder物件，指定區域為台灣
                // 讀取指定座標的地址，最多傳回10筆
                    // 取得第 i 個Address物件
        }

        @Override
        public void onProviderDisabled(String provider) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onStatusChanged(String provider, int status, 
                Bundle extras) {

        }

    }

}
