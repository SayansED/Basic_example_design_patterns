package PatternFactory;

import PatternStrategyStrategies.StrategyCalcLucro;
import Products.Produto;

public class MainFactory {

	public static void main(String[] args) {

		StrategyCalcLucro strategyCalcLucro = new StrategyCalcLucro();

		// Produto 01, com estrategia para calcular lucro, supondo que o lucro sempre
		// seja o dobro do preco (x 2)
		Produto p1 = new Produto("Produto 01", 500, CalculationFactory.criarCalculo("FIXO"));
		p1.calcularPrecoFinal();
		System.out.println(p1);
		
		p1.trocarStrategy(CalculationFactory.criarCalculo("LUCRO"));
		p1.calcularPrecoFinal();
		System.out.println(p1);
		
		p1.trocarStrategy(CalculationFactory.criarCalculo("PREJUIZO"));
		p1.calcularPrecoFinal();
		System.out.println(p1);
		
	}

}
