package com.example.moham.mycv.mvp.home;

import com.example.moham.mycv.Adapters.HomeRecyclerAdapter;
import com.example.moham.mycv.Models.SessionModel;
import com.example.moham.mycv.R;

import java.util.ArrayList;
import java.util.List;

public class HomePresenter implements HomeContract.Presenter {
    HomeContract.View view;;

    public HomePresenter(HomeContract.View view) {
        this.view = view;
    }

    @Override
    public void sessionEnabling(SessionModel sessionItem, int sessionItemPosition) {
        if(!sessionItem.getSessionStatus().equalsIgnoreCase("done")){

        } else {

        }
    }
}
