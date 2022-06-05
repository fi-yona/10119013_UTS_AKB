package com.example.a10119013_uts_akb.ui.InformasiAplikasi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

//nim                   = 10119013
//nama                  = Fiona Avila Putri
//kelas                 = IF-1
//tanggal pengerjaan    = 05-06-2022

public class InformasiAplikasiViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InformasiAplikasiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}