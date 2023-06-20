import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication2.R


//UI OBJECT
object mdui {

    @Composable
        fun Ui(){
        //Columna central
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())

        ){


        //Torre Eiffel Element
        Column(
            modifier = Modifier
                .fillMaxSize()


            ,
            horizontalAlignment = Alignment.CenterHorizontally,


        ){
            Text(
                text="Torre Eiffel",
                fontSize= 30.sp,
                modifier = Modifier
                    .paddingFromBaseline(top = 125.dp)



            )
            Image(
                painter = painterResource(id = R.drawable.torreeiffel),
                contentDescription = "Image",
            )
        }
        //Torre de Pisa element
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Text(
                text="Torre de Pisa",
                fontSize= 30.sp,
                modifier = Modifier
                    .paddingFromBaseline(top = 60.dp)



            )
            Image(
                painter = painterResource(id = R.drawable.torrede),
                contentDescription = "Image",
            )
        }
            //Sagrada Familia element
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Text(
                text="La Sagrada Familia",
                fontSize= 30.sp,
                modifier = Modifier
                    .paddingFromBaseline(top = 60.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.sagradafamilia),
                contentDescription = "Image",
            )
        }
            //Muralla china element
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Text(
                    text="La Gran Muralla China",
                    fontSize= 30.sp,
                    modifier = Modifier
                        .paddingFromBaseline(top = 60.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.muralla),
                    contentDescription = "Image",
                )
            }
            //void element
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Text(
                    text="",
                    fontSize= 30.sp,
                    modifier = Modifier
                        .paddingFromBaseline(top = 60.dp)
                )

            }

        }
    }


}