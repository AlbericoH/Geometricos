package br.com.geometricos.geometricos.database;

import android.content.Context;
import android.database.Cursor;
import java.util.ArrayList;
import android.database.sqlite.SQLiteDatabase;

public class Repositorio {

    public static DataBase dataBase = null;

    public Repositorio(Context context){
        if(dataBase == null){
            dataBase = new DataBase(context);
        }
    }//fim Repositorio()

    //retorna a quantidade de jogos destravados trava->1
    public int selectTrava(){
        String sql = "SELECT * FROM jogos WHERE trava = 1 ;";
        SQLiteDatabase db = dataBase.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        return cursor.getCount();
    }//fim selectTrava()

    public void updateDestravaJogo(int numJogo){
        String sql = "UPDATE jogos SET trava=1 WHERE numJogo = " + numJogo + ";";
        SQLiteDatabase db = dataBase.getWritableDatabase();
        db.execSQL(sql);
    }//fim addItens()

    public void updateFases(int numJogo, int fase, int resultado){
        String sql = "UPDATE fases SET resultado=" + resultado + " WHERE numJogo = " + numJogo + " AND fase = " + fase + ";";
        SQLiteDatabase db = dataBase.getWritableDatabase();
        db.execSQL(sql);
    }//fim addItens()

    //seleciona os jogos que nao foram resolvidos
    public ArrayList<Integer> selectResultado(int numJogo){
        String sql = "SELECT * FROM fases WHERE (numJogo = " + numJogo + " AND resultado = -100);";
        SQLiteDatabase db = dataBase.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        ArrayList<Integer> arrayList = null;

        if(cursor != null && cursor.moveToFirst()){
            arrayList = new ArrayList<Integer>();

            do {
                arrayList.add(cursor.getInt(0));
                arrayList.add(cursor.getInt(1));
                arrayList.add(cursor.getInt(2));
            }while (cursor.moveToNext());

        }//fim if

        return arrayList;
    }//fim selectResultado()

    //seleciona os valores dos jogos resolvidos
    public ArrayList<Integer> setResultado(int numJogo){
        String sql = "SELECT (resultado) FROM fases WHERE numJogo = " + numJogo + ";";
        SQLiteDatabase db = dataBase.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        ArrayList<Integer> arrayList = null;

        if(cursor != null && cursor.moveToFirst()){
            arrayList = new ArrayList<Integer>();

            do{
                arrayList.add(cursor.getInt(0));
            }while (cursor.moveToNext());

        }//fim if

        return arrayList;
    }//fim selectResultado()

    //reseta o jogo por completo
    public void reset(){
        String sql = "UPDATE fases SET resultado = -100 WHERE 1 ;";
        SQLiteDatabase db = dataBase.getWritableDatabase();
        db.execSQL(sql);

        String sql2 = "UPDATE jogos SET trava = 0 WHERE numJogo != 1 ;";
        SQLiteDatabase db2 = dataBase.getWritableDatabase();
        db2.execSQL(sql2);
    }//fim reset()

    //apenas para verificar se o banco esta sendo populado
    public ArrayList<Integer> buscar(){
        //String sql = "SELECT * FROM fases;";
        String sql = "SELECT * FROM fases WHERE (resultado = -100);";
        SQLiteDatabase db = dataBase.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        ArrayList<Integer> arrayList = null;

        if(cursor != null && cursor.moveToFirst()){
            arrayList = new ArrayList<Integer>();

            do {
                arrayList.add(cursor.getInt(0));
                arrayList.add(cursor.getInt(1));
                arrayList.add(cursor.getInt(2));
            }while (cursor.moveToNext());

        }//fim if

        return arrayList;
    }//fim buscar()

    //select SOM
    public int selectSom() {
        String sql = "SELECT som FROM configuracoes WHERE 1;";
        SQLiteDatabase db = dataBase.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        cursor.moveToFirst();
        int som = cursor.getInt(0);

        return som;
    }//fim selectResultado()

    //configura do SOM
    public int updateSom() {
        String sql = null;
        SQLiteDatabase db = dataBase.getWritableDatabase();

        int som = selectSom();

        if(som == 0){
            sql = "UPDATE configuracoes SET som=1 WHERE 1;";
            db.execSQL(sql);
            som = 1;
        }else if(som == 1){
            sql = "UPDATE configuracoes SET som=0 WHERE 1;";
            db.execSQL(sql);
            som = 0;
        }//fim else

        return som; //serve para setar o icon do som
    }//fim selectResultado()

}//fim class