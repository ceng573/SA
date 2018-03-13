/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa;

import java.util.Random;

/**
 *
 * @author y
 */
public class Test {

    private static double e = Math.E;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test test = new Test();
		double z = test.fitness1(-0.0898,0.7126);
		System.out.println("fitness1 z: "+z);
		System.out.println("fitness2 z: "+test.fitness2(-0.0303, 1.5455));
		
		Random random = new Random();
		
		for(int i=0 ; i<5; i++) {
			System.out.println("random number "+i+": "+ random.nextGaussian());
		}
	}
	
	public double fitness1(double x, double y) {
		return (4 - 2.1*(Math.pow(x, 2))+(Math.pow(x, 4))/3)*Math.pow(x, 2)
				+ x*y
				+ (-4+4*Math.pow(y,2))*Math.pow(y, 2) ;
	}
	
	public double fitness2(double x, double y) {
		return 3 * Math.pow(1-x,2)
					*Math.pow(e, ( - Math.pow(x, 2) - ( Math.pow(y+1,2) )) )
				-10 * (x/5 - Math.pow(x, 2) - Math.pow(y,5)  )
					*( Math.pow(e, ( - Math.pow(x,2) - Math.pow(y,2) ) ) )
				-(Math.pow(e, ( ( - Math.pow(x+1,2)) - Math.pow(y, 2) ) ) / 3);
	}
	
	public double randomInterval(int x, int y) {
		java.util.Random random = new java.util.Random();
	
		return 0.1;
	}
    
}
