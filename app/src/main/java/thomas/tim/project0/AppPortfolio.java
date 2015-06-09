package thomas.tim.project0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class AppPortfolio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
    }

    public void media_streamer(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Spotify Streamer!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void super_duo1(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Super Duo 1!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void super_duo2(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Super Duo 2!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void ant_terminator(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build It Bigger!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void materialize(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch XYZ reader!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void capstone(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
