package com.example.abndp5bynooralmashhadani;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) return new ArtFragment();
        else if (position == 1) return new FoodFragment();
        else if (position == 2) return new FunActivitiesFragment();
        else return new HistoryFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) return context.getString(R.string.category_art);
        else if (position == 1) return context.getString(R.string.category_food);
        else if (position == 2) return context.getString(R.string.category_fun_activities);
        else return context.getString(R.string.category_history);
    }

}
