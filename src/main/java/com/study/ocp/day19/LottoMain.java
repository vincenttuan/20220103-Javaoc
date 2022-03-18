package com.study.ocp.day19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LottoMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		ExecutorService service = Executors.newCachedThreadPool();
		Collection<Callable<Map<String, Integer>>> collection = new ArrayList<>();
		collection.add(new Lotto("john"));
		collection.add(new Lotto("mary"));
		collection.add(new Lotto("bobo"));
		collection.add(new Lotto("helen"));
		collection.add(new Lotto("angle"));
		List<Future<Map<String, Integer>>> results = service.invokeAll(collection);
		for(Future<Map<String, Integer>> future : results) {
			System.out.println(future.get());
		}

	}

}
