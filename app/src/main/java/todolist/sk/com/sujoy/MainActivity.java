package todolist.sk.com.sujoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import todolist.sk.com.sujoy.view.MainActivityViewImplementor;

public class MainActivity extends AppCompatActivity {

    MainActivityViewImplementor mvcView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mvcView = new MainActivityViewImplementor(MainActivity.this,null);
        setContentView(mvcView.getRootView());
        mvcView.initViews();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mvcView.bindDataToView();
    }
}
