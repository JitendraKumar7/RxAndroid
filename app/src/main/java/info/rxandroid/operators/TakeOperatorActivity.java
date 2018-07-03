package info.rxandroid.operators;

import android.os.Bundle;
import android.util.Log;

import info.rxandroid.R;
import info.rxandroid.base.BaseActivity;
import io.reactivex.Observable;
import io.reactivex.observers.DisposableObserver;

public class TakeOperatorActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_operator);

        Observable.just(1, 2, 3, 4, 5, 6)
                .take(3)
                .subscribeWith(new DisposableObserver<Integer>() {
                    @Override
                    public void onNext(Integer integer) {
                        Log.d(TAG, "onNext: " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {
                        Log.d(TAG, "All items emitted!");
                    }
                });
    }
}
