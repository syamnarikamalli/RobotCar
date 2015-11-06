package com.example.will.robotcar;

import android.app.TabActivity;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class MainActivity extends TabActivity {
    public static BluetoothSocket socket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        TabSpec connectSpec = tabHost.newTabSpec("Connect");
        // setting Title and Icon for the Tab
        Intent connectIntent = new Intent(this, ConnectActivity.class);
        connectSpec.setIndicator("Connect", getResources().getDrawable(R.drawable.icon_connect));
        connectSpec.setContent(connectIntent);

        // Tab for Photos
        TabSpec driveSpec = tabHost.newTabSpec("Drive");
        // setting Title and Icon for the Tab
        Intent driveIntent = new Intent(this, DriveActivity.class);
        driveSpec.setIndicator("Drive", getResources().getDrawable(R.drawable.icon_drive));
        driveSpec.setContent(driveIntent);

        tabHost.addTab(connectSpec);
        tabHost.addTab(driveSpec);

    }


}
