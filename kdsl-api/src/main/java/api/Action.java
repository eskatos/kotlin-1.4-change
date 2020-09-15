package api;

@HasImplicitReceiver
public interface Action<T> {
    void execute(T target);
}
