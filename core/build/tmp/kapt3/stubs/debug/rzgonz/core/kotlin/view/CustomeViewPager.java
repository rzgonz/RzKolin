package rzgonz.core.kotlin.view;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lrzgonz/core/kotlin/view/CustomeViewPager;", "Landroid/support/v4/view/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "listener", "Lrzgonz/core/kotlin/view/CustomeViewPager$PagerListener;", "getListener", "()Lrzgonz/core/kotlin/view/CustomeViewPager$PagerListener;", "setListener", "(Lrzgonz/core/kotlin/view/CustomeViewPager$PagerListener;)V", "setAdapter", "", "activity", "Landroid/support/v4/app/FragmentActivity;", "Landroid/support/v7/app/AppCompatActivity;", "PagerListener", "SectionsPagerAdapter", "core_debug"})
public final class CustomeViewPager extends android.support.v4.view.ViewPager {
    @org.jetbrains.annotations.NotNull()
    public rzgonz.core.kotlin.view.CustomeViewPager.PagerListener listener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final rzgonz.core.kotlin.view.CustomeViewPager.PagerListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    rzgonz.core.kotlin.view.CustomeViewPager.PagerListener p0) {
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AppCompatActivity context) {
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentActivity activity) {
    }
    
    public CustomeViewPager(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lrzgonz/core/kotlin/view/CustomeViewPager$PagerListener;", "", "addFragment", "Ljava/util/ArrayList;", "Landroid/support/v4/app/Fragment;", "Lkotlin/collections/ArrayList;", "initViewPager", "", "initViewTabLayout", "", "core_debug"})
    public static abstract interface PagerListener {
        
        public abstract int initViewPager();
        
        public abstract void initViewTabLayout();
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.util.ArrayList<android.support.v4.app.Fragment> addFragment();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0016\u00a8\u0006\f"}, d2 = {"Lrzgonz/core/kotlin/view/CustomeViewPager$SectionsPagerAdapter;", "Landroid/support/v4/app/FragmentStatePagerAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "(Lrzgonz/core/kotlin/view/CustomeViewPager;Landroid/support/v4/app/FragmentManager;)V", "getCount", "", "getItem", "Landroid/support/v4/app/Fragment;", "position", "getPageTitle", "", "core_debug"})
    public final class SectionsPagerAdapter extends android.support.v4.app.FragmentStatePagerAdapter {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.support.v4.app.Fragment getItem(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.CharSequence getPageTitle(int position) {
            return null;
        }
        
        public SectionsPagerAdapter(@org.jetbrains.annotations.NotNull()
        android.support.v4.app.FragmentManager fm) {
            super(null);
        }
    }
}