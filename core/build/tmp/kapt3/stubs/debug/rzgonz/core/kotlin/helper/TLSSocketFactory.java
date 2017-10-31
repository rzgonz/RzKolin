package rzgonz.core.kotlin.helper;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0017J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0017J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0017J\u0012\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lrzgonz/core/kotlin/helper/TLSSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "()V", "internalSSLSocketFactory", "createSocket", "Ljava/net/Socket;", "host", "Ljava/net/InetAddress;", "port", "", "address", "localAddress", "localPort", "s", "", "autoClose", "", "localHost", "enableTLSOnSocket", "socket", "getDefaultCipherSuites", "", "()[Ljava/lang/String;", "getSupportedCipherSuites", "systemDefaultTrustManager", "Ljavax/net/ssl/X509TrustManager;", "core_debug"})
public final class TLSSocketFactory extends javax.net.ssl.SSLSocketFactory {
    private final javax.net.ssl.SSLSocketFactory internalSSLSocketFactory = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String[] getSupportedCipherSuites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String[] getDefaultCipherSuites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.net.Socket createSocket(@org.jetbrains.annotations.NotNull()
    java.net.Socket s, @org.jetbrains.annotations.NotNull()
    java.lang.String host, int port, boolean autoClose) throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.net.Socket createSocket(@org.jetbrains.annotations.NotNull()
    java.lang.String host, int port) throws java.io.IOException, java.net.UnknownHostException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.net.Socket createSocket(@org.jetbrains.annotations.NotNull()
    java.lang.String host, int port, @org.jetbrains.annotations.NotNull()
    java.net.InetAddress localHost, int localPort) throws java.io.IOException, java.net.UnknownHostException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.net.Socket createSocket(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress host, int port) throws java.io.IOException {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.net.Socket createSocket(@org.jetbrains.annotations.NotNull()
    java.net.InetAddress address, int port, @org.jetbrains.annotations.NotNull()
    java.net.InetAddress localAddress, int localPort) throws java.io.IOException {
        return null;
    }
    
    private final java.net.Socket enableTLSOnSocket(java.net.Socket socket) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final javax.net.ssl.X509TrustManager systemDefaultTrustManager() {
        return null;
    }
    
    public TLSSocketFactory() throws java.security.KeyManagementException, java.security.NoSuchAlgorithmException {
        super();
    }
}