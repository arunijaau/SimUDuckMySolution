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
public class MuteSound implements QuackingFeature{

    @Override
    public final void quack() {
        System.out.println("No sound.");
    }
    
}
