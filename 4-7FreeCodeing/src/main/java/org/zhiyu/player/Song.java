package org.zhiyu.player;

import java.util.Objects;

public class Song {
    private String id;
    private String name;
    private String singer;

    public Song(String id, String name, String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id.equals(song.id) && name.equals(song.name) && singer.equals(song.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, singer);
    }

    @Override
    public String toString() {
        return "歌曲信息:" +
                "id='" + id + '\'' +
                ", 歌曲名称='" + name + '\'' +
                ", 演唱者='" + singer + '\'';
    }
}
