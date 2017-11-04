package br.inatel.dm110.helloCalculator;

public class Results {
	int first;
	int second;
	Integer sum;
	Integer sub;
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public Integer getSum() {
		int soma = first+second;
		return soma;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public Integer getSub() {
		int sub = first-second;
		return sub;
	}
	public void setSub(Integer sub) {
		this.sub = sub;
	}
	
}
