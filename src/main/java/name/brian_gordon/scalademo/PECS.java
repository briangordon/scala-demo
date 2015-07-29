package name.brian_gordon.scalademo;

import java.util.List;

/**
 * @author Brian Gordon
 */
interface Consumer<T> {
	void consumeList(List<T> values);
}

interface Producer<T> {
	List<T> produceList();
}

public class PECS<T> {
	Consumer<? super T> consumer;
	Producer<? extends T> producer;
}
