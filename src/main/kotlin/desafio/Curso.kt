package desafio

class Curso(val nome: String, val codigoDeCurso: Int) {
    override fun equals(other: Any?): Boolean {
        return (other as? Curso)?.codigoDeCurso == this.codigoDeCurso
    }
}