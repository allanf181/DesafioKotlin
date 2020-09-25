package desafio

open class Professor(val nome: String, val sobrenome: String, var tempoDeCasa: Int, val codigoDeProfessor: Int) {
    override fun equals(other: Any?): Boolean {
        return (other as? Professor)?.codigoDeProfessor == this.codigoDeProfessor
    }
}