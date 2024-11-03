package Command;

import Logic.UniversityService;

public class SortByWeightedAssessmentCommand implements ICommand{
    private UniversityService service;

    public SortByWeightedAssessmentCommand(UniversityService service){
        this.service = service;
    }

    @Override
    public void execute() {
        this.service.sortByWeightedAssessment();
    }

    @Override
    public String description() {
        return "Сортирова по взвешенной оценке по пяти показателям по отношению к количеству штатных преподавателей";
    }
}
