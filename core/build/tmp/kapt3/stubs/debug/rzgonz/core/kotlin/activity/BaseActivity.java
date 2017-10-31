package rzgonz.core.kotlin.activity;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0014J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0014\u0010\u001b\u001a\u00020\u000f*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0016R\u0018\u0010\u0007\u001a\u00028\u0001X\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lrzgonz/core/kotlin/activity/BaseActivity;", "V", "Lrzgonz/core/kotlin/Interface/BaseView;", "P", "Lrzgonz/core/kotlin/presenter/BasePresenter;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "mPresenter", "getMPresenter", "()Lrzgonz/core/kotlin/presenter/BasePresenter;", "setMPresenter", "(Lrzgonz/core/kotlin/presenter/BasePresenter;)V", "getContext", "Landroid/content/Context;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showError", "stringResId", "", "error", "", "showMessage", "srtResId", "message", "loadImageWeb", "Landroid/widget/ImageView;", "url", "core_debug"})
public abstract class BaseActivity<V extends rzgonz.core.kotlin.Interface.BaseView, P extends rzgonz.core.kotlin.presenter.BasePresenter<? super V>> extends android.support.v7.app.AppCompatActivity implements rzgonz.core.kotlin.Interface.BaseView {
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract P getMPresenter();
    
    protected abstract void setMPresenter(@org.jetbrains.annotations.NotNull()
    P p0);
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void showError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void showError(int stringResId) {
    }
    
    @java.lang.Override()
    public void showMessage(int srtResId) {
    }
    
    @java.lang.Override()
    public void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void loadImageWeb(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public BaseActivity() {
        super();
    }
}