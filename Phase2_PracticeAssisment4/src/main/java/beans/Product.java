package beans;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String color = request.getParameter("color");
			float price = Float.parseFloat(request.getParameter("price"));

			ProductClass product = new ProductClass(id, name, color, price);

			HttpSession session = request.getSession();
			ArrayList<ProductClass> productList = (ArrayList<ProductClass>) session.getAttribute("data");
			if (productList == null) {
				productList = new ArrayList<ProductClass>();
			}
			productList.add(product);
			session.setAttribute("data", productList);

			request.setAttribute("data", productList);
			request.getRequestDispatcher("profile.jsp").forward(request, response);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
