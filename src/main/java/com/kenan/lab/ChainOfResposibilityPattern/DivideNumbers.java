package com.kenan.lab.ChainOfResposibilityPattern;

public class DivideNumbers implements Chain {

    private Chain nextInChain;

    public void setNextChain( final Chain nextChain ) {

        nextInChain = nextChain;

    }

    public void calculate( final Numbers request ) {

        if ( request.getCalcWanted() == "div" ) {

            System.out.print( request.getNumber1() + " / " + request.getNumber2() + " = "
                    + ( request.getNumber1() / request.getNumber2() ) );

        } else {

            System.out.print( "Only works for add, sub, mult, and div" );

        }
    }
}