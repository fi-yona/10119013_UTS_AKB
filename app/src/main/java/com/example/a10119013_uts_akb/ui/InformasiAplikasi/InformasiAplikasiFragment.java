package com.example.a10119013_uts_akb.ui.InformasiAplikasi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.a10119013_uts_akb.databinding.FragmentInformasiaplikasiBinding;

//nim                   = 10119013
//nama                  = Fiona Avila Putri
//kelas                 = IF-1
//tanggal pengerjaan    = 05-06-2022

public class InformasiAplikasiFragment extends Fragment {

    private FragmentInformasiaplikasiBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        InformasiAplikasiViewModel informasiAplikasiViewModel =
                new ViewModelProvider(this).get(InformasiAplikasiViewModel.class);

        binding = FragmentInformasiaplikasiBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        informasiAplikasiViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}