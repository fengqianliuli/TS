package org.zhiyu.player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayList {
    // 播放列表的名称
    private String playListName;
    // 播放列表的歌曲集合
    private List<Song> musicList;

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Song> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }

    public PlayList(String playListName) {
        this.playListName = playListName;
        this.musicList = new ArrayList<>();
    }

    public void addToPlayList(Song song) {
        if (!musicList.contains(song)) {
            musicList.add(song);
            System.out.println("歌曲添加成功!");
        } else {
            System.out.println("歌曲已存在该播放列表，添加失败！");
        }
    }

    /**
     * 显示播放列表所有歌曲信息
     */
    public void displayAllSong() {
        System.out.println("播放列表中的所有歌曲为:");
        musicList.forEach(System.out::println);
    }

    /**
     * 根据歌曲id或者名称查询歌曲信息
     * @param key 歌曲名称
     * @return 歌曲
     */
    public Song searchSongByIdOrName(String key) {
        List<Song> songList = musicList.stream()
                .filter(x -> key.equals(x.getName()) || key.equals(x.getId()))
                .collect(Collectors.toList());
        if (songList.size() == 0) {
            return null;
        } else {
            return songList.get(0);
        }
    }

    /**
     * 修改播放列表中的歌曲信息
     * @param id 歌曲id
     * @param song 新的歌曲信息
     */
    public void updateSong(String id, Song song) {
        Song song1 = this.searchSongByIdOrName(id);
        if (song1 == null) {
            System.out.println("没有找到id为: " + id + " 的歌曲,更新失败！");
        } else {
            musicList.remove(song1);
            musicList.add(song);
            System.out.println("修改成功！");
        }
    }

    public void deleteSong(String id) {
        Song song1 = this.searchSongByIdOrName(id);
        if (song1 == null) {
            System.out.println("没有找到id为: " + id + " 的歌曲,删除失败！");
        } else {
            musicList.remove(song1);
            System.out.println("删除成功！");
        }
    }

    @Override
    public String toString() {
        return "PlayList{" +
                "playListName='" + playListName + '\'' +
                ", musicList=" + musicList +
                '}';
    }
}
