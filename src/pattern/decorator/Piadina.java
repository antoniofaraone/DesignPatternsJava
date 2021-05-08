package pattern.decorator;

public class Piadina extends Component{
    private static String description = "Piadina ";

    @Override
    public String prepara() {
        return description;
    }

}
