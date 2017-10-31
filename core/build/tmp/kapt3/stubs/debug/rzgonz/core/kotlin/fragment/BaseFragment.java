package rzgonz.core.kotlin.fragment;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u00052\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\rJ&\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0010H\u0016J\u0012\u0010\"\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0010H\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010\'\u001a\u00020\rH\u0016J\u0014\u0010(\u001a\u00020\u001e*\u00020)2\u0006\u0010*\u001a\u00020\rH\u0016R\u0018\u0010\u0007\u001a\u00028\u0001X\u00a4\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lrzgonz/core/kotlin/fragment/BaseFragment;", "V", "Lrzgonz/core/kotlin/Interface/BaseView;", "P", "Lrzgonz/core/kotlin/presenter/BasePresenter;", "Landroid/support/v4/app/Fragment;", "()V", "mPresenter", "getMPresenter", "()Lrzgonz/core/kotlin/presenter/BasePresenter;", "setMPresenter", "(Lrzgonz/core/kotlin/presenter/BasePresenter;)V", "title", "", "kotlin.jvm.PlatformType", "attachStyle", "", "()Ljava/lang/Integer;", "getContext", "Landroid/content/Context;", "getTitle", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "setTitle", "showError", "stringResId", "error", "showMessage", "srtResId", "message", "loadImageWeb", "Landroid/widget/ImageView;", "url", "core_debug"})
public abstract class BaseFragment<V extends rzgonz.core.kotlin.Interface.BaseView, P extends rzgonz.core.kotlin.presenter.BasePresenter<? super V>> extends android.support.v4.app.Fragment implements rzgonz.core.kotlin.Interface.BaseView {
    private java.lang.String title;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract P getMPresenter();
    
    protected abstract void setMPresenter(@org.jetbrains.annotations.NotNull()
    P p0);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
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
    public void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public void loadImageWeb(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer attachStyle() {
        return null;
    }
    
    public BaseFragment() {
        super();
    }
}