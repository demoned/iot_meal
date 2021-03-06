package common;

import android.content.Context;

import javax.inject.Singleton;

import common.model.DataManager;
import common.model.LoginManager;
import dagger.Component;

/**
 * Created by admin on 2017/3/10.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface AppComponent {
    Context getContext();

    DataManager getDataManager();

    LoginManager getLoginManager();
}
