package com.example.projeto_sobre

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity_Guilherme_Gomes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Criação do ScrollView para permitir rolagem
        val scrollView = ScrollView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        }

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16, 16, 16, 16)
        }

        val titleTextView = TextView(this).apply {
            text = "Sobre Guilherme Gomes Andrade"
            textSize = 24f
            setTextColor(Color.BLACK)
        }

        val imageView = ImageView(this).apply {
            setImageResource(R.drawable.guilherme_gomes)
            layoutParams = LinearLayout.LayoutParams(600, 600).apply {
                setMargins(0, 30, 0, 30) // Adiciona margens para espaçamento
            }
        }

        val descriptionTextView = TextView(this).apply {
            text = "Guilherme Gomes é um jovem desenvolvedor de software de 22 anos, que reside na vibrante cidade de Recife, Pernambuco. " +
                    "Com um espírito curioso e uma paixão inabalável pela tecnologia, Guilherme está sempre em busca de novas maneiras de usar suas habilidades " +
                    "para criar soluções inovadoras e impactantes no mundo da programação.\n\n" +
                    "Atualmente, ele estuda na Universidade Católica de Pernambuco (UNICAP), onde dedica seu tempo e energia ao curso de Ciências da Computação. " +
                    "A escolha pela UNICAP foi motivada pelo desejo de aprofundar seus conhecimentos na área tecnológica, aprimorar suas habilidades e, principalmente, " +
                    "se conectar com uma comunidade acadêmica que compartilha seu entusiasmo pelo desenvolvimento de software e inovação.\n\n" +
                    "Desde cedo, Guilherme sempre teve uma inclinação natural para entender o funcionamento das coisas ao seu redor. " +
                    "Esse interesse se transformou em uma paixão pela programação, onde encontrou um mundo repleto de possibilidades para criar e transformar ideias em realidade. " +
                    "Através do desenvolvimento de software, ele descobriu que poderia construir soluções práticas e criativas que pudessem impactar a vida das pessoas de maneira significativa.\n\n" +
                    "Como desenvolvedor, Guilherme se destaca por sua capacidade de aprendizado rápido e sua disposição para enfrentar novos desafios. " +
                    "Ele está sempre atualizado com as últimas tendências tecnológicas e procura expandir seus conhecimentos em diferentes linguagens de programação, frameworks e metodologias de desenvolvimento. " +
                    "Além disso, sua dedicação ao aprimoramento constante faz com que ele esteja sempre buscando novas oportunidades para aplicar suas habilidades e contribuir de maneira significativa em projetos nos quais esteja envolvido.\n\n" +
                    "Guilherme é um profissional dedicado, que acredita no poder da colaboração e na importância de trabalhar em equipe. " +
                    "Para ele, a troca de conhecimentos e experiências com outros desenvolvedores e profissionais é essencial para o crescimento pessoal e profissional. " +
                    "Ele valoriza ambientes de trabalho que incentivam a criatividade, a inovação e o desenvolvimento contínuo.\n\n" +
                    "Além de sua paixão pelo desenvolvimento de software, Guilherme é um amante da cultura local de Recife. " +
                    "Ele aprecia a diversidade cultural e as tradições de sua cidade, e busca sempre equilibrar sua vida profissional com momentos de lazer e descontração. " +
                    "Nas horas vagas, Guilherme gosta de explorar novos lugares, experimentar a culinária local e se conectar com a rica história e a beleza natural da região.\n\n" +
                    "Com uma carreira promissora pela frente, Guilherme Gomes continua a se destacar como um desenvolvedor de software dedicado e apaixonado, sempre buscando aprender, crescer e contribuir com suas habilidades para o desenvolvimento de soluções tecnológicas que façam a diferença. " +
                    "Sua trajetória até aqui demonstra que ele possui o talento e a determinação necessários para se tornar um nome de destaque na área de tecnologia e inovação, não apenas em Recife, mas em todo o Brasil."
            textSize = 16f
            setTextColor(Color.BLACK)
        }

        val backButton = Button(this).apply {
            text = "Voltar"
            setOnClickListener {
                finish()
            }
        }

        layout.addView(titleTextView)
        layout.addView(imageView)
        layout.addView(descriptionTextView)
        layout.addView(backButton)

        // Adiciona o layout dentro do ScrollView
        scrollView.addView(layout)

        // Define o ScrollView como o conteúdo da Activity
        setContentView(scrollView)
    }
}
