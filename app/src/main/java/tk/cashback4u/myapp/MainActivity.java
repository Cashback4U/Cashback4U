package tk.cashback4u.myapp;

import android.app.*;
import android.os.*;
import android.view.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		menu.add(0,0,0,"option1");
		menu.add(0,0,0,"option2");
		menu.add(0,0,0,"option3");
		menu.add(0,0,0,"option4");
		
		// TODO: Implement this method
		return true;
	}
	
}
