package com.example.myapplication.myapplication.instaui.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.myapplication.instaui.PostDetails
import com.example.myapplication.myapplication.instaui.R
import com.example.myapplication.myapplication.instaui.StoryDetails

@Composable
fun HomeScreen(){
    Surface(color = white) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Transparent)){
            Column {
                AppNameSection()
                StoryRow(stories = listOf(
                    StoryDetails(name = "Your Story",
                        displayPicture = painterResource(id = R.drawable.gvm)),
                    StoryDetails(name = "_prithvi_raj._",
                        displayPicture = painterResource(id = R.drawable.prithvi)),
                    StoryDetails(name = "_iamanushka",
                        displayPicture = painterResource(id = R.drawable.anushka)),
                    StoryDetails(name = "_iam_andavar",
                        displayPicture = painterResource(id = R.drawable.kamal)),
                    StoryDetails(name = "_.ljp._",
                        displayPicture = painterResource(id = R.drawable.ljp)),
                    StoryDetails(name = "_.vijay_sethu._",
                        displayPicture = painterResource(id = R.drawable.vjs)),
                    StoryDetails(name = "_nayan_tharaa",
                        displayPicture = painterResource(id = R.drawable.nayan)),
                    StoryDetails(name = "_kunchacks__",
                        displayPicture = painterResource(id = R.drawable.kunchaks)),
                    StoryDetails(name = "_tovino_thomas._",
                        displayPicture = painterResource(id = R.drawable.tovino)),
                    StoryDetails(name = "_urindianflash_._",
                        displayPicture = painterResource(id = R.drawable.minnal))
                ))
                Posts(posts = listOf(PostDetails(
                    name = "_car_enthus",
                    dp = painterResource(id = R.drawable.instapostss),
                    post = painterResource(
                        id = R.drawable.instapostss),
                    caption = "New Beast",
                    likes = 20,
                    comments = 2,
                    timeStamp = 30
                ),PostDetails(
                    name = "_.memer._",
                    dp = painterResource(id = R.drawable.movieinstapost),
                    post = painterResource(id = R.drawable.movieinstapost),
                    comments = 12,
                    caption = "valimai update",
                    likes = 200,
                    timeStamp = 60
                ),PostDetails(
                    name = "_.mottameme._",
                    dp = painterResource(id = R.drawable.instaposts),
                    post = painterResource(id = R.drawable.instaposts),
                    comments = 30,
                    caption = "hahaha..",
                    likes = 247,
                    timeStamp = 2
                ),PostDetails(
                    name = "_tovino_thomas._",
                    dp = painterResource(id = R.drawable.tovino),
                    post = painterResource(id = R.drawable.tovinoinstapost),
                    comments = 2474,
                    caption = "<3 <3>",
                    likes = 8970,
                    timeStamp = 12
                ),PostDetails(
                    name = "_prithvi_raj._",
                    dp = painterResource(id = R.drawable.prithvi),
                    post = painterResource(id = R.drawable.prithvi),
                    comments = 8793,
                    caption = "<3 <3>",
                    likes = 11200,
                    timeStamp = 12
                )
                ))

            }
            BottomNavigationMenu(modifier = Modifier.align(Alignment.BottomCenter))
        }

    }
}
@Preview(showBackground = true)
@Composable
fun HomeScreenP(){
    Surface(color = white) {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Transparent)){
            Column(modifier = Modifier.padding(bottom =5.dp)) {
                AppNameSection()
                StoryRow(stories = listOf(
                    StoryDetails(name = "Your Story",
                        displayPicture = painterResource(id = R.drawable.gvm)),
                    StoryDetails(name = "_prithvi_raj._",
                        displayPicture = painterResource(id = R.drawable.prithvi)),
                    StoryDetails(name = "_iamanushka",
                        displayPicture = painterResource(id = R.drawable.anushka)),
                    StoryDetails(name = "_iam_andavar",
                        displayPicture = painterResource(id = R.drawable.kamal)),
                    StoryDetails(name = "_.ljp._",
                        displayPicture = painterResource(id = R.drawable.ljp)),
                    StoryDetails(name = "_.vijay_sethu._",
                        displayPicture = painterResource(id = R.drawable.vjs)),
                    StoryDetails(name = "_nayan_tharaa",
                        displayPicture = painterResource(id = R.drawable.nayan)),
                    StoryDetails(name = "_kunchacks__",
                        displayPicture = painterResource(id = R.drawable.kunchaks)),
                    StoryDetails(name = "_tovino_thomas._",
                        displayPicture = painterResource(id = R.drawable.tovino)),
                    StoryDetails(name = "_urindianflash_._",
                        displayPicture = painterResource(id = R.drawable.minnal))
                ))

                Posts(posts = listOf(PostDetails(
                    name = "_car_enthus",
                    dp = painterResource(id = R.drawable.instapostss),
                    post = painterResource(
                        id = R.drawable.instapostss),
                    caption = "New Beast",
                    likes = 20,
                    comments = 2,
                    timeStamp = 30
                ),PostDetails(
                    name = "_.memer._",
                    dp = painterResource(id = R.drawable.movieinstapost),
                    post = painterResource(id = R.drawable.movieinstapost),
                    comments = 12,
                    caption = "valimai update",
                    likes = 200,
                    timeStamp = 60
                ),PostDetails(
                    name = "_.mottameme._",
                    dp = painterResource(id = R.drawable.instaposts),
                    post = painterResource(id = R.drawable.instaposts),
                    comments = 30,
                    caption = "hahaha..",
                    likes = 247,
                    timeStamp = 2
                ),PostDetails(
                    name = "_tovino_thomas._",
                    dp = painterResource(id = R.drawable.tovino),
                    post = painterResource(id = R.drawable.tovinoinstapost),
                    comments = 2474,
                    caption = "<3 <3>",
                    likes = 8970,
                    timeStamp = 12
                ),PostDetails(
                    name = "_prithvi_raj._",
                    dp = painterResource(id = R.drawable.prithvi),
                    post = painterResource(id = R.drawable.prithvi),
                    comments = 8793,
                    caption = "<3 <3>",
                    likes = 11200,
                    timeStamp = 12
                )
                ))
            }
            BottomNavigationMenu(modifier = Modifier.align(Alignment.BottomCenter))
        }

    }
}

@Composable
fun AppNameSection(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(top = 15.dp, start = 15.dp, end = 15.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Instagram",
            color = textBlack,
            fontFamily = lobster,
            fontSize = 40.sp
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_add_post),
            contentDescription = "add",
            tint = Color.Black,
            modifier = Modifier
                .size(20.dp)
                .offset(x = 62.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_message),
            contentDescription = "message",
            tint = Color.Black,
            modifier = Modifier.size(20.dp)
        )

    }
}
@Composable
fun StoryRow(
    stories:List<StoryDetails>
){
Row(
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.SpaceBetween,
    modifier = Modifier
        .padding(top = 3.dp, start = 15.dp,bottom = 5.dp)
        .fillMaxWidth()
) {
    LazyRow{
        items(stories.size){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(end = 10.dp)
            ) {
                StoryBubble(displayPic = stories[it].displayPicture,size = 70.dp)
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = stories[it].name,color = textBlack,fontSize = 10.sp,fontFamily = roboto)
            }

        }
    }
}
}

@Composable
fun StoryBubble(displayPic:Painter,size:Dp){
    Image(
        painter = displayPic,
        contentDescription = null,
        modifier = Modifier
            .size(size)
            .aspectRatio(
                1f,
                matchHeightConstraintsFirst = true
            )
            .border(
                width = 1.dp,
                brush = Brush.horizontalGradient(colors = listOf(
                    instaColor,
                    instaColor1,
                    instaColor2,
                    instaColor3,
                    instaColor4,
                    instaColor5,
                    instaColor6
                )),
                shape = CircleShape
            )
            .padding(4.dp)
            .clip(CircleShape)
    )

}

@Composable
fun Posts(posts:List<PostDetails>){
    LazyColumn(modifier = Modifier.fillMaxWidth()){
        items(posts.size){
            PostsDesign(posts = posts[it])
        }
    }
}
@Composable
fun PostsDesign(posts:PostDetails){
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(bottom = 15.dp)
            .fillMaxSize()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(
                    horizontal = 10.dp,
                    vertical = 0.5.dp
                )
                .fillMaxSize()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically){
                StoryBubble(displayPic = posts.dp,size = 40.dp)
                Spacer(modifier = Modifier.width(3.dp))
                Text(
                    text = posts.name,
                    fontFamily = instaName,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 20.dp)
                )
            }
            Icon(painter = painterResource(id = R.drawable.ic_baseline_more_vert_24), contentDescription ="more" )
        }
        Image(
            painter = posts.post,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 10.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 3.dp)
        ) {
            Row {
                Icon(painter = painterResource(id = R.drawable.ic_heart), contentDescription ="Like",Modifier.size(30.dp) )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(painter = painterResource(id = R.drawable.ic_speech), contentDescription ="Comment",Modifier.size(30.dp) )
                Spacer(modifier = Modifier.width(10.dp))
                Icon(painter = painterResource(id = R.drawable.ic_email_send), contentDescription ="Send",Modifier.size(30.dp) )
            }
            Icon(painter = painterResource(id = R.drawable.ic_save), contentDescription = "Save",Modifier.size(30.dp))
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = "${posts.likes} likes",fontSize = 15.sp,fontWeight = FontWeight.Bold,modifier = Modifier.padding(horizontal = 10.dp,vertical = 3.dp))
        Row(modifier = Modifier.padding(horizontal = 10.dp,vertical = 0.5.dp)){
            Text(text = posts.name,fontSize = 15.sp,fontWeight = FontWeight.Bold )
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = posts.caption,fontSize = 15.sp,fontWeight = FontWeight.Normal)
        }
        Text(text = "View all ${posts.comments} comments",fontSize = 15.sp,color = textGrey,fontWeight = FontWeight.Light,modifier = Modifier.padding(start = 10.dp,top = 2.dp))
        Spacer(modifier = Modifier.height(3.dp))
        Text(text = "${posts.timeStamp} minutes ago",fontSize = 7.sp,color = textGrey,fontWeight = FontWeight.Normal,modifier = Modifier.padding(start = 10.dp,top = 2.dp))
    }
}
@Composable
fun BottomNavigationMenu(modifier:Modifier=Modifier){
    Row(horizontalArrangement = Arrangement.SpaceAround,verticalAlignment = Alignment.CenterVertically,modifier = modifier.height(55.dp).fillMaxWidth().background(color = white).border(width = 0.5.dp,color = textGrey)) {
        Icon(
            painter = painterResource(id = R.drawable.ic_home),
            contentDescription = "home",
            modifier = modifier.size(20.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "search",
            modifier = modifier.size(20.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_reels),
            contentDescription = "home",
            modifier = modifier.size(20.dp)
        )
        Icon(
            painter = painterResource(id = R.drawable.ic_heart),
            contentDescription = "home",
            modifier = modifier.size(20.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.gvm),
            contentDescription = "Your profile",
            modifier = modifier
                .size(20.dp)
                .clip(CircleShape)
        )

    }
}
