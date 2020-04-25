package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int idPesel;
    private final String nickName;
    private final char sex;
    private final LocalDate dateBirth;
    private final int postsNumber;

    public ForumUser(int idPesel, String nickName, char sex, int yearOfBirth,
                     int monthOfBirth, int dayOfBirth, int postsNumber) {
        this.idPesel = idPesel;
        this.nickName = nickName;
        this.sex = sex;
        this.dateBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;
    }

    public int getIdPesel() {
        return idPesel;
    }

    public String getNickName() {
        return nickName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getIdPesel() == forumUser.getIdPesel() &&
                getSex() == forumUser.getSex() &&
                getPostsNumber() == forumUser.getPostsNumber() &&
                getNickName().equals(forumUser.getNickName()) &&
                getDateBirth().equals(forumUser.getDateBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPesel(), getNickName(), getSex(), getDateBirth(), getPostsNumber());
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idPesel=" + idPesel +
                ", nickName='" + nickName + '\'' +
                ", sex=" + sex +
                ", dateBirth=" + dateBirth +
                ", postsNumber=" + postsNumber +
                '}';
    }
}

