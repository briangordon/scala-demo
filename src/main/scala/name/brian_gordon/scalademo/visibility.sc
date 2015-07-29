class VisibilityModifiersDemo {
    private val field1 = 1
    private[this] val field2 = 2
    private[brian_gordon] val field3 = 3

//    def takeInstance(instance: VisibilityModifiersDemo) = {
//        instance.field1
//    }
}

//new VisibilityModifiersDemo().field3