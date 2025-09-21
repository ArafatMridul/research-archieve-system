interface ResearchPaper {
    void view();
}

final class FullResearchPaper implements ResearchPaper {
    public FullResearchPaper() {
        view();
    }

    @Override 
    public void view() {
        System.out.print("FULL PDF");
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
}

public class Task {
    public static void main(String[] args) {
        FullResearchPaper frp = new FullResearchPaper();
        
        FullOnView fov = new FullOnView(frp);
        fov.view();
    }
}
