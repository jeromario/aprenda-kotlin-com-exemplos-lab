// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        for ( usuario in usuarios){
            inscritos.add(usuario)
            println("${usuario.nome}, matriculado na formação de ${this.nome} com sucesso!")
            
        }
        
    }
}

fun main() {
   
    val java = ConteudoEducacional("Java",120)
    val python = ConteudoEducacional("Python", 120)
    val mysql = ConteudoEducacional("MySQL")
      
    val backend = Formacao("Back-End",Nivel.AVANCADO,mutableListOf(java,mysql))
    val dataScientist = Formacao("Data Scientist", Nivel.INTERMEDIARIO,mutableListOf(python,mysql))
    
    val aluno1 = Usuario("Jefferson")
    val aluno2 = Usuario("Sandrele")
    val aluno3 = Usuario("Beatriz")
    
    println(backend)
    println(dataScientist)
    println()
    backend.matricular(aluno1,aluno2)
    println()
    println("Alunos inscritos no curso de Back-End: ${backend.inscritos}")
    println()
    dataScientist.matricular(aluno3,aluno1)
    println()
    println("Alunos inscritos no curso de Data Scientist: ${dataScientist.inscritos}")
}
