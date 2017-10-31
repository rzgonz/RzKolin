package codigo.id.kotlin.apps;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014\u00a8\u0006\b"}, d2 = {"Lcodigo/id/kotlin/apps/RzApps;", "Landroid/support/multidex/MultiDexApplication;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "Companion", "core_debug"})
public class RzApps extends android.support.multidex.MultiDexApplication {
    @org.jetbrains.annotations.Nullable()
    private static codigo.id.kotlin.apps.RzApps instance;
    public static final codigo.id.kotlin.apps.RzApps.Companion Companion = null;
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    public RzApps() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0007@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcodigo/id/kotlin/apps/RzApps$Companion;", "", "()V", "<set-?>", "Lcodigo/id/kotlin/apps/RzApps;", "instance", "getInstance", "()Lcodigo/id/kotlin/apps/RzApps;", "setInstance", "(Lcodigo/id/kotlin/apps/RzApps;)V", "core_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final synchronized codigo.id.kotlin.apps.RzApps getInstance() {
            return null;
        }
        
        private final void setInstance(codigo.id.kotlin.apps.RzApps p0) {
        }
        
        private Companion() {
            super();
        }
    }
}