package rzgonz.core.kotlin.presenter;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\fH\u0016R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lrzgonz/core/kotlin/presenter/BasePresenterImpl;", "V", "Lrzgonz/core/kotlin/Interface/BaseView;", "Lrzgonz/core/kotlin/presenter/BasePresenter;", "()V", "mView", "getMView", "()Lrzgonz/core/kotlin/Interface/BaseView;", "setMView", "(Lrzgonz/core/kotlin/Interface/BaseView;)V", "Lrzgonz/core/kotlin/Interface/BaseView;", "attachView", "", "view", "detachView", "core_debug"})
public class BasePresenterImpl<V extends rzgonz.core.kotlin.Interface.BaseView> implements rzgonz.core.kotlin.presenter.BasePresenter<V> {
    @org.jetbrains.annotations.NotNull()
    protected V mView;
    
    @org.jetbrains.annotations.NotNull()
    protected final V getMView() {
        return null;
    }
    
    protected final void setMView(@org.jetbrains.annotations.NotNull()
    V p0) {
    }
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.NotNull()
    V view) {
    }
    
    @java.lang.Override()
    public void detachView() {
    }
    
    public BasePresenterImpl() {
        super();
    }
}