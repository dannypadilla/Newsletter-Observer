interface Subject {

    fun registerObserver(ob: Observer)

    fun removeObserver(ob: Observer)

    fun notifyObservers(msg: String)

}