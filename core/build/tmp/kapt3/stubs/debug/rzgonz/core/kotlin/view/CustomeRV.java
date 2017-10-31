package rzgonz.core.kotlin.view;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fJ\u0012\u0010\u0015\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0011R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lrzgonz/core/kotlin/view/CustomeRV;", "Landroid/widget/FrameLayout;", "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isLoading", "", "listener", "Lrzgonz/core/kotlin/view/CustomeRV$RVListener;", "recyclerAdapter", "Lrzgonz/core/kotlin/adapter/BaseRVAdapter;", "getAdapter", "", "rvListener", "onClick", "p0", "Landroid/view/View;", "onRefresh", "setAdapter", "adapter", "RVListener", "core_debug"})
public final class CustomeRV extends android.widget.FrameLayout implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, android.view.View.OnClickListener {
    private rzgonz.core.kotlin.adapter.BaseRVAdapter recyclerAdapter;
    private rzgonz.core.kotlin.view.CustomeRV.RVListener listener;
    private boolean isLoading;
    private java.util.HashMap _$_findViewCache;
    
    public final void listener(@org.jetbrains.annotations.NotNull()
    rzgonz.core.kotlin.view.CustomeRV.RVListener rvListener) {
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    rzgonz.core.kotlin.adapter.BaseRVAdapter adapter) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final rzgonz.core.kotlin.adapter.BaseRVAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onRefresh() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    public CustomeRV(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle, int defStyleRes) {
        super(null);
    }
    
    public CustomeRV(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyle) {
        super(null);
    }
    
    public CustomeRV(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public CustomeRV(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lrzgonz/core/kotlin/view/CustomeRV$RVListener;", "", "initAdapter", "Lrzgonz/core/kotlin/adapter/BaseRVAdapter;", "initRV", "Lrzgonz/core/kotlin/view/CustomeRV;", "onLoadItems", "", "limit", "", "offset", "core_debug"})
    public static abstract interface RVListener {
        
        @org.jetbrains.annotations.NotNull()
        public abstract rzgonz.core.kotlin.adapter.BaseRVAdapter initAdapter();
        
        public abstract void onLoadItems(int limit, int offset);
        
        @org.jetbrains.annotations.NotNull()
        public abstract rzgonz.core.kotlin.view.CustomeRV initRV();
    }
}