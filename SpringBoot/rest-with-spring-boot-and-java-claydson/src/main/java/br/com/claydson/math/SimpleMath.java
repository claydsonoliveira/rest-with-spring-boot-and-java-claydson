package br.com.claydson.math;


public class SimpleMath {

	public Double sum (Double numberOne, Double numberTwo)  {
		return (numberOne) + (numberTwo);
	}

	public Double sub (Double numberOne, Double numberTwo) {
		return (numberOne) - (numberTwo);
	}

	public Double mut (Double numberOne, Double numberTwo) {
		return (numberOne) * (numberTwo);
	}

	public Double div (Double numberOne, Double numberTwo) {
		return (numberOne) / (numberTwo);
	}
	
	public Double raiz (Double number) {
		return Math.sqrt((number));
	}

	public Double media (Double numberOne, Double numberTwo, Double numberThree) {

		return ((numberOne) + (numberTwo) + (numberThree)) / 3;
	}
	
	
}
