package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Do the task 17.2";
    private static final String LISTNAME = "Task 17.2";

    @Test
    public void testFindByListName() {

        //GIVEN
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //WHEN
        taskListDao.save(taskList);

        //THEN
        List<TaskList> listWithName = taskListDao.findByListName(taskList.getListName());
        Assert.assertEquals(LISTNAME, listWithName.get(0).getListName());

        //CLEANUP
        int id = listWithName.get(0).getId();
        taskListDao.deleteById(id);


    }

}
