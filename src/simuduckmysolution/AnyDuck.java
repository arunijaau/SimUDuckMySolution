/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuduckmysolution;

/**
 *
 * @author Aruni
 */
public abstract class AnyDuck {
    private QuackingFeature quackingFeature;
    private FlyingFeature flyingFeature;
    private DisplayProvider displayProvider;

    protected AnyDuck(QuackingFeature quackingFeature, FlyingFeature flyingFeature, DisplayProvider displayProvider) {
        this.setQuackingFeature(quackingFeature);
        this.setFlyingFeature(flyingFeature);
        this.setDisplayProvider(displayProvider);
    }
     
    public final void performQuackSound() {
        quackingFeature.quack();
    }
    
    public final void performFly() {
        flyingFeature.fly();
    }
    
    public final void performDisplay(){
        displayProvider.display();
    }
    
    public final void setQuackingFeature(QuackingFeature quackingFeature) {
        if (quackingFeature == null) {
            throw new IllegalArgumentException("Error: Quacking feature should not be null.");
        }
        this.quackingFeature = quackingFeature;
    }
    
    public final void setFlyingFeature(FlyingFeature flyingFeature) {
        if (flyingFeature == null) {
            throw new IllegalArgumentException("Error: Flying feature should not be null.");
        }
        this.flyingFeature = flyingFeature;
    }

    public final void setDisplayProvider(DisplayProvider displayProvider) {
        if(displayProvider == null){
            throw new IllegalArgumentException("Error: Display mode should not be null.");
        }
        this.displayProvider = displayProvider;
    }
}
