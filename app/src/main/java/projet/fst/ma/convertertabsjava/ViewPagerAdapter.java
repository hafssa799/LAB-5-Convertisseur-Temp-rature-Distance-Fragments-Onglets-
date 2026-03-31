package projet.fst.ma.convertertabsjava;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    // Constructeur de l'adaptateur
    public ViewPagerAdapter(@NonNull FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Retourne le fragment correspondant à la position (0 ou 1)
        if (position == 0) {
            return new TempFragment();   // Pour l'onglet "Température"
        } else {
            return new DistanceFragment(); // Pour l'onglet "Distance"
        }
    }

    @Override
    public int getItemCount() {
        // Nous avons 2 onglets au total
        return 2;
    }
}