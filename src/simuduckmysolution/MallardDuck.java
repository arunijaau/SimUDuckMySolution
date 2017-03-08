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
public class MallardDuck extends AnyDuck implements Duck {

    public MallardDuck(QuackingFeature quackingFeature, FlyingFeature flyingFeature) {
        super(quackingFeature,flyingFeature);
    }

    @Override
    public final void display() {
        System.out.println("I'm a Mallard duck.");
    }

}
