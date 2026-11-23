package iterator.iterators;

// Tomado de: https://refactoring.guru/design-patterns/iterator/java/example

import iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
