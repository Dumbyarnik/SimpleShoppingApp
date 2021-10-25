package ui.view;


public class SimpleShoppingAppView {
  BegruessungView begruessungView;
  MenueView menueView;

  public SimpleShoppingAppView(){
      begruessungView = new BegruessungView();
      menueView = new MenueView();
  }

  public void run() {
      begruessungView.run();
      menueView.run();
  }
  


}
