package rzgonz.core.kotlin.Interface;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH&\u00a8\u0006\f"}, d2 = {"Lrzgonz/core/kotlin/Interface/BaseViewList;", "Lrzgonz/core/kotlin/Interface/BaseView;", "onSetData", "", "status", "", "message", "", "items", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "core_debug"})
public abstract interface BaseViewList extends rzgonz.core.kotlin.Interface.BaseView {
    
    public abstract void onSetData(boolean status, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Object> items);
}