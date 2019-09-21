
/* **********
*
*  Main Driver
*
* *********** */

fun main() {

    /* Instantiate the NewsLetterPublisher singleton */
    var nlp: NewsLetterPublisher = NewsLetterPublisher


    /* Create 5 users. Use the names "Mike", "Kevin", "Esmerelda", "Hector", "Letty". */
    var mike: Subscriber = Subscriber("Mike", null)
    var kevin: Subscriber = Subscriber("Kevin", null)
    var esme: Subscriber = Subscriber("Esmerelda", null)
    var hector: Subscriber = Subscriber("Hector", null)
    var letty: Subscriber = Subscriber("Letty", null)


    /* Have all of them subscribe to the NewsLetterPublisher */
    nlp.registerObserver(mike)
    nlp.registerObserver(kevin)
    nlp.registerObserver(esme)
    nlp.registerObserver(hector)
    nlp.registerObserver(letty)


    /*
    *  Have the publisher publish a "newsletter", that is, a string with the content
    *  "Exciting news! We have raised x million dollars!",
    *  where x is replaced by an int, starting at 1.
    *  Have the publisher publish this 20 times, with x incrementing each time.
    *  */
    for (x in 1..20) {
        println()
        nlp.publish(x)

        if (x == 3) { /* After the newsletter earns 3 million dollars, Mike and Esmerelda lose interest. Have them unsubscribe. */
            println()
            nlp.removeObserver(mike)
            nlp.removeObserver(esme)

        } else if (x == 10) { /* After the newsletter earns 10 million dollars, Kevin and Hector lose interest. Have them unsubscribe. */
            println()
            nlp.removeObserver(kevin)
            nlp.removeObserver(hector)
        }
    }


}