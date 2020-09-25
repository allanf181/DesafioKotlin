package desafio

fun main() {
    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarProfessorTitular("um", "professor titular", 1, "kotlin")
    digitalHouseManager.registrarProfessorTitular("dois", "professor titular", 2, "android")

    digitalHouseManager.registrarProfessorAdjunto("um", "professor adjunto", 3, 40)
    digitalHouseManager.registrarProfessorAdjunto("dois", "professor adjunto", 4, 40)

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessores(20001, 1, 3)
    digitalHouseManager.alocarProfessores(20002, 2, 4)

    digitalHouseManager.registrarAluno("aluno", "um", 1)
    digitalHouseManager.registrarAluno("aluno", "dois", 2)
    digitalHouseManager.registrarAluno("aluno", "três", 3)
    digitalHouseManager.registrarAluno("aluno", "quatro", 4)
    digitalHouseManager.registrarAluno("aluno", "cinco", 5)

    digitalHouseManager.matricularAluno(1, 20001)
    digitalHouseManager.matricularAluno(2, 20001)
    digitalHouseManager.matricularAluno(3, 20002)
    digitalHouseManager.matricularAluno(4, 20002)
    digitalHouseManager.matricularAluno(5, 20002)
}