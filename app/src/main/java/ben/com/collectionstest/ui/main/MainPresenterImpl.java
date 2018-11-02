package ben.com.collectionstest.ui.main;

public class MainPresenterImpl implements MainPresenter<MainView> {

    private MainView view;

    @Override
    public void attachView(MainView mainView) {
        this.view = mainView;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
