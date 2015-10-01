package com.example.alvarpao.myappportfolio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void launchMoviesApp(View view)
    {
        Toast.makeText(this,"This button will launch my Popular Movies app", Toast.LENGTH_SHORT ).show();
    }

    public void launchScoresApp(View view)
    {
        Toast.makeText(this,"This button will launch my Scores app", Toast.LENGTH_SHORT ).show();
    }

    public void launchLibraryApp(View view)
    {
        Toast.makeText(this,"This button will launch my Library app", Toast.LENGTH_SHORT ).show();
    }

    public void launchBuildItBiggerApp(View view)
    {
        Toast.makeText(this,"This button will launch my Gradle Project app", Toast.LENGTH_SHORT ).show();
    }

    public void launchXYZReaderApp(View view)
    {

        Toast.makeText(this,"This button will launch my XYZ Reader app", Toast.LENGTH_SHORT ).show();
    }

    public void launchCapstoneApp(View view)
    {
        Toast.makeText(this,"This button will launch my Capstone app", Toast.LENGTH_SHORT ).show();
    }


}
