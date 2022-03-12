package ru.netology

import org.junit.Test

import org.junit.Assert.*


internal class WallServiceTest {

    @Test
    fun testAdd() {

        val emptyPost: Post = newEmptyPost("Первый пост")
        val post = WallService.add(emptyPost)
        assertNotEquals(post.id, 0)
    }

    @Test
    fun testUpdateWhithId() {

        val emptyPost: Post = newEmptyPost("Первый пост")
        val post = WallService.add(emptyPost)
        val result: Boolean = WallService.update(post)

        assertTrue(result)
    }

    @Test
    fun testUpdateNotId() {
        val emptyPost: Post = newEmptyPost("Первый пост")
        val result: Boolean = WallService.update(emptyPost.copy(id = -1))

        assertFalse(result)
    }

    @Test
    fun testGetMaxIdInPostsEmpty() {

        val result: Int = WallService.getMaxIdInPosts()

        assertNotEquals(result, 0)
    }

    @Test
    fun testGetMaxIdInPostsNotEmpty() {

        val emptyPost: Post = newEmptyPost("Первый пост")
        WallService.add(emptyPost)
        val result: Int = WallService.getMaxIdInPosts()

        assertNotEquals(result, 1)
    }

    fun newEmptyPost(text: String): Post {

        val comment = Comment(0, true,true, true, true)
        val copyright = Copyright(0, "", "", "")
        val like = Like(0, false, true, true)
        val repost = Repost(0, false)
        val view = View(0)
        val donut = Donut(false, 0, "", true, "")
        val nowDateUnixtime = System.currentTimeMillis() / 1000L;  //(TimeZone.getTimeZone("Europe/Moscow"))
        val place = Place(0,"", 0, 0, 0,"", 0, 0, 0, 0, 0, "")
        val geo = Geo("", "", place)
        val postSource = PostSource("", "", "", "")
        val attachments = emptyArray<Attachment>()

        val result = Post(
            0,
            0,
            0,
            0,
            nowDateUnixtime.toInt(),
            text,
            0,
            0,
            false,
            comment,
            copyright,
            like,
            repost,
            view,
            0,
            postSource,
            attachments,
            geo,
            0,
            null,
            true,
            true,
            true,
            false,
            false,
            false,
            donut,
            0)

        return result;

    }

}