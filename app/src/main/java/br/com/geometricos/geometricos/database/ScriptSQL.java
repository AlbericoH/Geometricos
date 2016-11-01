package br.com.geometricos.geometricos.database;

public class ScriptSQL {

    public static String getCreateTableConfiguracoes() {
        StringBuilder sqlBiulder = new StringBuilder();

        sqlBiulder.append(" CREATE TABLE IF NOT EXISTS configuracoes(");
        sqlBiulder.append(" som INT NOT NULL, ");
        sqlBiulder.append(" movimentos INT NOT NULL ");
        sqlBiulder.append(" ); ");

        return sqlBiulder.toString();
    }// fim getCreateTableJogos()

    //CONFIGURA JOGO 1
    public static String getInsertConfiguracoes() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO configuracoes (som, movimentos) VALUES (1, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getCreateTableJogos() {
        StringBuilder sqlBiulder = new StringBuilder();

        sqlBiulder.append(" CREATE TABLE IF NOT EXISTS jogos(");
        sqlBiulder.append(" numJogo INT PRIMARY KEY NOT NULL, ");
        sqlBiulder.append(" trava INT NOT NULL ");
        sqlBiulder.append(" ); ");

        return sqlBiulder.toString();
    }// fim getCreateTableJogos()

    public static String getCreateTableFases() {
        StringBuilder sqlBiulder = new StringBuilder();

        sqlBiulder.append(" CREATE TABLE IF NOT EXISTS fases(");
        sqlBiulder.append(" numJogo INT NOT NULL, ");
        sqlBiulder.append(" fase INT NOT NULL, ");
        sqlBiulder.append(" resultado INT NOT NULL ");
        sqlBiulder.append(" ); ");

        return sqlBiulder.toString();
    }// fim getCreateTableFases()


    //CONFIGURA JOGO 1
    public static String getInsertJogo1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (1, 1); "); //jogo1 inicia destravado valor: trava->1
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo1Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (1, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo1Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (1, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 1


    //CONFIGURA JOGO 2
    public static String getInsertJogo2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (2, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo2Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (2, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo2Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (2, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 2


    //CONFIGURA JOGO 3
    public static String getInsertJogo3() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (3, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo3Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (3, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo3Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (3, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo3Fase3() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (3, 3, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 3


    //CONFIGURA JOGO 4
    public static String getInsertJogo4() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (4, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo4Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (4, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo4Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (4, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo4Fase3() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (4, 3, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 4


    //CONFIGURA JOGO 5
    public static String getInsertJogo5() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (5, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo5Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (5, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo5Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (5, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 5


    //CONFIGURA JOGO 6
    public static String getInsertJogo6() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (6, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo6Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (6, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo6Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (6, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo6Fase3() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (6, 3, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 6


    //CONFIGURA JOGO 7
    public static String getInsertJogo7() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (7, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo7Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (7, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo7Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (7, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo7Fase3() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (7, 3, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 7


    //CONFIGURA JOGO 8
    public static String getInsertJogo8() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (8, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo8Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (8, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo8Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (8, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 8


    //CONFIGURA JOGO 9
    public static String getInsertJogo9() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (9, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo9Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (9, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo9Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (9, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo9Fase3() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (9, 3, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo9Fase4() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (9, 4, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo9Fase5() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (9, 5, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 9


    //CONFIGURA JOGO 10
    public static String getInsertJogo10() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO jogos (numJogo, trava) VALUES (10, 0); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo10Fase1() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (10, 1, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo10Fase2() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (10, 2, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo10Fase3() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (10, 3, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo10Fase4() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (10, 4, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo10Fase5() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (10, 5, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo10Fase6() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (10, 6, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()

    public static String getInsertJogo10Fase7() {
        StringBuilder sqlBiulder = new StringBuilder();
        sqlBiulder.append(" INSERT INTO fases (numJogo, fase, resultado) VALUES (10, 7, -100); ");
        return sqlBiulder.toString();
    }// fim getCreateTableFases()
    //FIM CONFIGURA JOGO 10

}//fim class