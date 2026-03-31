package projet.fst.ma.convertertabsjava;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.Locale;

public class DistanceFragment extends Fragment {

    private RadioButton rbKmToMiles;
    private EditText etDistInput;
    private Button btnConvertDist;
    private TextView tvDistResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // Liaison avec le fichier XML
        View view = inflater.inflate(R.layout.fragment_distance, container, false);

        // Initialisation des composants
        rbKmToMiles = view.findViewById(R.id.rbKmToMiles);
        etDistInput = view.findViewById(R.id.etDistInput);
        btnConvertDist = view.findViewById(R.id.btnConvertDist);
        tvDistResult = view.findViewById(R.id.tvDistResult);

        // Action du bouton calculer
        btnConvertDist.setOnClickListener(v -> {
            String input = etDistInput.getText().toString();

            if (TextUtils.isEmpty(input)) {
                Toast.makeText(getContext(), "Veuillez entrer une valeur", Toast.LENGTH_SHORT).show();
                return;
            }

            try {
                double val = Double.parseDouble(input);
                double result;

                if (rbKmToMiles.isChecked()) {
                    // Kilomètres vers Miles
                    result = val * 0.621371;
                } else {
                    // Miles vers Kilomètres
                    result = val / 0.621371;
                }

                tvDistResult.setText(String.format(Locale.getDefault(), "Résultat : %.2f", result));
            } catch (NumberFormatException e) {
                Toast.makeText(getContext(), "Format numérique invalide", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}