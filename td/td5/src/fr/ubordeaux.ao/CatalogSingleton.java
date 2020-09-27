public enum Catalog {
    INSTANCE;

    public final AtomicLong counter;

    Singleton() {
        counter = new AtomicLong(System.currentMillis());
    }

    /**
     * For unit testing.
     * @param value.
     */
    void setCounter(long value) {
        counter.set(value);
    }
}
