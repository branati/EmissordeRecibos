package br.com.rcmf.emissorderecibos.database;

/**
 * Created by renato on 11/03/16.
 */
public class ScriptSQL {

    public static String getCreateCliente() {

        StringBuilder sqlBuilder = new StringBuilder();

        sqlBuilder.append(" CREATE TABLE IF NOT EXISTS CLIENTE ( ");
        sqlBuilder.append(" _id INTEGER NOT NULL ");
        sqlBuilder.append(" PRIMARY KEY AUTOINCREMENT, ");
        sqlBuilder.append(" NOME VARCHAR(255) NOT NULL, ");
        sqlBuilder.append(" TELEFONE VARCHAR(14), ");
        sqlBuilder.append(" EMPRESA VARCHAR(255), ");
        sqlBuilder.append(" CPFCNPJ VARCHAR(255), ");
        sqlBuilder.append(" EMAIL VARCHAR(255) ");
        sqlBuilder.append(");");

        return sqlBuilder.toString();


    }

    public static String getCreateRecibo() {

        StringBuilder sqlBuilder2 = new StringBuilder();

        sqlBuilder2.append(" CREATE TABLE IF NOT EXISTS RECIBO ( ");
        sqlBuilder2.append(" _id INTEGER NOT NULL ");
        sqlBuilder2.append(" KEY AUTOINCREMENT, ");
        sqlBuilder2.append(" ID_CLIENTE INTEGER NOT NULL, ");
        sqlBuilder2.append(" VALOR DECIMAL(10,2) NOT NULL, ");
        sqlBuilder2.append(" DATA DATE NOT NULL,");
        sqlBuilder2.append(" OBSERVACOES VARCHAR(255) ");
        sqlBuilder2.append(");");

        return sqlBuilder2.toString();


    }

    public static String getCreateParametros() {

        StringBuilder sqlBuilder3 = new StringBuilder();

        sqlBuilder3.append(" CREATE TABLE IF NOT EXISTS PARAMETROS ( ");
        sqlBuilder3.append(" _id INTEGER NOT NULL ");
        sqlBuilder3.append(" KEY AUTOINCREMENT, ");
        sqlBuilder3.append(" NOMEEMISSOR VARCHAR(255), ");
        sqlBuilder3.append(" TELEFONE VARCHAR(14), ");
        sqlBuilder3.append(" CPFCNPJ VARCHAR(25), ");
        sqlBuilder3.append(" NUMEROULTIMORECIBO DECIMAL(15,0) ");
        sqlBuilder3.append(");");

        return sqlBuilder3.toString();


    }

}
