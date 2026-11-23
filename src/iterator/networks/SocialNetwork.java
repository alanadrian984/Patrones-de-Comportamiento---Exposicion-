package iterator.networks;

// Tomado de: https://refactoring.guru/design-patterns/iterator/java/example

import iterator.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
