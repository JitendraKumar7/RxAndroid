package info.rxandroid.subjects;

import android.os.Bundle;
import android.util.Log;

import info.rxandroid.R;
import info.rxandroid.base.BaseActivity;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class PublishSubjectActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publish_subject);
    }

    private Observer<Integer> getFirstObserver() {
        return new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "First observer subscribed!");
            }

            @Override
            public void onNext(Integer integer) {
                Log.d(TAG, "First observer - onNext: " + integer);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                Log.d(TAG, "First observer completed!");
            }
        };
    }

    private Observer<Integer> getSecondObserver() {
        return new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "Second observer subscribed!");
            }

            @Override
            public void onNext(Integer integer) {
                Log.d(TAG, "Second observer - onNext: " + integer);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {
                Log.d(TAG, "Second observer completed!");
            }
        };
    }
}
