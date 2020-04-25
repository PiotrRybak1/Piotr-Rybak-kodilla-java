package kodilla.stream;

import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        System.out.println("\nFiltering required - men\n");

        Forum forum = new Forum();
        forum.getList().stream()
                .filter(user -> 'M' == user.getSex())
                .forEach(System.out::println);

        System.out.println("\nFiltering required - users over 20 years old\n");

        forum.getList().stream()
                .filter(user -> user.getDateBirth().getYear() <= 2000)
                .forEach(System.out::println);

        System.out.println("\nFiltering required - users with at least one post\n ");

        forum.getList().stream()
                .filter(user -> user.getPostsNumber() >= 1)
                .forEach(System.out::println);


        System.out.println("\nHashMap users with the key IdPesel\n");


        Map<Integer, ForumUser> par = forum.getList().stream()
                .collect(Collectors.toMap(ForumUser::getIdPesel, user -> user));

        System.out.println("# elements: " + par.size());
        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}