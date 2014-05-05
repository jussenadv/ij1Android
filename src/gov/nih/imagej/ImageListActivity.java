package gov.nih.imagej;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

public class ImageListActivity extends FragmentActivity
        implements ImageListFragment.Callbacks {

    private boolean mTwoPane;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_list);

        if (findViewById(R.id.image_detail_container) != null) {
            mTwoPane = true;
            ((ImageListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.image_list))
                    .setActivateOnItemClick(true);
        }
    }

    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            Bundle arguments = new Bundle();
            arguments.putString(ImageDetailFragment.ARG_ITEM_ID, id);
            ImageDetailFragment fragment = new ImageDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.image_detail_container, fragment)
                    .commit();

        } else {
            Intent detailIntent = new Intent(this, ImageDetailActivity.class);
            detailIntent.putExtra(ImageDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
