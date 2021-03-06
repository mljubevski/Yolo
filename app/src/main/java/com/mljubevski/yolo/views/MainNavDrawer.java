package com.mljubevski.yolo.views;

import android.view.View;
import android.widget.Toast;

import com.mljubevski.yolo.R;
import com.mljubevski.yolo.activities.BaseActivity;
import com.mljubevski.yolo.activities.MainActivity;

/**
 * Created by milos on 3/21/17.
 */

public class MainNavDrawer extends NavDrawer
{
    public MainNavDrawer(final BaseActivity activity)
    {
        super(activity);

        addItem(new ActivityNavDrawerItem(MainActivity.class, "Inbox", null, R.drawable.ic_action_unread, R.id.include_main_nav_drawer_topItems));
        addItem(new BasicNavDrawerItem("Logout", null, R.drawable.ic_action_backspace, R.id.include_main_nav_drawer_bottomItems) {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(activity, "You have logged", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
