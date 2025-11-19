import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.grupo2.ibudget.R
import com.grupo2.ibudget.ui.theme.IbudgetTheme
import com.grupo2.ibudget.ui.theme.RosaClaro


@Composable
fun Consejos() {

    val mensaje1 = "Separa una parte de tu dinero para ahorrar antes de empezar a gastar o uarda una parte.Asi tendras un fondo para tus metas"
    val mensaje2 = "No gastes todos los días en cosas pequeñas como dulces o bebidas. Esos gastos parecen pocos, pero al final del mes podrías haber ahorrado mucho"
    val mensaje3 = "Define qué quieres lograr con tu ahorro, como comprar materiales, salidas o un celular. Tener un propósito te motiva a seguir ahorrando"
    val mensaje4 = "Usa tu dinero así: 50% para tus necesidades (transporte, comida), 30% para gustos, y 20% para ahorrar o invertir en tus estudios"
    val mensaje5 = "Cada vez que te sobre dinero, guárdalo. Ese cambio puede ayudarte a pagar útiles o algo que necesites en el colegio"
    val mensaje6 = "Propónte guardar un poco más cada semana. Por ejemplo, empieza con \$2.000 y aumenta poco a poco. Verás cuánto logras sin darte cuenta"


    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
        .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.luz),
            contentDescription = "luz rosada",
            modifier = Modifier.size(140.dp), contentScale = ContentScale.Crop

        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Consejos de ahorro",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color.Black,
        )

        Spacer(modifier = Modifier.height(50.dp))

        ElevatedCard(colors = CardDefaults.cardColors(containerColor = RosaClaro), onClick = {

        }){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ){

                Text(
                    text = " Ahorra primero, gasta despues ",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )

            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        ElevatedCard(colors = CardDefaults.cardColors(containerColor = RosaClaro)){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ){

                Text(
                    text = " Evita los gastos hormiga",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )

            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        ElevatedCard(colors = CardDefaults.cardColors(containerColor = RosaClaro)){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ){

                Text(
                    text = " Establece una meta clara",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )

            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        ElevatedCard(colors = CardDefaults.cardColors(containerColor = RosaClaro)){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ){

                Text(
                    text = " Aplica la regla del 50/30/20",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )

            }
        }

        Spacer(modifier = Modifier.height(15.dp))



        ElevatedCard(colors = CardDefaults.cardColors(containerColor = RosaClaro)){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ){

                Text(
                    text = " Ahorra tu cambio ",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )

            }
        }

        Spacer(modifier = Modifier.height(15.dp))

        ElevatedCard(colors = CardDefaults.cardColors(containerColor = RosaClaro)){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp), verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center

            ){

                Text(
                    text = " Haz un reto de ahorro semanal",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )

            }
        }







    }





}




@Preview(showBackground = true)
@Composable
fun ConsejosPreview () {
    IbudgetTheme {
        Consejos()
    }
}


