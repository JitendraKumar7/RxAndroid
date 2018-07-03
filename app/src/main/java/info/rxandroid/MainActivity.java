package info.rxandroid;

import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import info.rxandroid.base.BaseActivity;
import info.rxandroid.basics.Example1Activity;
import info.rxandroid.basics.Example2Activity;
import info.rxandroid.basics.Example3Activity;
import info.rxandroid.basics.Example4Activity;
import info.rxandroid.basics.Example5Activity;
import info.rxandroid.observers.CompletableObserverActivity;
import info.rxandroid.observers.FlowableObserverActivity;
import info.rxandroid.observers.MaybeObserverActivity;
import info.rxandroid.observers.ObserverActivity;
import info.rxandroid.observers.SingleObserverActivity;
import info.rxandroid.operators.AverageOperatorActivity;
import info.rxandroid.operators.BufferOperatorActivity;
import info.rxandroid.operators.ConcatMapOperatorActivity;
import info.rxandroid.operators.ConcatOperatorActivity;
import info.rxandroid.operators.CountOperatorActivity;
import info.rxandroid.operators.DebounceOperatorActivity;
import info.rxandroid.operators.DistinctOperatorActivity;
import info.rxandroid.operators.FilterOperatorActivity;
import info.rxandroid.operators.FlatMapActivity;
import info.rxandroid.operators.FromOperatorActivity;
import info.rxandroid.operators.GroupByOperatorActivity;
import info.rxandroid.operators.JoinOperatorActivity;
import info.rxandroid.operators.JustOperatorActivity;
import info.rxandroid.operators.MapOperatorActivity;
import info.rxandroid.operators.MaxOperatorActivity;
import info.rxandroid.operators.MergeOperatorActivity;
import info.rxandroid.operators.MinOperatorActivity;
import info.rxandroid.operators.RangeOperatorActivity;
import info.rxandroid.operators.ReduceOperatorActivity;
import info.rxandroid.operators.RepeatOperatorActivity;
import info.rxandroid.operators.ReplayOperatorActivity;
import info.rxandroid.operators.SkipOperatorActivity;
import info.rxandroid.operators.SumOperatorActivity;
import info.rxandroid.operators.SwitchMapOperatorActivity;
import info.rxandroid.operators.TakeOperatorActivity;
import info.rxandroid.operators.TakeUntilOperatorActivity;
import info.rxandroid.operators.ZipOperatorActivity;
import info.rxandroid.recyclerview.RecyclerViewPagingActivity;
import info.rxandroid.retrofit.ContactsListActivity;
import info.rxandroid.retrofit.ContactsListMultiRemoteActivity;
import info.rxandroid.retrofit.ContactsSearchLocalActivity;
import info.rxandroid.retrofit.ContactsSearchRemoteActivity;
import info.rxandroid.rxbinding.RecyclerViewRxBindingActivity;
import info.rxandroid.rxbinding.SpinnerRxBindingActivity;
import info.rxandroid.rxbinding.ViewBindingActivity;
import info.rxandroid.subjects.AsyncSubjectActivity;
import info.rxandroid.subjects.BehaviorSubjectActivity;
import info.rxandroid.subjects.PublishSubjectActivity;
import info.rxandroid.subjects.ReplaySubjectActivity;

public class MainActivity extends BaseActivity {


    @OnClick({R.id.Example1,
            R.id.Example2,
            R.id.Example3,
            R.id.Example4,
            R.id.Example5,
            R.id.Observer,
            R.id.FlowableObserver,
            R.id.SingleObserver,
            R.id.MaybeObserver,
            R.id.CompletableObserver,
            R.id.ContactsList,
            R.id.ContactsSearchLocal,
            R.id.ContactsSearchRemote,
            R.id.ContactsListMultiRemote,
            R.id.ViewBinding,
            R.id.SpinnerRxBinding,
            R.id.RecyclerViewRxBinding,
            R.id.RecyclerViewPaging,
            R.id.MapOperator,
            R.id.FlatMap,
            R.id.SwitchMapOperator,
            R.id.BufferOperator,
            R.id.ReduceOperator,
            R.id.ConcatOperator,
            R.id.ReplayOperator,
            R.id.RangeOperator,
            R.id.MergeOperator,
            R.id.ZipOperator,
            R.id.FilterOperator,
            R.id.TakeOperator,
            R.id.JustOperator,
            R.id.FromOperator,
            R.id.PublishSubject,
            R.id.ReplaySubject,
            R.id.BehaviorSubject,
            R.id.AsyncSubject,
            R.id.GroupByOperator,
            R.id.SkipOperator,
            R.id.JoinOperator,
            R.id.TakeUntilOperator,
            R.id.SumOperator,
            R.id.MaxOperator,
            R.id.MinOperator,
            R.id.CountOperator,
            R.id.DebounceOperator,
            R.id.RepeatOperator,
            R.id.DistinctOperator,
            R.id.ConcatMapOperator,
            R.id.AverageOperator,})
    void onClick(View v) {

        switch (v.getId()) {
            case R.id.Example1:
                launchIntent(Example1Activity.class);
                break;
            case R.id.Example2:
                launchIntent(Example2Activity.class);
                break;
            case R.id.Example3:
                launchIntent(Example3Activity.class);
                break;
            case R.id.Example4:
                launchIntent(Example4Activity.class);
                break;
            case R.id.Example5:
                launchIntent(Example5Activity.class);
                break;
            case R.id.Observer:
                launchIntent(ObserverActivity.class);
                break;
            case R.id.FlowableObserver:
                launchIntent(FlowableObserverActivity.class);
                break;
            case R.id.SingleObserver:
                launchIntent(SingleObserverActivity.class);
                break;
            case R.id.MaybeObserver:
                launchIntent(MaybeObserverActivity.class);
                break;
            case R.id.CompletableObserver:
                launchIntent(CompletableObserverActivity.class);
                break;
            case R.id.ContactsList:
                launchIntent(ContactsListActivity.class);
                break;
            case R.id.ContactsSearchLocal:
                launchIntent(ContactsSearchLocalActivity.class);
                break;
            case R.id.ContactsSearchRemote:
                launchIntent(ContactsSearchRemoteActivity.class);
                break;
            case R.id.ContactsListMultiRemote:
                launchIntent(ContactsListMultiRemoteActivity.class);
                break;
            case R.id.ViewBinding:
                launchIntent(ViewBindingActivity.class);
                break;
            case R.id.SpinnerRxBinding:
                launchIntent(SpinnerRxBindingActivity.class);
                break;
            case R.id.RecyclerViewRxBinding:
                launchIntent(RecyclerViewRxBindingActivity.class);
                break;
            case R.id.RecyclerViewPaging:
                launchIntent(RecyclerViewPagingActivity.class);
                break;
            case R.id.MapOperator:
                launchIntent(MapOperatorActivity.class);
                break;
            case R.id.FlatMap:
                launchIntent(FlatMapActivity.class);
                break;
            case R.id.SwitchMapOperator:
                launchIntent(SwitchMapOperatorActivity.class);
                break;
            case R.id.BufferOperator:
                launchIntent(BufferOperatorActivity.class);
                break;
            case R.id.ReduceOperator:
                launchIntent(ReduceOperatorActivity.class);
                break;
            case R.id.ConcatOperator:
                launchIntent(ConcatOperatorActivity.class);
                break;
            case R.id.ReplayOperator:
                launchIntent(ReplayOperatorActivity.class);
                break;
            case R.id.RangeOperator:
                launchIntent(RangeOperatorActivity.class);
                break;
            case R.id.MergeOperator:
                launchIntent(MergeOperatorActivity.class);
                break;
            case R.id.ZipOperator:
                launchIntent(ZipOperatorActivity.class);
                break;
            case R.id.FilterOperator:
                launchIntent(FilterOperatorActivity.class);
                break;
            case R.id.TakeOperator:
                launchIntent(TakeOperatorActivity.class);
                break;
            case R.id.JustOperator:
                launchIntent(JustOperatorActivity.class);
                break;
            case R.id.FromOperator:
                launchIntent(FromOperatorActivity.class);
                break;
            case R.id.PublishSubject:
                launchIntent(PublishSubjectActivity.class);
                break;
            case R.id.ReplaySubject:
                launchIntent(ReplaySubjectActivity.class);
                break;
            case R.id.BehaviorSubject:
                launchIntent(BehaviorSubjectActivity.class);
                break;
            case R.id.AsyncSubject:
                launchIntent(AsyncSubjectActivity.class);
                break;
            case R.id.GroupByOperator:
                launchIntent(GroupByOperatorActivity.class);
                break;
            case R.id.SkipOperator:
                launchIntent(SkipOperatorActivity.class);
                break;
            case R.id.JoinOperator:
                launchIntent(JoinOperatorActivity.class);
                break;
            case R.id.TakeUntilOperator:
                launchIntent(TakeUntilOperatorActivity.class);
                break;
            case R.id.SumOperator:
                launchIntent(SumOperatorActivity.class);
                break;
            case R.id.MaxOperator:
                launchIntent(MaxOperatorActivity.class);
                break;
            case R.id.MinOperator:
                launchIntent(MinOperatorActivity.class);
                break;
            case R.id.CountOperator:
                launchIntent(CountOperatorActivity.class);
                break;
            case R.id.DebounceOperator:
                launchIntent(DebounceOperatorActivity.class);
                break;
            case R.id.RepeatOperator:
                launchIntent(RepeatOperatorActivity.class);
                break;
            case R.id.DistinctOperator:
                launchIntent(DistinctOperatorActivity.class);
                break;
            case R.id.ConcatMapOperator:
                launchIntent(ConcatMapOperatorActivity.class);
                break;
            case R.id.AverageOperator:
                launchIntent(AverageOperatorActivity.class);
                break;

            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
