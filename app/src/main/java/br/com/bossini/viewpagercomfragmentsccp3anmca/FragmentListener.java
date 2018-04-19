package br.com.bossini.viewpagercomfragmentsccp3anmca;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

/**
 * Created by rodrigo on 18/04/18.
 */

public class FragmentListener implements ActionBar.TabListener {
    private ViewPager viewPager;
    private int index;

    public FragmentListener (ViewPager viewPager, int index){
        this.viewPager = viewPager;
        this.index = index;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(index);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
