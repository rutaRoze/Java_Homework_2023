import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FaceBook implements SocialNetwork {

    private ArrayList<Friend> friends;

    public FaceBook() {
        friends = new ArrayList<>();
    }

    @Override
    public void addFriend(Friend friend) {

        if (friend == null) {
            throw new IllegalArgumentException();
        }

        if (!friends.contains(friend)) {
            friends.add(friend);
        }

    }

    @Override
    public int getNumberOfFriends() {
        return friends.size();
    }

    @Override
    public Friend findFriend(String s, String s1) throws FriendNotFoundException {

        if (s == null || s1 == null) {
            throw new IllegalArgumentException();
        }

        return friends.stream()
                .filter(friend -> friend.getFirstName().equals(s) && friend.getLastName().equals(s1))
                .findFirst()
                .orElseThrow(() -> new FriendNotFoundException(s, s1));

//        for (Friend friend : friends) {
//            if (friend.getFirstName().equals(s) && friend.getLastName().equals(s1)) {
//                return friend;
//            }
//        }
//
//        throw new FriendNotFoundException(s, s1);
    }

    @Override
    public Collection<Friend> findByCity(String city) {

        if (city == null) {
            throw new IllegalArgumentException();
        }

        return friends
                .stream()
                .filter(friend -> friend.getCity().equals(city))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<Friend> getOrderedFriends() {

//        Comparator<Friend> comparing = Comparator
//                .comparing(Friend::getCity)
//                .thenComparing(Friend::getLastName)
//                .thenComparing(Friend::getFirstName);

        List<Friend> sorted = friends.stream()
                .sorted(Comparator
                        .comparing(Friend::getCity)
                        .thenComparing(Friend::getLastName)
                        .thenComparing(Friend::getFirstName))
                .collect(Collectors.toList());

        return sorted;
    }
}
