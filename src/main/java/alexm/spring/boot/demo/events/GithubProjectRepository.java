package alexm.spring.boot.demo.events;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface GithubProjectRepository extends PagingAndSortingRepository<GithubProject, Long> {

    GithubProject findByRepoName(String repoName);

}
