
package com.app.huawei;

import android.app.FragmentTransaction;

import com.app.huawei.logger.LoggerActivity;

public class BaseActivity extends LoggerActivity
{
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void addLogFragment() {
        final FragmentTransaction transaction = getFragmentManager().beginTransaction();
        final LogFragment fragment = new LogFragment();
        transaction.replace(R.id.framelog, fragment);
        transaction.commit();
    }
}
