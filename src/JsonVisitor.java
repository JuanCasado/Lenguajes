package antlr;

import java.util.*;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

class JsonVisitor extends JsonParserBaseVisitor<void> {



    public JsonVisitor(JsonTable Jsontable){
       rowClass = JsonTable.getClass();

    }
}