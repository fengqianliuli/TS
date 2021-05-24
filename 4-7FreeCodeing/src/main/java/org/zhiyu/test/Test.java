package org.zhiyu.test;

import com.sun.javaws.Main;
import org.zhiyu.player.PlayList;
import org.zhiyu.player.Song;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
//        Test.testSong();
//        Test.testPlayList();
        Song song1 = new Song("s001", "两只老虎", "小太阳");
        Song song2 = new Song("s002", "小燕子", "风车");
        Song song3 = new Song("s003", "茉莉花", "彩虹");

        PlayList mainPlayList = new PlayList("主播放列表");
        mainPlayList.addToPlayList(song1);
        mainPlayList.addToPlayList(song2);
        mainPlayList.addToPlayList(song3);

        List<PlayList> playLists = new ArrayList<>();
        playLists.add(mainPlayList);

        Test.exportPlayList("主播放列表", playLists);
    }

    public static void testSong() {
        Song song1 = new Song("s001", "两只老虎", "小太阳");
        Song song2 = new Song("s002", "小燕子", "风车");
        Song song3 = new Song("s003", "茉莉花", "彩虹");
        Song song4 = new Song("s003", "茉莉花", "彩虹");
        System.out.println(song1);
        System.out.println("song1 == song3 ? " + (song1.equals(song3)));
        System.out.println("song3 == song4 ? " + (song3.equals(song4)));
    }

    public static void testPlayList() {
        Song song1 = new Song("s001", "两只老虎", "小太阳");
        Song song2 = new Song("s002", "小燕子", "风车");
        Song song3 = new Song("s003", "茉莉花", "彩虹");
        Song song4 = new Song("s003", "茉莉花", "彩虹");

        PlayList mainPlayList = new PlayList("主播放列表");
        mainPlayList.addToPlayList(song1);
        mainPlayList.addToPlayList(song2);
        mainPlayList.addToPlayList(song3);
        mainPlayList.addToPlayList(song4);
//        mainPlayList.displayAllSong();

        Song song = mainPlayList.searchSongByIdOrName("s002");
        if (song == null) {
            System.out.println("该歌曲不存在");
        } else {
            System.out.println("查询到的歌曲信息为：");
            System.out.println(song);
        }
    }

    public static void exportPlayList(String playListName, List<PlayList> playListList) {
        if (playListName == null || "".equals(playListName)) {
            return;
        }
        if (playListList != null && playListList.size() > 0) {
            List<PlayList> collect = playListList.stream()
                    .filter(x -> playListName.equals(x.getPlayListName()))
                    .collect(Collectors.toList());
            if (collect.size() > 0) {
                PlayList playList = collect.get(0);

//                File file = new File("../../../../resource/名称.txt");
                FileOutputStream fos;
                try {
                    fos = new FileOutputStream("名称.txt");
                    StringBuilder sb = new StringBuilder();
                    List<Song> musicList = playList.getMusicList();
                    if (musicList != null && musicList.size() > 0) {
                        musicList.forEach(x -> sb.append(x.getName()).append("\n"));
                        fos.write(sb.toString().getBytes(StandardCharsets.UTF_8));
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
