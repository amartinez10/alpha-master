package prototype1.alpha;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

//testing push
public class ActivitySleep extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        setNavigationViewListener();

        android.support.v7.app.ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setLogo(R.drawable.navbar);
        menu.setDisplayUseLogoEnabled(true);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.sleep);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.nav_achievements){
            Intent intent = new Intent(this, ActivityAchievements.class);
            startActivity(intent);
        } else if(id == R.id.nav_closet){
            Intent intent = new Intent(this, ActivityCloset.class);
            startActivity(intent);
        } else if(id == R.id.nav_friends){
            Intent intent = new Intent(this, ActivityFriends.class);
            startActivity(intent);
        } else if(id == R.id.nav_profile){
            Intent intent = new Intent(this, ActivityProfile.class);
            startActivity(intent);
        } else if(id == R.id.nav_reminders){
            Intent intent = new Intent(this, ActivityReminders.class);
            startActivity(intent);
        } else if(id == R.id.nav_schedule){
            Intent intent = new Intent(this, ActivitySchedule.class);
            startActivity(intent);
        } else if(id == R.id.nav_settings){
            Intent intent = new Intent(this, ActivitySettings.class);
            startActivity(intent);
        } else if(id == R.id.nav_home){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.sleep);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setNavigationViewListener(){
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


}
