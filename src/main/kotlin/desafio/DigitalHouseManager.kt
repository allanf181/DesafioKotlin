package desafio

import kotlin.coroutines.coroutineContext

class DigitalHouseManager {
    val alunos = mutableListOf<Aluno>()
    val professores = mutableListOf<Professor>()
    val cursos = mutableListOf<Curso>()
    val matriculas = mutableListOf<Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        if(cursos.find { it.codigoDeCurso == codigoCurso } == null){
            cursos.add(Curso(nome, codigoCurso, quantidadeMaximaDeAlunos))
        }
    }

    fun excluirCurso(codigoCurso: Int){
        cursos.removeAll { it.codigoDeCurso == codigoCurso }
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int){
        if(professores.find { it.codigoDeProfessor == codigoProfessor } == null){
            professores.add(ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras))
        }
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, especialidade: String){
        if(professores.find { it.codigoDeProfessor == codigoProfessor } == null){
            professores.add(ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade))
        }
    }

    fun excluirProfessor(codigoProfessor: Int){
        professores.removeAll { it.codigoDeProfessor == codigoProfessor }
    }

    fun registrarAluno(nome: String, sobrenome: String, codigoAluno: Int){
        if(alunos.find { it.codigoDeAluno == codigoAluno } == null){
            alunos.add(Aluno(nome, sobrenome, codigoAluno))
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int){
        val curso = cursos.find { it.codigoDeCurso == codigoCurso }
        val aluno = alunos.find { it.codigoDeAluno == codigoAluno }

        if(curso != null && aluno != null){
            if(curso.adicionarUmAluno(aluno)){
                matriculas.add(Matricula(aluno, curso))
                println("Matricula realizada.")
            }else{
                println("Não foi possível realizar a matricula.")
            }
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int){
        val professorTitular = professores.find { it is ProfessorTitular && it.codigoDeProfessor == codigoProfessorTitular }
        val professorAdjunto = professores.find { it is ProfessorAdjunto && it.codigoDeProfessor == codigoProfessorAdjunto }

        if(cursos.find { it.codigoDeCurso == codigoCurso } != null && professorAdjunto != null && professorTitular != null){
            cursos.find { it.codigoDeCurso == codigoCurso }?.professorAdjunto = professorAdjunto as ProfessorAdjunto
            cursos.find { it.codigoDeCurso == codigoCurso }?.professorTitular = professorTitular as ProfessorTitular
        }
    }

}