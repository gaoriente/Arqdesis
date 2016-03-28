package controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Cliente;
import to.ClienteTO;
/**
* Servlet implementation class ManterClienteController
*/
@WebServlet("/ManterCliente.do")
public class ManterClienteController extends HttpServlet {
private static final long serialVersionUID = 1L;
/**
* @see HttpServlet#doGet(HttpServletRequest request,
HttpServletResponse
* response)
*/
protected void doGet(HttpServletRequest request,
HttpServletResponse response) throws ServletException,
IOException {
doPost(request, response);
}
/**
* @see HttpServlet#doPost(HttpServletRequest request,
HttpServletResponse
* response)
*/
protected void doPost(HttpServletRequest request,
HttpServletResponse response) throws ServletException,
IOException {
String pAcao = request.getParameter("acao");
String pId = request.getParameter("id");
String pNome = request.getParameter("nome");
String pFone = request.getParameter("fone");
int id = -1;
try {
id = Integer.parseInt(pId);
} catch (NumberFormatException e) {
}
Cliente cliente = new Cliente(id, pNome, pFone);
if (pAcao.equals("Inserir")) {
cliente.criar();
} else if (pAcao.equals("Excluir")) {
cliente.excluir();
} else if (pAcao.equals("Alterar")) {
cliente.atualizar();
}
cliente.carregar();
ClienteTO to = new ClienteTO();
to.setId(cliente.getId());
to.setNome(cliente.getNome());
to.setFone(cliente.getFone());
request.setAttribute("cliente", to);
RequestDispatcher view =
request.getRequestDispatcher("Cliente.jsp");
view.forward(request, response);
}
}