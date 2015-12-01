package com.kenan.lab.ChainOfResposibilityPattern;

public class SubtractNumbers implements Chain {

    private Chain nextInChain;

    public void setNextChain( final Chain nextChain ) {

        nextInChain = nextChain;

    }

    public void calculate( final Numbers request ) {

        if ( request.getCalcWanted() == "sub" ) {

            System.out.print( request.getNumber1() + " - " + request.getNumber2() + " = "
                    + ( request.getNumber1() - request.getNumber2() ) );

        } else {

            nextInChain.calculate( request );

        }

    }

}