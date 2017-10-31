package rzgonz.core.kotlin.adapter;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\fH\u0016RB\u0010\u0005\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u00070\u0006j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lrzgonz/core/kotlin/adapter/BasePagerAdapter;", "Landroid/support/v4/app/FragmentStatePagerAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "(Landroid/support/v4/app/FragmentManager;)V", "items", "Ljava/util/ArrayList;", "Lrzgonz/core/kotlin/fragment/BaseFragment;", "Lrzgonz/core/kotlin/Interface/BaseView;", "Lrzgonz/core/kotlin/presenter/BasePresenter;", "Lkotlin/collections/ArrayList;", "getCount", "", "getItem", "Landroid/support/v4/app/Fragment;", "position", "getPageTitle", "", "core_debug"})
public final class BasePagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter {
    private final java.util.ArrayList<rzgonz.core.kotlin.fragment.BaseFragment<rzgonz.core.kotlin.Interface.BaseView, rzgonz.core.kotlin.presenter.BasePresenter<rzgonz.core.kotlin.Interface.BaseView>>> items = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v4.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    public BasePagerAdapter(@org.jetbrains.annotations.Nullable()
    android.support.v4.app.FragmentManager fm) {
        super(null);
    }
}