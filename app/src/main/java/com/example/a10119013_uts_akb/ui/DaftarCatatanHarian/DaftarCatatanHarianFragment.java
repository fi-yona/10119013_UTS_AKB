package com.example.a10119013_uts_akb.ui.DaftarCatatanHarian;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a10119013_uts_akb.databinding.FragmentDaftarcatatanharianBinding;

//nim                   = 10119013
//nama                  = Fiona Avila Putri
//kelas                 = IF-1
//tanggal pengerjaan    = 05-06-2022

public class DaftarCatatanHarianFragment extends Fragment {

    private FragmentDaftarcatatanharianBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DaftarCatatanHarianViewModel galleryViewModel =
                new ViewModelProvider(this).get(DaftarCatatanHarianViewModel.class);

        binding = FragmentDaftarcatatanharianBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}