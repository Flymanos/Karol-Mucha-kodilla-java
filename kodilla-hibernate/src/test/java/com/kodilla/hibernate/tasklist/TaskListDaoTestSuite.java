package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.TaskList.TaskList;
import com.kodilla.hibernate.TaskList.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName(){
        final String listName = "Ziemniaki";
        //given
        TaskList taskList = new TaskList(listName, "Lista ziemniaczanych taskow");
        taskListDao.save(taskList);
        //when
        TaskList retrieved = taskListDao.findByListName(listName).get(0);
        //then
        Assert.assertEquals(taskList.getListName(), retrieved.getListName());
        //cleanUp
        taskListDao.delete(taskList.getId());
    }
}
