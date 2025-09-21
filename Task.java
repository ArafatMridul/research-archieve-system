interface ResearchPaper {
    void view();
    String getAuthorName();
    String getPublicationYear();
}

final class FullResearchPaper implements ResearchPaper {
    public FullResearchPaper() {
        view();
    }

    @Override 
    public void view() {
        System.out.print("FULL PDF");
    }

    @Override
    public String getAuthorName() {
        return "Author";
    }
    public String getPublicationYear() {
        return "2025";
    }
}

class FullOnView implements ResearchPaper {
    public FullResearchPaper researchPaper = null;

    public FullOnView(FullResearchPaper fs) {
        this.researchPaper = fs;
    }

    @Override
    public void view() {
        System.out.println();
        researchPaper.view();
        System.out.println(" By calling view()");
    }

    @Override
    public String getAuthorName() {
        return "Author";
    }
    public String getPublicationYear() {
        return "2025";
    }
}

public class Task {
    public static void main(String[] args) {
        FullResearchPaper frp = new FullResearchPaper();
        
        FullOnView fov = new FullOnView(frp);
        fov.view();
        
        System.out.println(fov.getAuthorName());
        System.out.println(fov.getPublicationYear());
    }
}
