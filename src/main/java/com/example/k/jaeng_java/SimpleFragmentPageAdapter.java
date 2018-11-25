package com.example.k.jaeng_fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
package com.example.android.viewpager;


    public class SimpleFragmentPageAdapter extends FragmentPagerAdapter {

        public SimpleFragmentPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {
                return new NumbersFragment();
            } else if (position == 1){
                return new FamilyFragments();
            }
        }

        @Override
        public int getCount() {
            return 2;
        }
    }


