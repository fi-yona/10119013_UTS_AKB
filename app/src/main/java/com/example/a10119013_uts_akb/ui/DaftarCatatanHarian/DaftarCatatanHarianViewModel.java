package com.example.a10119013_uts_akb.ui.DaftarCatatanHarian;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

//nim                   = 10119013
//nama                  = Fiona Avila Putri
//kelas                 = IF-1
//tanggal pengerjaan    = 05-06-2022

public class DaftarCatatanHarianViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DaftarCatatanHarianViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Daftar Catatan Harian");
    }

    public LiveData<String> getText() {
        return mText;
    }
}