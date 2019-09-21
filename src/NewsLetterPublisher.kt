object NewsLetterPublisher: Subject {

    private var observers = mutableListOf<Observer>()
    private var x: Int = 1

    override fun registerObserver(ob: Observer) {
        this.observers.add(ob)
        
        if (ob is Subscriber) {
            ob.subscribe(this)
        }
    }

    override fun removeObserver(ob: Observer) {
        var index: Int = this.observers.indexOf(ob)
        if (index >= 0) {
            var sub: Observer = this.observers[index]
            if (sub is Subscriber) // why can't I cast?
                sub.unsubscribe() // unsub.. kinda don't need this
            this.observers.removeAt(index) // remove person from observer list
        }
    }

    // Pass reference of Subject to each Observer
    override fun notifyObservers(msg: String) {
        for (observer in this.observers) {
            observer.update(msg)
        }
    }

    fun publish(x: Int) {
        this.x  = x
        this.notifyObservers("Exciting news! We have raised $x million dollars!")
    }

    fun getX(): Int {
        return this.x
    }

}