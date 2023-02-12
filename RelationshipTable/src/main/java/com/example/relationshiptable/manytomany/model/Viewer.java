package com.example.relationshiptable.manytomany.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Viewer")
public class Viewer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nickname;

    @ManyToMany
    @JoinTable(
            name = "follower_streams",
            joinColumns = @JoinColumn(name = "viewer_id"),
            inverseJoinColumns = @JoinColumn(name="stream_id")
    )
    private List<Stream> followedStreams = new ArrayList<>();

    public Viewer(String nickname) {
        this.nickname = nickname;
    }

    public void followedStream(Stream stream){
        followedStreams.add(stream);
    }
}
