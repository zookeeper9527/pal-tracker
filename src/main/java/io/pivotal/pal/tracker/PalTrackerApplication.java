package io.pivotal.pal.tracker;


import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class PalTrackerApplication {


    @Autowired
    TimeEntryRepository timeEntryRepository;

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }

    //@Bean
   // TimeEntryRepository timeEntryRepository(DataSource dataSource){
    //    return new JdbcTimeEntryRepository(dataSource);
    //}

}

