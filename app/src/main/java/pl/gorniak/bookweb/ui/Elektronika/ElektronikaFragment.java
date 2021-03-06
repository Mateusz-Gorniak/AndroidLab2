package pl.gorniak.bookweb.ui.Elektronika;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import pl.gorniak.bookweb.R;

public class ElektronikaFragment extends Fragment {

    private ElektronikaViewModel elektronikaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        elektronikaViewModel =
                new ViewModelProvider(this).get(ElektronikaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_electronics, container, false);
        final TextView textView = root.findViewById(R.id.text_electronics);
        elektronikaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}