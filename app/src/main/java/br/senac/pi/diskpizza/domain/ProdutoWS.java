package br.senac.pi.diskpizza.domain;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

/**
 * Created by Aluno on 17/12/2015.
 */
public class ProdutoWS {

    private static final String NAMESPACE = "http://exemplows.pi.senac.br";
    private static final String URL = "http://10.19.14.13:8080/ExemploWs/services/UsuarioDAO?wsdl";
    private static final String INSERIR = "insertUsuario";
    private static final String ATUALIZAR = "atualizarUsuario";
    private static final String EXCLUIR = "excluirUsuario";
    private static final String BUSCAR_POR_ID = "buscarUsuarioPorId";
    private static final String BUSCAR_TODOS = "listarTodosUsuarios";

    public boolean insertUsuario(Produto usuario){
        try{
            SoapObject soapObject = new SoapObject(NAMESPACE, INSERIR);
            SoapObject user = new SoapObject(NAMESPACE,"usuario");
            user.addProperty("id",usuario.getId());
            user.addProperty("nome", usuario.getNome());
            //user.addProperty("idade", usuario.getIdade());
            soapObject.addSoapObject(user);
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.implicitTypes = true;
            envelope.setOutputSoapObject(soapObject);
            HttpTransportSE transportSE = new HttpTransportSE(URL);
            transportSE.call("urn:"+INSERIR, envelope);
            Object resposta = envelope.getResponse();
            return Boolean.parseBoolean(resposta.toString());
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
