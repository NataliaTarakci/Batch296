package practices.practice04;

import java.util.ArrayList;

public class Q04_ArrayList_Playlist_2 {

    public static void main(String[] args) {

        /*
            Scenario:
        Imagine you're managing a playlist of songs on a music app.
        You have a list of songs in a specific order.
        Now, for some reason, you want to move
        the first few songs from the start of the playlist to the end.
        This is what we call rotating the playlist.
        And you want to rotate the playlist by 3 positions,
        you will move the first three songs to the end of the list.
            Task:
        Write a Java method that takes an ArrayList<String> representing a playlist of songs,
        and an integer n that represents how many songs you want to rotate.
        After rotating the playlist, the order of songs will be adjusted,
        with the first n songs moved to the end.
     */

        ArrayList<String> playList = new ArrayList<>();
        playList.add("song 1");
        playList.add("song 2");
        playList.add("song 3");
        playList.add("song 4");
        playList.add("song 5");
        playList.add("song 6");
        playList.add("song 7");
        playList.add("song 8");
        System.out.println("playList = " + playList);
        int numOfRotation = 4;
        int firstElement = 0;
        for (int i = 0; i < numOfRotation; i++) {

            String removedElement = playList.remove(firstElement);
            //System.out.println("playList after removing = " + playList);
            playList.add(removedElement);
            //System.out.println("playList after adding = " + playList);
        }
        System.out.println("rotated playList = " + playList);


//        ArrayList<String> playList = new ArrayList<>();
//        playList.add("song A");
//        playList.add("song B");
//        playList.add("song C");
//        playList.add("song D");
//        playList.add("song E");
//        playList.add("song F");
//        playList.add("song G");
//        playList.add("song H");
//        int rotaion = 5;
//        int n = 0;
//        for (int i = 0; i < rotaion; i++) {
//            String remvedEl = playList.remove(n);
//            playList.add(remvedEl);
//            System.out.println("playList = " + playList);
//
//        }
//        System.out.println(playList);
    }
}
