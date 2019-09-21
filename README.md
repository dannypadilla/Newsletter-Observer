# Observer Pattern in Kotlin

---

Using the Kotlin language:

(3pts) Create the Observer interface.

(3pts) Create the Subject interface.

(5pts) Create a Subscriber class (observer), in its own file (subcriber.kt) that implements Observer and:

Add methods subscribe() and unsubscribe() (these are not in the interface per se, but they are useful) to subscribe and unsubscribe from a publisher
These methods delegate these tasks to an instance of Subject that Subscriber keeps
Takes a publisher into its constructor and uses it as an instance variable to subscribe and unsubscribe
Has a field "name" that is assigned a value in the constructor


Implement a printNewsletter(newsletter: String) method, that is called every time update() is called. It prints the string passed into update.

(5pts) Create a NewsLetterPublisher class in its own file (newsletterpublisher.kt) that implements Subject.

Have it also be a singleton
Have it pass the string to be published into update() for each subscriber when it publishes.
Have it have a property x of how many millions have been raised.
Implement the setState() method to set x. Use this to update the class when needed. Ignore getState()


---

## In your main() function (put it in main.kt):

  1. (1pt) Instantiate the NewsLetterPublisher singleton.
  2. (2pts) Create 5 observers. Use the names "Mike", "Kevin", "Esmerelda", "Hector", "Letty".
  3. (2pts) Have all of them subscribe to the NewsLetterPublisher.
  4. (5pts) Have the publisher publish a "newsletter", that is, a string with the content "Exciting news! We have raised x million dollars!", where x is replaced by an int, starting at 1.
  Have the publisher publish this 20 times, with x incrementing each time.
  5. (2pts) After the newsletter earns 3 million dollars, Mike and Esmerelda lose interest. Have them unsubscribe.
  6. (2pts) After the newsletter earns 10 million dollars, Kevin and Hector lose interest. Have them unsubscribe.~