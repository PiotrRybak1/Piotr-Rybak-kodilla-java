package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(56473, "Jordan23", 'M', 1980, 7, 18, 23));
        userList.add(new ForumUser(56483, "Berkamp40", 'M', 1980, 7, 18, 0));
        userList.add(new ForumUser(55444, "Nika", 'F', 1980, 12, 12, 0));
        userList.add(new ForumUser(54678, "Peepa30", 'F', 1990, 8, 18, 73));
        userList.add(new ForumUser(50980, "ProfesorK", 'M', 1999, 12, 18, 0));
        userList.add(new ForumUser(54367, "Motyl55", 'F', 1975, 7, 7, 7));
        userList.add(new ForumUser(53478, "Barbi3", 'F', 1996, 1, 15, 8));
        userList.add(new ForumUser(55556, "Shaq15", 'M', 2005, 7, 18, 130));
        userList.add(new ForumUser(52369, "Ziuta48", 'F', 1972, 1, 1, 0));
        userList.add(new ForumUser(50000, "Gru11", 'M', 1980, 12, 23, 32));
        userList.add(new ForumUser(57600, "Grazka23", 'F', 1990, 8, 2, 53));
        userList.add(new ForumUser(55005, "StrażakSam", 'M', 1965, 1, 19, 300));
        userList.add(new ForumUser(51256, "KidKazoom13", 'M', 1971, 3, 30, 0));
    }
        public List<ForumUser> getList(){
            return new ArrayList<>(userList);
        }

    }








