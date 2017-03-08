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

    protected AnyDuck(QuackingFeature quackingFeature, FlyingFeature flyingFeature) {
        this.setQuackingFeature(quackingFeature);
        this.setFlyingFeature(flyingFeature);
    }
     
    public void performQuackSound() {
        quackingFeature.quack();
    }
    
    public void performFly() {
        flyingFeature.fly();
    }

    public void setQuackingFeature(QuackingFeature quackingFeature) {
        if (quackingFeature == null) {
            throw new IllegalArgumentException("Error: Quacking feature should not be null.");
        }
        this.quackingFeature = quackingFeature;
    }
    
    public void setFlyingFeature(FlyingFeature flyingFeature) {
        if (flyingFeature == null) {
            throw new IllegalArgumentException("Error: Flying feature should not be null.");
        }
        this.flyingFeature = flyingFeature;
    }
}
