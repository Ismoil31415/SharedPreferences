package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adapter.FeedAdapter
import com.adapter.StoryAdapter
import com.model.Restaurant
import com.model.Story

class MainActivity : AppCompatActivity() {
    lateinit var recyclerFeed: RecyclerView
    lateinit var recyclerStory: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerFeed = findViewById<RecyclerView>(R.id.recyclerFeed)
        recyclerFeed.layoutManager = GridLayoutManager(this, 2)
        recyclerStory = findViewById<RecyclerView>(R.id.recyclerStory)
        recyclerStory.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        refreshStoryAdapter(getAllFilters())
        refreshFeedAdapter(getAllFeeds())
    }

    private fun getAllFeeds(): ArrayList<Restaurant> {
        val feeds: ArrayList<Restaurant> = ArrayList<Restaurant>()
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        feeds.add((Restaurant(R.drawable.images, "Kamolon oshi", "Chilonzor, Oliy Majlis Ro`parasi")))
        return feeds
    }

    private fun getAllFilters(): ArrayList<Story> {
        val filters: ArrayList<Story> = ArrayList<Story>()
        filters.add(Story(R.drawable.images, "Lag`mon"))
        filters.add(Story(R.drawable.images, "Kamolon To`y oshi"))
        filters.add(Story(R.drawable.images, "Lag`mon"))
        filters.add(Story(R.drawable.images, "Kamolon To`y oshi"))
        filters.add(Story(R.drawable.images, "Lag`mon"))
        filters.add(Story(R.drawable.images, "Kamolon To`y oshi"))
        filters.add(Story(R.drawable.images, "Lag`mon"))
        filters.add(Story(R.drawable.images, "Kamolon To`y oshi"))
        filters.add(Story(R.drawable.images, "Lag`mon"))
        filters.add(Story(R.drawable.images, "Kamolon To`y oshi"))
        filters.add(Story(R.drawable.images, "Lag`mon"))
        filters.add(Story(R.drawable.images, "Kamolon To`y oshi"))
        filters.add(Story(R.drawable.images, "Lag`mon"))
        filters.add(Story(R.drawable.images, "Kamolon To`y oshi"))
        filters.add(Story(R.drawable.images, "Lag`mon"))
        filters.add(Story(R.drawable.images, "Kamolon To`y oshi"))

        return filters
    }

    private fun refreshFeedAdapter(feeds: ArrayList<Restaurant>) {
        val adapter = FeedAdapter(this, feeds)
        recyclerFeed.adapter = adapter
    }

    private fun refreshStoryAdapter(chats: ArrayList<Story>) {
        val adapter = StoryAdapter(this, chats)
        recyclerStory.adapter = adapter
    }

}