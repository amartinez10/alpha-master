package prototype1.alpha;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;

//testing push
public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNavigationViewListener();


        android.support.v7.app.ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(true);
        menu.setLogo(R.drawable.navbar);
        menu.setDisplayUseLogoEnabled(true);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
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

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void setNavigationViewListener(){
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void gotoSleep(View view){
        Intent intentSleep = new Intent(this, ActivitySleep.class);
        startActivity(intentSleep);
    }

    public void gotoDiet(View view){
        Intent intentDiet = new Intent(this, ActivityDiet.class);
        startActivity(intentDiet);
    }

    public void gotoActivity(View view){
        Intent intentActivity = new Intent(this, ActivityActivity.class);
        startActivity(intentActivity);
    }

    public void gotoRecommendations(View view){
        Intent intentRecommendations = new Intent(this, ActivityRecommendations.class);
        startActivity(intentRecommendations);
    }

    public void gotoLeaderboard(View view){
        Intent intentRecommendations = new Intent(this, ActivityLeaderboard.class);
        startActivity(intentRecommendations);
    }

    public void gotoUpdate(View view){
        Intent intentRecommendations = new Intent(this, ActivityUpdate.class);
        startActivity(intentRecommendations);
    }

    public void gotoCloset(View view){
        Intent intentCloset = new Intent(this, ActivityCloset.class);
        startActivity(intentCloset);
    }
}
