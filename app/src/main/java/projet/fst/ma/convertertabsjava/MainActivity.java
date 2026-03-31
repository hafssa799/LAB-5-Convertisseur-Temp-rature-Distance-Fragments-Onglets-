package projet.fst.ma.convertertabsjava;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    // Déclaration des composants
    TabLayout tabLayout;
    ViewPager2 viewPager;
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // On utilise l'interface définie dans activity_main.xml
        setContentView(R.layout.activity_main);

        // Initialisation des vues
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        // 1. Liaison du ViewPager avec l’adaptateur
        // Note : Assurez-vous d'avoir créé la classe ViewPagerAdapter
        adapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(adapter);

        // 2. Liaison des onglets (TabLayout) avec le contenu (ViewPager2)
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    if (position == 0) {
                        tab.setText("Température");
                    } else {
                        tab.setText("Distance");
                    }
                }
        ).attach();
    }

    // Gestion du bouton retour avec confirmation
    @Override
    public void onBackPressed() {
        // Super est commenté pour empêcher la fermeture immédiate
        // super.onBackPressed();

        new AlertDialog.Builder(this)
                .setTitle("Quitter")
                .setMessage("Voulez-vous vraiment quitter l'application ?")
                .setPositiveButton("Oui", (dialog, which) -> finish())
                .setNegativeButton("Non", null)
                .show();
    }
}