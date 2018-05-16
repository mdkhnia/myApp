package com.example.moham.mycv.mvp.home;

import com.example.moham.mycv.Models.SessionModel;

public interface HomeContract {
    interface View {
    }

    interface Presenter {
        void sessionEnabling(SessionModel sessionItem, int sessionItemPosition);

    }
}
