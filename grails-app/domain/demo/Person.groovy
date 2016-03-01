package demo

class Person {
    String name

    static transients = ['images']

    Collection getImages() {
        throw new UnsupportedOperationException()
    }

    static constraints = {
        name matches: /[A-Z].*/
    }
}
