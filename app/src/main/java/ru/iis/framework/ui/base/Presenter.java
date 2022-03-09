package ru.iis.framework.ui.base;

public interface Presenter<V extends BaseView> {
    //НЕ ТРОГАТЬ!
    /**
     * Called when view attached to presenter
     *
     * @param view
     */
    void attachView(V view);

    /**
     * Called when view is detached from presenter
     */
    void detachView();

    /**
     * @return true if view is attached to presenter
     */
    boolean isViewAttached();

    /**
     * @return view
     */
    V getView();
}
