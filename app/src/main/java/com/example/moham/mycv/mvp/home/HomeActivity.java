package com.example.moham.mycv.mvp.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.moham.mycv.Adapters.HomeRecyclerAdapter;
import com.example.moham.mycv.BaseActivity;
import com.example.moham.mycv.Models.SessionModel;
import com.example.moham.mycv.R;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity implements HomeContract.View{
    List<SessionModel> sessionList;
    RecyclerView homeRecyclerView;
    HomeContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        presenter = new HomePresenter(this);
        sessionList = new ArrayList<SessionModel>();
        SessionModel s1 = new SessionModel("Session 1", "To Do",
                "http://www.iconarchive.com/download/i99441/webalys/kameleon.pics/Coding-Html.ico");
        SessionModel s2 = new SessionModel("Session 2", "To Do",
                "http://www.iconarchive.com/download/i99441/webalys/kameleon.pics/Coding-Html.ico");
        SessionModel s3 = new SessionModel("Session 3", "To Do",
                "http://www.iconarchive.com/download/i99441/webalys/kameleon.pics/Coding-Html.ico");
        SessionModel s4 = new SessionModel("Session 4", "To Do",
                "http://www.iconarchive.com/download/i99441/webalys/kameleon.pics/Coding-Html.ico");
        SessionModel s5 = new SessionModel("Session 5", "To Do",
                "http://www.iconarchive.com/download/i99441/webalys/kameleon.pics/Coding-Html.ico");
        SessionModel s6 = new SessionModel("Session 6", "To Do",
                "http://www.iconarchive.com/download/i99441/webalys/kameleon.pics/Coding-Html.ico");
        SessionModel s7 = new SessionModel("Session 7", "To Do",
                "http://www.iconarchive.com/download/i99441/webalys/kameleon.pics/Coding-Html.ico");
        SessionModel s8 = new SessionModel("Session 8", "To Do",
                "http://www.iconarchive.com/download/i99441/webalys/kameleon.pics/Coding-Html.ico");
        SessionModel s9 = new SessionModel("Session 9", "To Do",
                "http://www.iconarchive.com/download/i99441/webalys/kameleon.pics/Coding-Html.ico");
        sessionList.add(s1);
        sessionList.add(s2);
        sessionList.add(s3);
        sessionList.add(s4);
        sessionList.add(s5);
        sessionList.add(s6);
        sessionList.add(s7);
        sessionList.add(s8);
        sessionList.add(s9);
        for(int i=0; i<sessionList.size();i++){
            presenter.sessionEnabling(sessionList.get(i) , i);
        }

        homeRecyclerView = findViewById(R.id.homeRecyclerView);
        HomeRecyclerAdapter adapter = new HomeRecyclerAdapter(mContext, sessionList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        homeRecyclerView.setLayoutManager(linearLayoutManager);
        homeRecyclerView.setAdapter(adapter);

    }

}
