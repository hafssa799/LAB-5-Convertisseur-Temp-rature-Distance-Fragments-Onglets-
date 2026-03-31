package projet.fst.ma.convertertabsjava;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Locale;

public class TempFragment extends Fragment {

    private RadioButton rbCtoF;
    private EditText etTempInput;
    private Button btnConvertTemp;
    private TextView tvTempResult;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // 1. "Inflate" le layout (convertit le XML en objet View)
        View view = inflater.inflate(R.layout.fragment_temp, container, false);

        // 2. Initialisation des composants
        rbCtoF = view.findViewById(R.id.rbCtoF);
        etTempInput = view.findViewById(R.id.etTempInput);
        btnConvertTemp = view.findViewById(R.id.btnConvertTemp);
        tvTempResult = view.findViewById(R.id.tvTempResult);

        // 3. Logique du bouton
        btnConvertTemp.setOnClickListener(v -> {
            String input = etTempInput.getText().toString();

            if (TextUtils.isEmpty(input)) {
                Toast.makeText(getContext(), "Veuillez entrer une valeur", Toast.LENGTH_SHORT).show();
                return;
            }

            try {
                double val = Double.parseDouble(input);
                double result;

                if (rbCtoF.isChecked()) {
                    // Celsius vers Fahrenheit
                    result = (val * 1.8) + 32;
                } else {
                    // Fahrenheit vers Celsius
                    result = (val - 32) / 1.8;
                }

                tvTempResult.setText(String.format(Locale.getDefault(), "Résultat : %.2f", result));
            } catch (NumberFormatException e) {
                Toast.makeText(getContext(), "Format invalide", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}