package krt.wid.nohttp;

import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


/**
 * author:Marcus
 * create on:2019/7/29 15:40
 * description
 */
public class TestFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_card_map, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        WebView webView = view.findViewById(R.id.web);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.krtservice.com/xinyufy/test/public_h5/index.html?area=zgq#/pages/kakouRegister?areaCode=360502&areaName=%E6%B8%9D%E6%B0%B4%E5%8C%BA&cityCode=3605&cityName=%E6%96%B0%E4%BD%99%E5%B8%82&provinceCode=36&provinceName=%E6%B1%9F%E8%A5%BF%E7%9C%81");
//        webView.loadUrl("http://baidu.com");
    }
}
