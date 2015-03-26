package com.multipliersolutions.healthcampaign.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity5Activity extends Activity {
    ImageView startCampaign;
    ImageView reportsURL;
   // Button startCampaign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity5);

        startCampaign = (ImageView) findViewById(R.id.startCampaign);
        reportsURL = (ImageView) findViewById(R.id.reportsURL);
        startCampaign.setOnClickListener(new View.OnClickListener(){
                                            public void onClick(View p1)
                                            {
                                                Intent intent = new Intent(MainActivity5Activity.this, MainActivity2Activity.class);
                                                startActivity(intent);
                                            }
                                        }
        );

        reportsURL.setOnClickListener(new View.OnClickListener(){
                                             public void onClick(View p1)
                                             {
                                                 Intent viewIntent =
                                                         new Intent("android.intent.action.VIEW",
                                                                 Uri.parse("http://healthcampaign.in/suburban/SMSReport.php"));
                                                 startActivity(viewIntent);
                                             }
                                         }
        );


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity24, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
