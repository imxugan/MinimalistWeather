package me.baron.weatherstyle.activities.module;

import dagger.Module;
import dagger.Provides;
import me.baron.weatherstyle.contract.HomePageContract;

/**
 * This is a Dagger module. We use this to pass in the View dependency to the
 * {@link me.baron.weatherstyle.presenter.HomePagePresenter}
 *
 * @author baronzhang (baron[dot]zhanglei[at]gmail[dot]com)
 *         2016/11/30
 */
@Module
public class HomePageModule {

    private HomePageContract.View view;

    public HomePageModule(HomePageContract.View view) {

        this.view = view;
    }

    @Provides
    HomePageContract.View provideHomePageContractView() {
        return view;
    }

}