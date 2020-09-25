package desafio

class Curso(val nome: String, val codigoDeCurso: Int, val maximoDeAlunos: Int) {

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto

    val alunosMatriculados = mutableListOf<Aluno>()

    override fun equals(other: Any?): Boolean {
        return (other as? Curso)?.codigoDeCurso == this.codigoDeCurso
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if (alunosMatriculados.find { it == umAluno } == null && alunosMatriculados.size < maximoDeAlunos){
            alunosMatriculados.add(umAluno)
            true
        } else {
            false
        }
    }

    fun excluirAluno(umAluno: Aluno){
        alunosMatriculados.remove(umAluno)
    }
}