package com.example.lab01layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab01layout.ui.theme.LAB01layoutTheme

data class Person(val name:String,
                  val studentID:String,
                  val imageID:Int)


class MainActivity : ComponentActivity() {
    var persons: List<Person> = listOf(
        Person("นายกมล จันบุตรดี","643450063-8",R.drawable.ake),
        Person("นายจักรพรรดิ์ อนุไพร","643450065-4",R.drawable.dew),
        Person("นายเจษฎา ลีรัตน์","643450067-0",R.drawable.pat),
        Person("นายชาญณรงค์ แต่งเมือง","643450069-6",R.drawable.jiab),
        Person("นายณัฐกานต์ อินทรพานิชย์","643450072-7",R.drawable.pochacco_pfp),
        Person("นางสาวทัศนีย์ มลาตรี","643450075-1",R.drawable.tuk),
        Person("นายธนาธิป เตชะ","643450076-9",R.drawable.j),
        Person("นายปรเมศวร์ สิทธิมงคล","643450078-5",R.drawable.make),
        Person("นายประสิทธิชัย จันทร์สม","643450079-3",R.drawable.fa),
        Person("นางสาวพรธิตา ขานพล","643450080-8",R.drawable.beam1),
        Person("นายพีระเดช โพธิ์หล้า","643450082-4",R.drawable.peet),
        Person("นายวิญญู พรมภิภักดิ์","643450084-0",R.drawable.manyu),
        Person("นางสาวศรสวรรค์ ไพรอนันต์","643450085-8",R.drawable.bow),
        Person("นายศรันย์ ซุ่นเส้ง","643450086-6",R.drawable.moss),
        Person("นางสาวสุธาดา โสภาพ","643450089-0",R.drawable.neoy),
        Person("นายอภิทุน ดวงจันทร์คล้อย","643450092-1",R.drawable.pond),
        Person("นางสาวอมรรัตน์ มาระเหว","643450094-7",R.drawable.tey1),
        Person("นายอรัญ ศรีสวัสดิ์","643450095-5",R.drawable.pure),
        Person("นางสาวกฤติยา สินโพธิ์","643450320-4",R.drawable.kak),
        Person("นายก้องภพ ตาดี","643450321-2",R.drawable.del),
        Person("นายเกรียงศักดิ์ หมู่เมืองสอง","643450322-0",R.drawable.singto),
        Person("นายเจษฏา พบสมัย","643450323-8",R.drawable.bank),
        Person("นายเทวารัณย์ ชัยกิจ","643450324-6",R.drawable.run),
        Person("นายธนบดี สวัสดี","643450325-4",R.drawable.team),
        Person("นางสาวนภัสสร ดวงจันทร์","643450326-2",R.drawable.cream),
        Person("นางสาวนภาปิลันธ์ ชาวชายโขง","643450327-0",R.drawable.nat),
        Person("นางสาววรรณภา เบ้านาค","643450330-1",R.drawable.nim),
        Person("นายศุภชัย แสนประสิทธิ์","643450332-7",R.drawable.beam2),
        Person("นางสาวอฆพร ไร่ขาม","643450334-3",R.drawable.molla),
        Person("นายกฤตวัฒน์ อินทรสิทธิ์","643450644-8",R.drawable.kaofang),
        Person("นางสาวณัฐธิดา บุญพา","643450647-2",R.drawable.jan),
        Person("นายรัตพงษ์ ปานเจริญ","643450650-3",R.drawable.tey2)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LAB01layoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background) {
                    LazyColumn {
                        items(persons){
                            data -> Personlist(data)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Personlist(data:Person){
    Row() {
        Image(
            painter = painterResource(id = data.imageID),
            contentDescription = data.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
        )
        Column(modifier = Modifier.padding(4.dp),
            verticalArrangement = Arrangement.Center) {
            Text(data.name)
            Text(data.studentID)
        }
    }
}

