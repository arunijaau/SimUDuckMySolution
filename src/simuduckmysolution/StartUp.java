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
public class StartUp {
    public static void main(String[] args) {
        Duck duck = new RubberDuck(new MuteSound(), new FlyNoWay());
        duck.display();
        duck.performFly();
        duck.performQuackSound();
        duck.setFlyingFeature(new FlyWithRocketPower());
        duck.performFly();
        
        
    }
}
