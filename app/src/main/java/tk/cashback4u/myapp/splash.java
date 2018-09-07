package tk.cashback4u.myapp;

import android.app.*;
import android.os.*;
import android.text.format.*;
import java.util.*;
import android.content.*;

public class splash extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
		ActionBar ab=getActionBar();
		ab.hide();
		Timer time=new Timer();
		time.schedule(new TimerTask(){

				@Override
				public void run()
				{
				Intent in=new Intent(splash.this,MainActivity.class);
				startActivity(in);
				finish();
				}			
		},3000);
    }
}
