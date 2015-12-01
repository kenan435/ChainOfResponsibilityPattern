package com.kenan.lab.ChainOfResposibilityPattern;

public class MultNumbers implements Chain {

    private Chain nextInChain;

    public void setNextChain( final Chain nextChain ) {

        nextInChain = nextChain;

    }

    public void calculate( final Numbers request ) {

        if ( request.getCalcWanted() == "mult" ) {

            System.out.print( request.getNumber1() + " * " + request.getNumber2() + " = "
                    + ( request.getNumber1() * request.getNumber2() ) );

        } else {

            nextInChain.calculate( request );

        }

    }


}