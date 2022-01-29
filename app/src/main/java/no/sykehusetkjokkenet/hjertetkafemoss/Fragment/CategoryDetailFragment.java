package no.sykehusetkjokkenet.hjertetkafemoss.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import no.sykehusetkjokkenet.hjertetkafemoss.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CategoryDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CategoryDetailFragment extends Fragment {

    public CategoryDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category_detail, container, false);
    }
}