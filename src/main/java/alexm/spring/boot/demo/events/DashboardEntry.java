package alexm.spring.boot.demo.events;

import alexm.spring.boot.demo.github.RepositoryEvent;

import java.util.List;

/**
 * @author AlexM
 */
public class DashboardEntry {
    private final GithubProject project;
    private final List<RepositoryEvent> events;

    public DashboardEntry(GithubProject project, List<RepositoryEvent> events) {
        this.project = project;
        this.events = events;
    }

    public GithubProject getProject() {
        return project;
    }

    public List<RepositoryEvent> getEvents() {
        return events;
    }
}
