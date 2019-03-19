package com.example.quanlydulieutaichinh;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

public class MenuFragment extends Fragment {
    Spinner spnListMaCK,spnListBieuDo;
    Button btnHoSoDoanhNghiep,btnKetQuaKinhDoanh,btnCanDoiKeToan,
            btnLuuChuyenTienTeTrucTiep,btnLuuChuyenTienTeGianTiep,btnChiSoTaiChinh,btnChiTieuKeHoach;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_menu, container, false);
        //Ánh xạ các view
        spnListMaCK = view.findViewById(R.id.spnListMaCK);
        spnListBieuDo = view.findViewById(R.id.spnListBieuDo);
        btnCanDoiKeToan = view.findViewById(R.id.btnCanDoiKeToan);
        btnChiSoTaiChinh = view.findViewById(R.id.btnChiSoTaiChinh);
        btnChiTieuKeHoach = view.findViewById(R.id.btnChiTieuKeHoach);
        btnHoSoDoanhNghiep = view.findViewById(R.id.btnHoSoDoanhNghiep);
        btnKetQuaKinhDoanh = view.findViewById(R.id.btnKetQuaKinhDoanh);
        btnLuuChuyenTienTeTrucTiep = view.findViewById(R.id.btnLuuChuyenTienTeTrucTiep);
        btnLuuChuyenTienTeGianTiep=view.findViewById(R.id.btnLuuChuyenTienTeGianTiep);

        final FragmentManager fragmentManager=getFragmentManager();

        btnHoSoDoanhNghiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                HSDNFragment hsdnFragment=new HSDNFragment();
                fragmentTransaction.replace(R.id.frameChiTiet,hsdnFragment);
                fragmentTransaction.commit();
            }
        });
        btnKetQuaKinhDoanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                KQKDFragment kqkdFragment=new KQKDFragment();

                    fragmentTransaction.replace(R.id.frameChiTiet,kqkdFragment);


                fragmentTransaction.commit();
            }
        });

        btnCanDoiKeToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                CDKTFragment cdktFragment=new CDKTFragment();

                    fragmentTransaction.replace(R.id.frameChiTiet, cdktFragment);

                fragmentTransaction.commit();
            }
        });
        btnLuuChuyenTienTeGianTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                LCTTGTFragment lcttgtFragment=new LCTTGTFragment();

                fragmentTransaction.replace(R.id.frameChiTiet, lcttgtFragment);

                fragmentTransaction.commit();
            }
        });
        btnLuuChuyenTienTeTrucTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                LCTTTTFragment lcttttFragment=new LCTTTTFragment();
                fragmentTransaction.replace(R.id.frameChiTiet, lcttttFragment);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
