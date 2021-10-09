
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String click = request.getParameter("edit");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        String[] note = new String[2];
        int i = 0;
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        //note[0] = br.readLine();
        //note[1] = br.readLine();
        
        while((note[i] = br.readLine()) != null) {           
            if(i == 1) {
                break;
            }
            i++;
         }

        Note theNote = new Note(note[0], note[1]);
        request.setAttribute("overallNote", theNote);
        
        br.close();
        
       
        
        if (click == null ) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        return;
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        String title = request.getParameter("the_title");
        String content = request.getParameter("the_content");
        
        Note theNote2 = new Note(title, content);
        request.setAttribute("overallNote", theNote2);
        
        
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        pw.println(title);
        pw.println(content);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        
    }

    

}
