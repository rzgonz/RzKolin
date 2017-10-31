package rzgonz.core.kotlin.Interface;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0005H&J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000bH&J\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH&\u00a8\u0006\u0012"}, d2 = {"Lrzgonz/core/kotlin/Interface/BaseView;", "", "getContext", "Landroid/content/Context;", "initLayout", "", "initUI", "", "showError", "stringResId", "error", "", "showMessage", "srtResId", "message", "loadImageWeb", "Landroid/widget/ImageView;", "url", "core_debug"})
public abstract interface BaseView {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.content.Context getContext();
    
    public abstract int initLayout();
    
    public abstract void initUI();
    
    public abstract void showError(@org.jetbrains.annotations.Nullable()
    java.lang.String error);
    
    public abstract void showError(@android.support.annotation.StringRes()
    int stringResId);
    
    public abstract void showMessage(@android.support.annotation.StringRes()
    int srtResId);
    
    public abstract void showMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message);
    
    public abstract void loadImageWeb(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String url);
}