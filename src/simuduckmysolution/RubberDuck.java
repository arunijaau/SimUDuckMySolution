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
public class RubberDuck extends AnyDuck implements Duck{

    public RubberDuck(QuackingFeature quackingFeature, FlyingFeature flyingFeature, DisplayProvider displayProvider) {
        super(quackingFeature, flyingFeature, displayProvider);
    }
    
}
