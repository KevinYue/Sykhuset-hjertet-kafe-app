package no.sykehusetkjokkenet.hjertetkafemoss.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import no.sykehusetkjokkenet.hjertetkafemoss.R;

public class MainActivity extends AppCompatActivity {

    //private RecyclerView recyclerViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up bottom navigation view
        setupBottomNavigation();

    }

    private void setupBottomNavigation() {
        // Find the id for bottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        // Set the background of bottomNavigationView to null
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(2).setEnabled(false);


        // Getting the navigation fragment
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.navHostFragment);

        // Set up the bottom navigation view with the navigation controller
        NavigationUI.setupWithNavController(bottomNavigationView, navHostFragment.getNavController());
    }


}