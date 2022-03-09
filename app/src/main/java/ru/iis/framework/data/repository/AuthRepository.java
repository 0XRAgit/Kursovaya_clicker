package ru.iis.framework.data.repository;

import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import ru.iis.framework.data.Prefs;
import ru.iis.framework.data.network.NetworkApi;

public class AuthRepository {

    //Осталось от шаблонга архитектуры
    private final Prefs prefs;
    private final NetworkApi api;

    public AuthRepository(NetworkApi api, Prefs prefs){
        this.prefs = prefs;
        this.api = api;
    }

    public Single<Object> getTest() {
        return api.getTest()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

}
