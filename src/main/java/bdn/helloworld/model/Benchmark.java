package bdn.helloworld.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class Benchmark {

	@NotNull
	@Length(min=3, max=6)
	private String benchmarkIndex;

	public String getBenchmarkIndex() {
		return benchmarkIndex;
	}

	public void setBenchmarkIndex(String benchmarkIndex) {
		this.benchmarkIndex = benchmarkIndex;
	}
	
}
