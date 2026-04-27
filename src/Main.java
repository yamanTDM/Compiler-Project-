import AST.Attribute;
import AST.Program;
import Visitor.JinjaHtmlVisitor;
import antlr.JinjaHtmlLexer;
import antlr.JinjaHtmlParser;
import antlr.PythonLexer;
import antlr.PythonParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
/*

            String source = "Tests/test.txt";
        CharStream input = CharStreams.fromFileName(source);
        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PythonParser parser = new PythonParser(tokens);
        ParseTree ast = parser.file_input();
        PythonVisitor visitor = new PythonVisitor();
        AST2.Program program = (AST2.Program) visitor.visit(ast);
        System.out.println(program.print(""));
   */
/*
        CharStream input = CharStreams.fromString("""
                from flask import Flask, render_template, request, redirect, url_for
                 import json, os
                 from werkzeug.utils import secure_filename
                
                 app = Flask(__name__)
                
                 UPLOAD_FOLDER = "static/uploads"
                 PRODUCT_FILE = "products.json"
                
                 app.config["UPLOAD_FOLDER"] = UPLOAD_FOLDER
                 app.config["MAX_CONTENT_LENGTH"] = 5 * 102_4 * 1024  # 5 MB limit
                 ALLOWED_EXTENSIONS = {"png", "jpg", "jpeg", "gif"}
                
                
                 # ---------------------------
                 # Helpers
                 # ---------------------------
                 def allowed_file(filename):return "." in filename and filename.rsplit(".", 1)[1].lower() in ALLOWED_EXTENSIONS
                
                 def load_products():
                     if not os.path.exists(PRODUCT_FILE):
                         return []
                     with open(PRODUCT_FILE, "r") as f:
                         return json.load(f)
                
                 def save_products(products):
                     with open(PRODUCT_FILE, "w") as f:
                         json.dump(products, f, indent=4)
                
                
                 # Load existing products
                 products = load_products()
                
                
                 # ---------------------------
                 # Routes
                 # ---------------------------
                 @app.route("/")
                 def index():
                     return render_template("index.html", products=products)
                
                
                 @app.route("/product/<int:product_id>")
                 def product_details(product_id):
                     product = next((p for p in products if p["id"] == product_id), None)
                     return render_template("product_details.html", product=product)
                
                
                 @app.route("/add", methods=["GET", "POST"])
                 def add_product():
                     if request.method == "POST":
                
                         name = request.form["name"]
                         price = float(request.form["price"])
                         details = request.form["details"]
                
                         # ------------------------------------
                         # Handle file upload
                         # ------------------------------------
                         file = request.files["image"]
                
                         if file and allowed_file(file.filename):
                             filename = secure_filename(file.filename)
                             filepath = os.path.join(app.config["UPLOAD_FOLDER"], filename)
                             file.save(filepath)
                         else:
                             filename = "no_image.png"  # fallback (place optional file in uploads)
                
                         # Save product
                         new_id = max([p["id"] for p in products], default=0) + 1
                
                         new_product = {
                             "id": new_id,
                             "name": name,
                             "price": price,
                             "details": details,
                             "image": filename,
                         }
                
                         products.append(new_product)
                         save_products(products)
                
                         return redirect(url_for("index"))
                
                     return render_template("add_product.html")
                
                
                 if __name__ == "__main__":
                     if not os.path.exists(UPLOAD_FOLDER):
                         os.makedirs(UPLOAD_FOLDER)
                     app.run(debug=True)
                
                
                
                """);

        PythonLexer lexer = new PythonLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill(); // still ok, but not sufficient alone

        for (Token t : tokens.getTokens()) {
            String name = lexer.getVocabulary().getSymbolicName(t.getType());

            System.out.println(
                    name + " (" + t.getType() + ")"
                            + " line=" + t.getLine()
                            + " col=" + t.getCharPositionInLine()
            );
        }


 */
        String source = "Tests/test4.txt";
        CharStream input = CharStreams.fromFileName(source);
        JinjaHtmlLexer lexer = new JinjaHtmlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JinjaHtmlParser parser = new JinjaHtmlParser(tokens);
        ParseTree ast = parser.prog();
        JinjaHtmlVisitor visitor = new JinjaHtmlVisitor();
        Program program = (Program) visitor.visit(ast);
        System.out.println(program);
    }
}