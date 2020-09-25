package desafio

class Aluno(val nome: String, val sobrenome: String, val codigoDeAluno: Int) {
    override fun equals(other: Any?): Boolean {
        return (other as? Aluno)?.codigoDeAluno == this.codigoDeAluno
    }
}