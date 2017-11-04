package br.inatel.dm110.CalcServImpl;

import br.inatel.dm110.helloCalculator.HelloCalculator;
import br.inatel.dm110.helloCalculator.Results;

public class CalcServiceImpl implements HelloCalculator {
	
	@Override
	public Results sum(int first, int second) {
		Results result = new Results();
		result.setFirst(first);
		result.setSecond(second);
		Integer sum = result.getSum();
		result.setSum(sum);
		return result;
	}

	@Override
	public Results sub(int first, int second) {
		Results result = new Results();
		result.setFirst(first);
		result.setSecond(second);
		Integer sub = result.getSub();
		result.setSub(sub);
		return result;
	}

	
	
}
