package repositories;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public final class RepositoryInFactory {

    private RepositoryInFactory(){
        //чтобы не смогли создать обьект этого класса
    }
    public static EmployeesRepository getEmployeesRepository() {
        Properties applicationProperties = new Properties();
        try {
            applicationProperties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String repositoryType = applicationProperties.getProperty("repository.type").toLowerCase();
        if ("memory".equals(repositoryType)) {
            return EmloyeesRepositoryInMemory.getInstance();
        }else if ("postgres".equals(repositoryType)) {
            return EmloyeesRepositoryPostgres.getInstance();
        } else {
            throw new RuntimeException("Invalid Repository type:" + repositoryType);
        }
    }
}

























