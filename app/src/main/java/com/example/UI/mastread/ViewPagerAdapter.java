package com.example.UI.mastread;

/**
 * Created by IsaacIvan on 29-01-2018.
 */

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * Created by Wasim on 11-06-2015.
 */
public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private int[] mResources;
    private String[] mBook;

    public ViewPagerAdapter(Context mContext, int[] mResources, String[] mBook) {
        this.mContext = mContext;
        this.mResources = mResources;
        this.mBook = mBook;
    }

    @Override
    public int getCount() {
        return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.mybooks, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
        imageView.setImageResource(mResources[position]);
        TextView text = (TextView) itemView.findViewById(R.id.title);
        text.setText(mBook[position]);
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
