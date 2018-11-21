import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class CsvVisitor<T> extends AbstractParseTreeVisitor<T> implements CsvParserVisitor<T> {

    @Override
    public T visitCsv_file(CsvParser.Csv_fileContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitInfo(CsvParser.InfoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitRow(CsvParser.RowContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitDir(CsvParser.DirContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitJson_file(CsvParser.Json_fileContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitSvg_file(CsvParser.Svg_fileContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitDot_file(CsvParser.Dot_fileContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitComa(CsvParser.ComaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitEnd(CsvParser.EndContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitBar(CsvParser.BarContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitNombre(CsvParser.NombreContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitRutafichero(CsvParser.RutaficheroContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitRutaficherosalida(CsvParser.RutaficherosalidaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public T visitRutaficherografico(CsvParser.RutaficherograficoContext ctx) {
        return visitChildren(ctx);
    }
}