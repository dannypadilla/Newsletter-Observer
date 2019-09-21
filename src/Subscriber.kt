class Subscriber(name: String, sub: Subject?): Observer {

    private var name: String = name
    private var sub: Subject? = sub
    private var maxSub: Int = 0 // was going to try and handle the unsub

    private fun printNewsletter(str: String) {
        println(str)
    }

    override fun update(msg: String) {
        this.printNewsletter(msg)
    }

    fun subscribe(sub: Subject?) {
        this.sub = sub
        println("$name has just subscribed!!")
    }

    fun unsubscribe() {
        this.sub = null
        println("$name has just unsubscribed...")
    }

    fun setMaxSub(max: Int) {
        this.maxSub = max
    }

}