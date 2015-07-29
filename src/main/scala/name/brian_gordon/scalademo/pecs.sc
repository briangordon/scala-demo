trait Consumer[-T] {
    def consumeList(list: List[T])
}

trait Producer[+T] {
    def produceList(): List[T]
}

val consumer: Consumer[Number] = ???
val producer: Producer[Number] = ???

consumer.consumeList(List[Integer](1, 2))
producer.produceList(): List[Object]