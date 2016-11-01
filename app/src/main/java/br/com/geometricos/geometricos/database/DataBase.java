package br.com.geometricos.geometricos.database;

import android.content.Context;
import android.database.sqlite.*;

public class DataBase extends SQLiteOpenHelper {

    private static String NOME_BANCO = "geometric";
    private static int VERSAO_BANCO = 1;

    public DataBase(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScriptSQL.getCreateTableConfiguracoes());
        db.execSQL(ScriptSQL.getInsertConfiguracoes());

        db.execSQL(ScriptSQL.getCreateTableJogos());
        db.execSQL(ScriptSQL.getCreateTableFases());

        db.execSQL(ScriptSQL.getInsertJogo1());
        db.execSQL(ScriptSQL.getInsertJogo1Fase1());
        db.execSQL(ScriptSQL.getInsertJogo1Fase2());

        db.execSQL(ScriptSQL.getInsertJogo2());
        db.execSQL(ScriptSQL.getInsertJogo2Fase1());
        db.execSQL(ScriptSQL.getInsertJogo2Fase2());

        db.execSQL(ScriptSQL.getInsertJogo3());
        db.execSQL(ScriptSQL.getInsertJogo3Fase1());
        db.execSQL(ScriptSQL.getInsertJogo3Fase2());
        db.execSQL(ScriptSQL.getInsertJogo3Fase3());

        db.execSQL(ScriptSQL.getInsertJogo4());
        db.execSQL(ScriptSQL.getInsertJogo4Fase1());
        db.execSQL(ScriptSQL.getInsertJogo4Fase2());
        db.execSQL(ScriptSQL.getInsertJogo4Fase3());

        db.execSQL(ScriptSQL.getInsertJogo5());
        db.execSQL(ScriptSQL.getInsertJogo5Fase1());
        db.execSQL(ScriptSQL.getInsertJogo5Fase2());

        db.execSQL(ScriptSQL.getInsertJogo6());
        db.execSQL(ScriptSQL.getInsertJogo6Fase1());
        db.execSQL(ScriptSQL.getInsertJogo6Fase2());
        db.execSQL(ScriptSQL.getInsertJogo6Fase3());

        db.execSQL(ScriptSQL.getInsertJogo7());
        db.execSQL(ScriptSQL.getInsertJogo7Fase1());
        db.execSQL(ScriptSQL.getInsertJogo7Fase2());
        db.execSQL(ScriptSQL.getInsertJogo7Fase3());

        db.execSQL(ScriptSQL.getInsertJogo8());
        db.execSQL(ScriptSQL.getInsertJogo8Fase1());
        db.execSQL(ScriptSQL.getInsertJogo8Fase2());

        db.execSQL(ScriptSQL.getInsertJogo9());
        db.execSQL(ScriptSQL.getInsertJogo9Fase1());
        db.execSQL(ScriptSQL.getInsertJogo9Fase2());
        db.execSQL(ScriptSQL.getInsertJogo9Fase3());
        db.execSQL(ScriptSQL.getInsertJogo9Fase4());
        db.execSQL(ScriptSQL.getInsertJogo9Fase5());

        db.execSQL(ScriptSQL.getInsertJogo10());
        db.execSQL(ScriptSQL.getInsertJogo10Fase1());
        db.execSQL(ScriptSQL.getInsertJogo10Fase2());
        db.execSQL(ScriptSQL.getInsertJogo10Fase3());
        db.execSQL(ScriptSQL.getInsertJogo10Fase4());
        db.execSQL(ScriptSQL.getInsertJogo10Fase5());
        db.execSQL(ScriptSQL.getInsertJogo10Fase6());
        db.execSQL(ScriptSQL.getInsertJogo10Fase7());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}//fim class
