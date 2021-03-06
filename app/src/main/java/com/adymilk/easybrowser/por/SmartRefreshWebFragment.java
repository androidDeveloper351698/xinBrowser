package com.adymilk.easybrowser.por;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;

import com.just.library.IWebLayout;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;


public class SmartRefreshWebFragment extends com.adymilk.easybrowser.por.BounceWebFragment {

    public static SmartRefreshWebFragment getInstance(Bundle bundle){

        SmartRefreshWebFragment mSmartRefreshWebFragment =new SmartRefreshWebFragment();
        if(mSmartRefreshWebFragment !=null)
            mSmartRefreshWebFragment.setArguments(bundle);

        return mSmartRefreshWebFragment;
    }

    private com.adymilk.easybrowser.por.SmartRefreshWebLayout mSmartRefreshWebLayout=null;

    @Override
    public String getUrl() {
        return super.getUrl();
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        final SmartRefreshLayout mSmartRefreshLayout= (SmartRefreshLayout) this.mSmartRefreshWebLayout.getLayout();
//
//        final WebView mWebView=this.mSmartRefreshWebLayout.getWeb();
//        mSmartRefreshLayout.setOnRefreshListener(new OnRefreshListener() {
//            @Override
//            public void onRefresh(RefreshLayout refreshlayout) {
//                mAgentWeb.getLoader().reload();
//
//                mSmartRefreshLayout.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        mSmartRefreshLayout.finishRefresh();
//                    }
//                },2000);
//            }
//        });
//        mSmartRefreshLayout.autoRefresh();



    }



    @Override
    protected IWebLayout getWebLayout(){
        return this.mSmartRefreshWebLayout=new com.adymilk.easybrowser.por.SmartRefreshWebLayout(this.getActivity());
    }




    @Override
    protected void addBGChild(FrameLayout frameLayout) {

        frameLayout.setBackgroundColor(Color.TRANSPARENT);

    }


}
