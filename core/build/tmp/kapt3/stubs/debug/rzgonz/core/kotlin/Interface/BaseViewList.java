package rzgonz.core.kotlin.Interface;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u00030\tj\u0006\u0012\u0002\b\u0003`\nH&\u00a8\u0006\u000b"}, d2 = {"Lrzgonz/core/kotlin/Interface/BaseViewList;", "Lrzgonz/core/kotlin/Interface/BaseView;", "onSetData", "", "status", "", "message", "", "items", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "core_debug"})
public abstract interface BaseViewList extends rzgonz.core.kotlin.Interface.BaseView {
    
    public abstract void onSetData(boolean status, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<?> items);
}