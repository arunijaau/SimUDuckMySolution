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
public interface Duck {
    public abstract void performQuackSound();
    
    public abstract void performFly();
    
    public abstract void display();
    
    public abstract void setFlyingFeature(FlyingFeature flyingFeature);
    
    public abstract void setQuackingFeature(QuackingFeature quackingFeature);
    
}
